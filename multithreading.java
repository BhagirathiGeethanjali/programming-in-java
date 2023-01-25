public class MultiThreadingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");

        try {
            
            t1.start();
            t1.join();
            Thread.sleep(500);
            t2.start();
            t2.join();
            Thread.sleep(500);
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
