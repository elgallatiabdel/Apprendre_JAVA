package Collections.apprendre;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main6 {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<Integer>(); // first in first out
    Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3); 

    q.add(10);
    q.add(15);
    q.add(5);
    q.add(20);
    System.out.println(q.element());
    System.out.println(q);
    q.remove();
    System.out.println(q.element());
    System.out.println(q);
    q.remove();
    System.out.println(q.element());
    System.out.println(q);

    System.out.println("--------------------");
    // la methode poll fait un remove de premier element s'il existe
    q2.poll();
    // la methode peek return de premier element s'il existe
    q2.peek();
    // la methode affre ajoute un element s'il existe de capacity et return true s'il ajoute et false si non
    q2.offer(10);
    q2.offer(15);
    System.out.println(q2.offer(50));
    System.out.println(q2.offer(20));
    System.out.println(q2.peek());
    System.out.println(q2);
    q2.poll();
    System.out.println(q2);
  }
}
