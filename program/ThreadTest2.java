public class ThreadTest2 implements Runnable{	//another way to create threads || class -> isA, interface -> followsRule
	String name;

	public ThreadTest2(String n){
		name = n;
	}

	public void run(){
		while(true){
			try{
				System.out.println(name);
				Thread.sleep(1000); //same as delay()
			}
			catch(InterruptedException i){
				
				System.out.println("Interrupted Exception");
			}
		}
	}

	public static void main(String[] args){
		ThreadTest2 t1 =  new ThreadTest2("Thread 1");
		ThreadTest2 t2 = new ThreadTest2("Thread 2");
		Thread th1 = new Thread(t1); //thread banako
		Thread th2 = new Thread(t2);
		th1.start();	//start() is also system defined
		th2.start();
 	}
}