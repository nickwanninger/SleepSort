
public class SleepSortSlave implements Runnable {
	public int n;
	
	public SleepSortSlave(int n) {
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
