package com.ems.socket;

import java.io.*;

public class Buffer_Reader {
    public static void main(String a[])
    {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("src/com/ems/socket/client.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("src/com/ems/socket/server.txt"));

            String line=null;
            while((line=reader.readLine())!=null)
            {
                writer.write(line);
                writer.write("\n");
            }
            writer.close();
            reader.close();


        }
        catch (Exception e)
        {
            System.out.println(e.toString());

        }
    }

}
