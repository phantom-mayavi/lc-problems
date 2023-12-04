import javax.swing.*;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

public class Print_In_Order_1114 {

//    private AtomicInteger firstJobDone = new AtomicInteger(0);
//    private AtomicInteger secondJobDone = new AtomicInteger(0);

    Semaphore run2, run3;
    public Print_In_Order_1114() {
        run2 = new Semaphore(0);
        run3 = new Semaphore(0);
    }

    public static void main(String[] args) {
        Print_In_Order_1114 printInOrder1114 = new Print_In_Order_1114();
        Runnable first = () -> System.out.println("first");
        Runnable second = () -> System.out.println("second");
        Runnable third = () -> System.out.println("third");
        List<Integer> nums = asList(1, 3, 2);
        nums.forEach(num -> {
            try {
                if (num == 1) {
                    new Thread(() -> {
                        try {
                            printInOrder1114.first(first);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }).start();
                } else if (num == 2) {
                    new Thread(() -> {
                        try {
                            printInOrder1114.second(second);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }).start();
                } else if (num == 3) {
                    new Thread(() -> {
                        try {
                            printInOrder1114.third(third);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }).start();
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
//        firstJobDone.incrementAndGet();
        run2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        run2.acquire();
//        while (firstJobDone.get() != 1) {
//            // waiting for the first job to be done.
//        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
//        secondJobDone.incrementAndGet();
        run3.release();

    }

    public void third(Runnable printThird) throws InterruptedException {
        run3.acquire();
//        while (secondJobDone.get() != 1) {
//            // waiting for the second job to be done.
//        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
