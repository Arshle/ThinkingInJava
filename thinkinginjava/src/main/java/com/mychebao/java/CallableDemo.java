/*
 * Copyright (C), 2014-2017, 江苏乐博国际投资发展有限公司
 * FileName: CallableDemo.java
 * Author:   zhangdanji
 * Date:     2017年08月23日
 * Description:   
 */
package com.mychebao.java;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author zhangdanji
 */
class TaskWithRsult implements Callable<String>{

    private int id;

    public TaskWithRsult(int id){
        this.id = id;
    }

    public String call() throws Exception {
        return "result of TaskWithRsult " + id;
    }
}

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<Future<String>>();
        for(int i = 0; i < 10; i ++){
            results.add(exec.submit(new TaskWithRsult(i)));
        }
        for(Future<String> fs : results){
            try {
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                System.out.println(e);
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                System.out.println(e);
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
        }
    }
}
