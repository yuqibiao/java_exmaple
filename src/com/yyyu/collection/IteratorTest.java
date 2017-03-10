package com.yyyu.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap遍历
 */
public class IteratorTest {

    public static void main(String[] args){

        HashMap<Integer , String> maps = new HashMap<>();
        maps.put(1 , "yu");
        maps.put(2 , "yu2");
        maps.put(3 , "yu3");
        /**
         * 遍历方式一：
         */
        Iterator<Integer> iteratorKey =  maps.keySet().iterator();
        while (iteratorKey.hasNext()){
           String value =  maps.get(iteratorKey.next());
           System.out.println("value1："+value);
        }
        /**
         * 遍历方式二：
         */
       Iterator<Map.Entry<Integer , String>> iteratorMap =  maps.entrySet().iterator();
        while (iteratorMap.hasNext()){
            Map.Entry<Integer, String> entry = iteratorMap.next();
            System.out.println("value2："+entry.getValue());
        }
        //---foreach和iterator的本质是一样的
        ArrayList<String> list = new ArrayList<>();
        list.add("yu");
        list.add("yu2");
        list.add("yu3");
        for (String str :  list) {
            System.out.println("list value："+str);
        }
        Iterator iteratorList = list.iterator();
        while(iteratorList.hasNext()){
            System.out.println("value  list=="+iteratorList.next());
        }


    }

}
