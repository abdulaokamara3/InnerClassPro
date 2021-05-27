package com.example.Sample.ProjectAndrewJar;

import java.io.File;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Stack;

public class FileWriterClassProg {
    public static void main(String[] args) {


        Stack<String> kk = new Stack<>();
        kk.add("andrew ");
        kk.add("mose");
        Iterator<String> hh=kk.iterator();
        while (hh.hasNext()){
            System.out.println(hh.next());
        }
        System.out.println("..............................");
        for (String pp:kk){
            System.out.println("my name is "+pp);
        }
//        while(oo.hasNext()){
//            System.out.println(oo.next());
//        }
//        Stack<String> stack = new Stack<String>();
//        stack.push("Ayush");
//        stack.push("Garvit");
//        stack.push("Amit");
//        stack.push("Ashish");
//        stack.push("Garima");
//        stack.pop();
//        Iterator<String> itr=stack.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }
//        int a = 34;
//        Integer hhh = new Integer(a);//boxing
//
//
//        Integer ass = 23;

       // Integer aa = new Integer(200);
//        Float pp = new Float(100);
//        float ss =pp.floatValue();
//        float sss=pp;
//        System.out.println(ss+sss);
//

       // int i = aa.intValue();
      //  System.out.println(i);
       // int a = 23;
       // Integer abject = Integer.valueOf(a);
       // Integer abJect1 = a;//autoboxing
      //  System.out.println(a);
    }

  }
