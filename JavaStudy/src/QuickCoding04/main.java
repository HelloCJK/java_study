package QuickCoding04;

public class main {

	public static BankAccount account = new BankAccount();
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread depositMan = new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				while(!this.isInterrupted()){
					account.add(10);
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		Thread withdrawMan = new Thread(){
			@Override
			public void run(){
				// TODO Auto-generated method stub
				super.run();
				while(!this.isInterrupted()){
					account.delete(10);	
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		depositMan.start();
		withdrawMan.start();
	}

}
