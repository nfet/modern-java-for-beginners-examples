package com.lagnada.modernj.chapter.threadlocal;

public class ThreadLocalExample {
  private static final ThreadLocal<Integer> count
          = new ThreadLocal<>();

  public static void main(String[] args) throws InterruptedException {

    Thread thread1 = new Thread(() -> updateCount(1));
    Thread thread2 = new Thread(() -> updateCount(2));

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

  }

  private static void updateCount(int addValue) {
    if (count.get() == null) {
      count.set(addValue);
    } else {
      count.set(count.get() + addValue);
    }
    String threadName = Thread.currentThread().getName();
    System.out.printf("%s: %d%n", threadName, count.get());
  }
}

