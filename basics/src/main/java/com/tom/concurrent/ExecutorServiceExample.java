package com.tom.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceExample {


    public static class Runner implements Runnable {

        public void run() {
            System.out.println("runner");
        }
    }
    public static class Caller implements Callable<String> {

        public String call() {
            System.out.println("caller");
            return "ok";
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> callerResult = executorService.submit(new Caller());

        System.out.println("callerResult " + callerResult.get());
        System.out.println("ExecutorService.submit" + executorService.submit(new Runner(), "OK"));
        Future<?> notResultSubmit = executorService.submit(new Runner());
        System.out.println("noResultSubmit " + notResultSubmit.get());

        executorService.execute(new Runner());
    }
}
