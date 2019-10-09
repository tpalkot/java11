package com.tom.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {


    public static class Player implements Runnable {

        String name;
        CyclicBarrier cyclicBarrier;

        public Player(String name, CyclicBarrier cyclicBarrier) {
            this.name = name;
            this.cyclicBarrier = cyclicBarrier;
        }

        public void run() {

            // let the barrier know you started
            System.out.println("Starting thread for " + this.name);
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Past the await for " + this.name);
        }

    }

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

        new Thread(new Player("player1", cyclicBarrier)).start();
        new Thread(new Player("player2", cyclicBarrier)).start();
        new Thread(new Player("player3", cyclicBarrier)).start();
        new Thread(new Player("player4", cyclicBarrier)).start();


    }

}
