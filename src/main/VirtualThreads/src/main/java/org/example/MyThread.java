package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;
public class MyThread implements Runnable{
    Logger logger = LoggerFactory.getLogger(MyThread.class);
    @Override
    public void run() {
        logger.info("{} ", Thread.currentThread());
        try {
            Thread.sleep(Duration.ofSeconds(1L));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
