/*
 * FileName: ToDoList.java
 * Author:   Arshle
 * Date:     2019年01月22日
 * Description:
 */
package com.cicdi.queue;

import java.util.PriorityQueue;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class ToDoList extends PriorityQueue<ToDoList.TodoItem> {

    static class TodoItem implements Comparable<TodoItem> {

        private char primary;

        private int secondary;

        private String item;

        public TodoItem(String td, char pri, int sec){
            primary = pri;
            secondary = sec;
            item = td;
        }

        @Override
        public int compareTo(TodoItem arg) {
            if(primary > arg.primary){
                return +1;
            }
            if(primary == arg.primary){
                if(secondary > arg.secondary){
                    return +1;
                }else if(secondary == arg.secondary){
                    return 0;
                }
            }
            return -1;
        }

        @Override
        public String toString() {
            return Character.toString(primary) + secondary + ": " + item;
        }
    }

    public void add(String td, char pri, int sec){
        super.add(new TodoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash", 'C', 4);
        toDoList.add("Feed dog", 'A', 2);
        toDoList.add("Feed bird", 'B', 7);
        toDoList.add("Mow lawn", 'C', 3);
        toDoList.add("Water lawn", 'A', 1);
        toDoList.add("Feed cat", 'B', 1);
        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}
