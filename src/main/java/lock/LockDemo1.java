package lock;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo1 {

    public static void main(String[] args) {
        Object o = new Object();
        synchronized (o) {

        }
        Lock lock = new ReentrantLock();
        lock.tryLock();
        AtomicInteger firstCount = new AtomicInteger(0);
        AtomicInteger secondCount = new AtomicInteger(0);
        firstCount.incrementAndGet();
        while(firstCount.get() != 1) {}
//        CountDownLatch
        Semaphore foo = new Semaphore();
        foo.acquire();
        foo.release();
    }

}
