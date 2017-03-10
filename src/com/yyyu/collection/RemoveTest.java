package com.yyyu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList元素移除测试
 */
public class RemoveTest {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("yu");
        list.add("yu1");
        list.add("yu2");
        //--错误写法
        for (String str : list){
            if (str.equals("yu")){
               // list.remove(str);//抛出ConcurrentModificationException
            }
        }
        System.out.println("size=="+list.size());
        //---正确写法
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("yu")){
                iterator.remove();
            }
        }
        System.out.println("size=="+list.size());

    }

}
