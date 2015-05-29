package day18;

import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecutorImpl implements Executor {
	
	final Queue <Runnable> queue = new LinkedBlockingQueue <Runnable>(); 
	Runnable current;

	@Override
	public synchronized void execute(Runnable command) {

		queue.offer(new Runnable () {

			@Override
			public void run() {
				
				try {
					command.run();
				} finally {
					next();
				}
			}

			private void next() {
				if ((current= queue.poll()) != null) {
					
				}
				
			}
			
		});
		
	}
	
	

}
