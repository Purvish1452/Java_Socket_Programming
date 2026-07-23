package com.ems.socket;
import java.io.*;

public class Print_Stream {
    public static void main(String a[]) throws FileNotFoundException {
       PrintStream out=new PrintStream("src/com/ems/socket/server.txt");

       int v=10;
       System.out.println("The value" + v);

       out.println("The value of var1 is "+ v);
       out.close();




    }

}
