class FibocciRunnable implements Runnable {
    int n;

    FibocciRunnable(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}

class EvenRunnable implements Runnable {
    int start, end;

    EvenRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even numbers from " + start + " to " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class ThreadRunnableExample {
    public static void main(String[] args) {
        FibocciRunnable fib = new FibocciRunnable(10);
        EvenRunnable even = new EvenRunnable(1, 20);

        Thread t1 = new Thread(fib);
        Thread t2 = new Thread(even);

        t1.start();
        t2.start();
    }
}
