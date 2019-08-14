
public class MainProgram {

	public static void main(String[] args) {
		
		Thread startThread = new Thread(new Task("start"));
		Thread runThread = new Thread(new Task("run"));
		
		startThread.start();
		runThread.run();
	
		
	}

	
	private static class Task implements Runnable
	{
		private String caller;
		
		private Task(String caller) {
			this.caller = caller;
		}
		@Override
		public void run() {
			
			System.out.println("Caller is "+ caller + " and thread is executed by "+ Thread.currentThread().getName());
		}
		
	}
}
