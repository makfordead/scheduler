package com.scheduler.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.LinkedList;

@Component
public class SchedulingLogic {

@Autowired
SchedulingArrayInitializer ScheArr;

public LinkedList getUniqueCourseNames()
{
    LinkedList ls = new LinkedList();
    HashSet<String> hashSet = new HashSet<>();
    int count =0;
    while(ScheArr.arr[count] !=null)
    {
        try {
            String[] temp = ScheArr.arr[count].split(",");
            System.out.println(temp[2]);


            if( !hashSet.contains(temp[2])) {
            ls.add(temp[2]);
            hashSet.add(temp[2]);
        }
        }
        catch (Exception e) {
            System.out.println("out of bound");
        }
        count++;
    }
    return ls;
}

public LinkedList getTeacherName(String CourseName)
{
    LinkedList linkedList  = new LinkedList();
    HashSet<String> hashSet = new HashSet<>();
    int count =0;
    while (ScheArr.arr[count]!=null)
    {

        String[] temp = ScheArr.arr[count].split(",");
        if(!hashSet.contains(temp[3]))
        {
            if(CourseName.compareTo(temp[2])==0)
            {
                linkedList.add(temp[3]);
                hashSet.add(temp[3]);
            }
        }
    count++;
    }
    return linkedList;
}


public static void main(String[] args)
{

}
}
