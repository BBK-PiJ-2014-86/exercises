package day18;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TextLoopsWithExecutor implements Runnable {
			public static final int COUNT = 10;
			private final String name;
		
			public TextLoopsWithExecutor(String name) {
				this.name = name;
			}
		    @Override
			public void run() {
				for (int i = 0; i < COUNT; i++) {
					System.out.println("Loop:" + name + ", iteration:" + i + ".");
				}
			}
			public static void main(String args[]) {
		
				if (args.length < 1 || (!args[0].equals("0") && !args[0].equals("1"))) {
					System.out.println("USAGE: java TextLoop <mode>");
					System.out.println(" mode 0: without threads");
					System.out.println(" mode 1: with threads");
				} else if (args[0].equals("0")) {
		
					for (int i = 0; i < 10; i++) {
		
						Runnable r = new TextLoopsWithExecutor("Thread " + i);
		
						r.run();
					}
				} else {
					Executor e = Executors.newFixedThreadPool(10);
					for (int i = 0; i < 10; i++) {
						Runnable r = new TextLoopsWithExecutor("Thread " +i);
						e.execute(r);
					}
				}
			}
		
	
}
