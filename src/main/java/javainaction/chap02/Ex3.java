package javainaction.chap02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex3 {
    // Runnable 의 업그레이드 버전


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        Future<String> lambdaThreadName = executorService.submit(() -> Thread.currentThread()
                .getName());

        System.out.println(threadName);
        System.out.println(lambdaThreadName);
    }

}
