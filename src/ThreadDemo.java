public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.print("Thread. ");
        
    }

    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        t.start();
        System.out.print("one. ");
        t.run();
        System.out.print("two. ");
    }
}
