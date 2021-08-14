package Creational.ResourceAcquisitionIsInitialization;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomLock implements Closeable {
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

    @Override
    public void close() {
        System.out.print(" HERE ");
        release();
    }
}
