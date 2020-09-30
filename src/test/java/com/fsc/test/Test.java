package com.fsc.test;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.*;
public class Test{
    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        String hostName = inetAddress.getHostName();
        System.out.println("主机名："+hostName);
//        System.out.println();
        String ip = inetAddress.getHostAddress();
        System.out.println("ip地址："+ip);
        InetAddress [] ids = InetAddress.getAllByName("www.baidu.com");
        for(InetAddress inetAddress2:ids){
            System.out.println(inetAddress2);
        }
        InetSocketAddress inetAddress1 = new InetSocketAddress("0.0.0.0",6810);
        System.out.println(inetAddress1.getHostName());
        System.out.println("fsc");
    }
}