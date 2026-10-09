/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportutwo;
 import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author dell
 */
public class Lab3 {
      public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();

            System.out.println("IP Address: " + address.getHostAddress());
            System.out.println();

            System.out.println("Any Local Address: "
                    + address.isAnyLocalAddress());

            System.out.println("Loopback Address: "
                    + address.isLoopbackAddress());

            System.out.println("Link Local Address: "
                    + address.isLinkLocalAddress());

            System.out.println("Site Local Address: "
                    + address.isSiteLocalAddress());

            System.out.println("Multicast Address: "
                    + address.isMulticastAddress());

            System.out.println("Multicast Global: "
                    + address.isMCGlobal());

            System.out.println("Multicast Node Local: "
                    + address.isMCNodeLocal());

            System.out.println("Multicast Link Local: "
                    + address.isMCLinkLocal());

            System.out.println("Multicast Site Local: "
                    + address.isMCSiteLocal());

            System.out.println("Multicast Organization Local: "
                    + address.isMCOrgLocal());

        } catch (UnknownHostException e) {
            System.out.println("Unable to find the IP address.");
        }
    }
}
    

