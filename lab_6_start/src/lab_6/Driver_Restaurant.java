package lab_6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Driver_Restaurant {
	public static void main(String[] arg) throws InterruptedException {

		// there is one bowl with candy
		BowlOfCandy bowlOfCandy = new BowlOfCandy();

		// there is one pack of candy to refill the bowl
		List<String> packOfCandy = new ArrayList<String>();
		packOfCandy.add(Candy.M_N_M);
		packOfCandy.add(Candy.M_N_M);
		packOfCandy.add(Candy.ALBENI);
		packOfCandy.add(Candy.ALBENI);
		packOfCandy.add(Candy.BOUNTY);

		System.out
				.println("the candy in the pack at the very beginning: " + RestaurantUtils.getListOfCandy(packOfCandy));
		System.out.println();

		// waiter trying to refill candy in the bowl
		Waiter waiter = new Waiter(packOfCandy, bowlOfCandy);

		// customer is going to take candy out of the bowl
		Customer customer = new Customer(bowlOfCandy);

	      // create ExecutorService to manage threads
	      ExecutorService executorService = Executors.newCachedThreadPool();
		// TODO -completed execute the tasks with an ExecutorService instead of manually declared threads below
	      executorService.execute(waiter); // start task1	
	      executorService.execute(customer); // start task2

		// TODO -completed call a special method on the executor service to stop accepting
		// anymore tasks
	      executorService.shutdown(); 
	      
	      try{
	          // wait 1 minute for both writers to finish executing
	          boolean tasksEnded = 
	             executorService.awaitTermination(1, TimeUnit.MINUTES);

	          if (tasksEnded)
	          {
	             System.out.printf("%nContents of SimpleArray:%n");
	          }else {
	             System.out.println(
	                "Timed out while waiting for tasks to finish.");
	          }
	       } 
	       catch (InterruptedException ex)
	       {
	          ex.printStackTrace();
	       } 
	}
}
