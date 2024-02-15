package com.lagnada.modernj.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDequeExample {
  public static void main(String[] args) {
    // Queue Example
    Queue<Integer> queue = new ArrayDeque<>();
    queue.offer(1); // Add elements to the queue
    queue.offer(2);
    queue.offer(3);
    System.out.println("Queue: " + queue);
    System.out.println("Queue Poll: " + queue.poll()); // Removes and returns the head of the queue
    System.out.println("Queue after poll: " + queue);

    // Deque Example
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    deque.offerLast(10); // Add elements to the end
    deque.offerFirst(5); // Add elements to the beginning
    System.out.println("Deque: " + deque);
    System.out.println("Deque Poll First: " + deque.pollFirst()); // Removes and returns the first element
    System.out.println("Deque after Poll First: " + deque);
    System.out.println("Deque Poll Last: " + deque.pollLast()); // Removes and returns the last element
    System.out.println("Deque after Poll Last: " + deque);
  }
}
