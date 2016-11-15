package btmouse;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;  
import java.util.Date;  
import javax.bluetooth.LocalDevice;  
import javax.bluetooth.ServiceRecord;  
import javax.microedition.io.Connector;  
import javax.microedition.io.StreamConnection;  
import javax.microedition.io.StreamConnectionNotifier;  
import java.io.InputStream;  
import java.io.OutputStream;  
 
 
 
public class RfcommServer {  
  
    //Standard SerialPortService ID  
    static final String serverUUID = "0000110100001000800000805f9b34fb";  
    //static final String serverUUID = "11111111111111111111111111111123";  
  
    private StreamConnectionNotifier server = null; 
    
	int getX = 0, getY = 0;

	public static Robot robot;
	
    public RfcommServer() throws IOException {  
  
        server = (StreamConnectionNotifier) Connector.open(  
                "btspp://localhost:" + serverUUID,  
                Connector.READ_WRITE, true  
        );  
          
        ServiceRecord record = LocalDevice.getLocalDevice().getRecord(server);  
        LocalDevice.getLocalDevice().updateRecord(record);
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }  
 
   
    public Session accept() throws IOException {  
        log("Accept");  
        StreamConnection channel = server.acceptAndOpen();  
        log("Connected");  
        return new Session(channel);  
    }  
    public void dispose() {  
        log("Dispose");  
        if (server  != null) try {server.close();} catch (Exception e) {/*ignore*/}  
    }  
  
  
    static class Session implements Runnable {  
        private StreamConnection channel = null;  
        private InputStream btIn = null;  
        private OutputStream btOut = null;  
    	int tmpX = 0;
    	int tmpY = 0;
  
        public Session(StreamConnection channel) throws IOException {  
            this.channel = channel;  
            this.btIn = channel.openInputStream();  
            this.btOut = channel.openOutputStream();  
        }  
  
      
        public void run() {  
            try {  
                byte[] buff = new byte[512];  
                int n = 0;  
                while ((n = btIn.read(buff)) > 0) {  
                    String data = new String(buff, 0, n);  
                    String[] arrdata = data.split(" ");
                    log("Receive:"+data);  
                    if(arrdata.length == 3){
                    	int getX = Integer.parseInt(arrdata[0]);
                    	int getY = Integer.parseInt(arrdata[1]);
	                        PointerInfo a = MouseInfo.getPointerInfo();
	                    	Point p = a.getLocation();
	                    	Robot robot = new Robot();
	                    	robot.mouseMove(p.x + getY,p.y + getX);
                    }else if(Integer.parseInt(arrdata[0]) == 1){
                    	robot.mousePress(InputEvent.BUTTON1_MASK);
                    }else if(Integer.parseInt(arrdata[0]) == 2){
                    	robot.mouseRelease(InputEvent.BUTTON1_MASK);
                    }else if(Integer.parseInt(arrdata[0]) == 3){
                    	robot.mousePress(InputEvent.BUTTON3_MASK);
                    }else if(Integer.parseInt(arrdata[0]) == 4){
                    	robot.mouseRelease(InputEvent.BUTTON3_MASK);
                    }
                    btOut.write(data.getBytes());  
                    btOut.flush();  
                }  
            } catch (Throwable t) {  
                t.printStackTrace();  
            } finally {  
                close();  
            }  
        }  
        public void close() {  
            log("Session Close");  
            if (btIn    != null) try {btIn.close();} catch (Exception e) {/*ignore*/}  
            if (btOut   != null) try {btOut.close();} catch (Exception e) {/*ignore*/}  
            if (channel != null) try {channel.close();} catch (Exception e) {/*ignore*/}  
        }  
    }  
  
  
    public static void main(String[] args) throws Exception {  
          
        RfcommServer server = new RfcommServer();  
          
        while (true) {  
            Session session = server.accept();  
            new Thread(session).start();  
        }  
         
    }  
      
    private static void log(String msg) {  
        System.out.println("["+(new Date()) + "] " + msg);  
    }  
}  
