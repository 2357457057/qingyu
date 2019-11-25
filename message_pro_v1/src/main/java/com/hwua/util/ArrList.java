package com.hwua.util;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
    //遍历输出
    public static<T> void outPut(List<T> List){
        for (T list :List) {
            System.out.println(list);
        }
    }
    //指定每行元素数量
    public static<T> void outPut(ArrayList<T> List,int  lineWidth){
          int count =0;
        for (T list :List) {
            count++;
            System.out.print(list+" ");
            if( count==lineWidth){
                System.out.println();
                count=0;
            }
        }
    }

    }




