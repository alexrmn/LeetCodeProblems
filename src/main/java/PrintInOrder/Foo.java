package PrintInOrder;

import java.util.concurrent.atomic.AtomicInteger;

class Foo {
    private final AtomicInteger count;

    public Foo() {
        count = new AtomicInteger();
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        while (count.get() < 1){

        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count.get() < 2) {

        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

}