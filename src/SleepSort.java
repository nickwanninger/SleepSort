
public class SleepSort implements Runnable {
	public int n;
	
	public SleepSort(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(n);
			System.out.println(n + "");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	public void start() {
		new Thread(this).start();
	}

}
