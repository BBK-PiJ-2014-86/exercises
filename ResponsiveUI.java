package day17;

/*
 * Algorithm: The user is asked for an input in ms. Once input is provided, take that input and run a thread
 * for the amount of time specified. 
 * Need variable to keep the ms and pass it into the Thread. Thread sleep 
 * Need a loop to ask user 
 * 
 */


public class ResponsiveUI implements Runnable{
	
	int ms;
	
	public ResponsiveUI (int time) {
		ms = time;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Finished");
		
	}
	

}
