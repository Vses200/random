package algss;

public class AlphabetsAlternate {

	public void printOdd() {
		try {	
			char c = 'a';
			
					
			while(c<='z') {
				System.out.println(Thread.currentThread().getName()+" "+c);
				c++;
				c++;
				
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void printEven() {
		
		
					try {
						char c = 'b';
						
								
						while(c<='z') {
							System.out.println(Thread.currentThread().getName()+" "+c);
							c++;
							c++;
							
							Thread.sleep(1500);
						}
						
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					
		
	}
	public static void main(String[] args) {
		AlphabetsAlternate obj = new AlphabetsAlternate();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				//print odd
				obj.printOdd();
			}
			
		},"Thread-1");
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				//print even
				obj.printEven();
			}
			
		},"Thread-2");
		
		
		t1.start();
		t2.start();
	}
}
