package Creational.ObjectPool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomLock {
    private Lock customLock = new ReentrantLock();

    public CustomLock(){
        lock();
    }

    public void lock(){
        customLock.lock();
    }

    public void release(){
        customLock.unlock();
    }
}
