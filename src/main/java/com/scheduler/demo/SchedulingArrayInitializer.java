package com.scheduler.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class SchedulingArrayInitializer {
    String[] arr;


    public SchedulingArrayInitializer()
    {
        try {
            String line ="";
            BufferedReader bufferedReader = new BufferedReader(new FileReader("list.csv"));
            arr = new String[1000];
            int counter = 0;
            while ((line=bufferedReader.readLine())!=null)
            {
                arr[counter] = line;
                counter++;
            }
        }
        catch (Exception E)
        {
            System.out.println("FileNotFound");
        }
    }
    @PostConstruct
    public void initialize()
    {
        try {
            String line ="";
            BufferedReader bufferedReader = new BufferedReader(new FileReader("list.csv"));
            arr = new String[1000];
            int counter = 0;
            while ((line=bufferedReader.readLine())!=null)
            {
                arr[counter] = line;
                counter++;
            }
        }
        catch (Exception E)
        {
            System.out.println("FileNotFound");
        }
    }
    public static void main(String[] args)
    {
        SchedulingArrayInitializer x = new SchedulingArrayInitializer();
        for (int i = 0; i < x.arr.length && x.arr[i]!=null; i++) {
            System.out.println(x.arr[i]);
        }
    }


}
