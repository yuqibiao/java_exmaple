package com.yyyu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 集合的排序
 */
public class SortCollection {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("yu");
        list.add("yuuuu");
        list.add("yuu");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length()==s2.length()){
                    return 0 ;
                }else if(s1.length()>s2.length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        for (String str:list) {
            System.out.println(str);
        }

    }

}
