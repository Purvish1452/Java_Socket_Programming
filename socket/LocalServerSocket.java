package com.ems.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class LocalServerSocket {
public static void main(String a[])
{
    int port=1;
    while(port<=65535)
    {
    try {
        ServerSocket server=new ServerSocket(port);
    } catch (IOException e) {
        System.out.println("Port "+ port + "is open!");
    }
    port++;
    }

}

}
