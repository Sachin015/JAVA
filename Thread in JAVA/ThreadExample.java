class ThreadA extends Thread {
    public void run() {
    for (int i = 1; i <= 5; i++) {
    System.out.println("Running thread " + i + " From Class A");
    }
    System.out.println("Exit from Class A");
    }
    }
    class ThreadB extends Thread {
    public void run() {
    for (int j = 1; j <= 5; j++) {
    System.out.println("Running thread " + j + " From Class B");
    }
    System.out.println("Exit from Class B");
    }
    }
    class ThreadC extends Thread {
    public void run() {
    for (int k = 1; k <= 5; k++) {
    System.out.println("Running thread " + k + " From Class C");
    }
    System.out.println("Exit from Class C");
    }
    }
     public class ThreadExample {
    public static void main(String[] args) {
    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();
    ThreadC threadC = new ThreadC();
    threadA.start();
    threadB.start();
    threadC.start();
    }
    }