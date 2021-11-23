public class ThreadTest1 extends Thread{	//Thread is system defined class
	String name;

	public ThreadTest1(String n){
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
		ThreadTest1 t1 =  new ThreadTest1("Thread 1");
		ThreadTest1 t2 = new ThreadTest1("Thread 2");
		t1.start();	//start() is also system defined
		t2.start();
 	}
}