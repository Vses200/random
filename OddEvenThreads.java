package algss;

public class OddEvenThreads {
	
	public void printOdd(int limit) {
		try {	
			for(int i=1;i<limit;i++) {
				if(i%2!=0) {
					System.out.println(Thread.currentThread().getName()+" "+ i);
				}
				Thread.sleep(1000);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	public void printEven(int limit) {
		
		
					try {
						for(int i=1;i<limit;i++) {
							if(i%2==0) {
								System.out.println(Thread.currentThread().getName()+" " + i );
							}
							Thread.sleep(1000);
						}
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					
		
	}

	
	public static void main(String[] args) {
		
		OddEvenThreads obj = new OddEvenThreads();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {
				//print odd
				obj.printOdd(15);
			}
			
		},"Thread-1");
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {
				//print even
				obj.printEven(15);
			}
			
		},"Thread-2");
		
		
		t1.start();
		t2.start();
	}
}
