package com.springboot;

/**
 * 对java相关知识进行记录的类
 * @作者：hawk
 * @日期：2021/1/14 0014 20:17
 */
public class SingleMain {

    public static void main(String[] args) {
        String data = tryCatchFinally();
        System.out.println(data);
    }

    /**
     * 对try catch finally 用法的测试
     *
     * 到底返回值变不变可以简单的这么记忆：当finally调用的任何可变API，会修改返回值；当finally调用任何的不可变API，对返回值没有影响。
     *
     * 总结一下：其实return与finally并没有明显的谁强谁弱。在执行时，是return语句先把返回值写入但内存中，然后停下来等待finally语句块执行完，return再执行后面的一段
     */
    public static String tryCatchFinally(){
        int i = 10;
        StringBuffer sbf = new StringBuffer("hello");

        try{
            System.out.println("进入try");
            throw(new Exception());
            //return "这是try的返回值";
        }catch(Exception e){
            System.out.println("这是catch");
            sbf.append("catch");
            return "这是catch的返回值:" + i + sbf.toString();//finally中未设置返回值时，返回：这是catch的返回值:10hellocatch
        }finally{
            i = 20;
            sbf.append("finally");
            System.out.println("这是finally");
           // return "这是finally的返回值:" + i + sbf.toString();//返回结果：这是finally的返回值:20hellocatchfinally
        }
    }

    //TODO jvm调优 内存不足等等

    //TODO maven作用，和其他工具的区别
    //TODO 配置maven
    //TODO jpa


    //TODO svn和git的区别------git优于svn
    // https://blog.csdn.net/bruce_6/article/details/38299677

    //TODO 多线程--线程安全集合，
    // Vector HashTable
    // Collections提供了方法可以将arraylist hashmap包装成线程安全的
    // ConcurrentSkipListMap、ConcurrentSkipListSet、ConcurrentLinkedQueue、ConcurrentLinkedDeque等，至于为什么没有ConcurrentArrayList

    //TODO java gc机制 如何查看gc 如何进行优化

    //TODO
}
