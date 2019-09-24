
public class Thread_Ex2 implements Runnable{
	String name;
	
	
	public void run() {
		for(int x = 1; x < 10; x++) {
			System.out.println("Hi my name is: " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		Thread_Ex2 m1 = new Thread_Ex2();
		Thread t1 = new Thread(m1); //Passing m1 object to the Thread class constructor
		
		t1.setName("Eric-1 Thread");
		t1.start();
		
		Thread t2 = new Thread(m1);
		t2.setName("Eric-2 Thread");
		t2.start();
		
		new Thread(t1).start();
		new Thread(t2).start();
			
		//new Thread(t1).start();
		//new Thread(t1).start();
		
	
		
		

	}

}
//Here we can create t1 as many times as we want
//who manages the threads ( the user level) 
//it is managed at user level in this case jvm

//why would you create the same obj more then once
//example google docs when many ppl access the same document.
//issue is if we modify the same doc at the same time 
//we handle this by synchonization and tactics

//how do we use this and why
//if we have a server and many requests come in we create threads per request to handle the job
//In java we can extend many class it is recommended to use the implements.

