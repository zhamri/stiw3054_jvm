public class Test_VisualVM {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello world!");
        Thread.sleep(30000);
        System.out.println("Stop");
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        while (true) {
            for (int i = 0; i < 100000; i++) {
                System.out.println("Hai");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}