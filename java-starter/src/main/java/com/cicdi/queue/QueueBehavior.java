/*
 * FileName: QueueBehavior.java
 * Author:   Arshle
 * Date:     2019年01月22日
 * Description:
 */
package com.cicdi.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class QueueBehavior {

    private static int count = 10;

    static <T> void test(Queue<T> queue, T... items){
        for(T item : items){
            queue.offer(item);
        }
        while (queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test(new LinkedList<>(), "one","two","three","four","five","six","seven","eight","nine","ten");
        test(new PriorityQueue<>(), "one","two","three","four","five","six","seven","eight","nine","ten");
        test(new ArrayBlockingQueue<>(count), "one","two","three","four","five","six","seven","eight","nine","ten");
        test(new ConcurrentLinkedQueue<>(), "one","two","three","four","five","six","seven","eight","nine","ten");
        test(new LinkedBlockingQueue<>(), "one","two","three","four","five","six","seven","eight","nine","ten");
        test(new PriorityBlockingQueue<>(), "one","two","three","four","five","six","seven","eight","nine","ten");
    }
}
