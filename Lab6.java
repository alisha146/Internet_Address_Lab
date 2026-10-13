/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportutwo;
import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 *
 * @author dell
 */
public class Lab6 {
    
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            NetworkInterface network =
                    NetworkInterface.getByInetAddress(address);

            System.out.println("IP Address: "
                    + address.getHostAddress());

            byte[] mac = network.getHardwareAddress();

            System.out.print("MAC Address: ");

            for (int i = 0; i < mac.length; i++) {
                System.out.printf("%02X%s", mac[i],
                        (i < mac.length - 1) ? "-" : "");
            }

        } catch (Exception e) {
            System.out.println("Unable to retrieve IP and MAC address.");
        }
    }
}
    

