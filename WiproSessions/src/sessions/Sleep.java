package sessions;

public class Sleep extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+ ":"+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Sleep t1 = new Sleep();
        Sleep t2 = new Sleep();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();  
        t2.start();   
    }
}
