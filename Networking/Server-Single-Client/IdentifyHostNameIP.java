package com.special.effect.javafxprojects.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IdentifyHostNameIP {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            try{
                InetAddress address = InetAddress.getByName(args[i]);
                System.out.print("Host name: " + address.getHostName() + " ");
                System.out.println("IP address: " + address.getHostAddress());
            } catch (UnknownHostException e) {
                System.err.println("Unknown host or IP address " + args[i]);
            }
        }
    }
}
