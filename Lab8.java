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
public class Lab8 {
    public static void main(String[] args) {

        try {
            InetAddress address =
                    InetAddress.getByName("192.168.1.233");

            NetworkInterface network =
                    NetworkInterface.getByInetAddress(address);

            if (network != null) {

                byte[] mac = network.getHardwareAddress();

                System.out.println("IP Address: "
                        + address.getHostAddress());

                System.out.print("MAC Address: ");

                for (int i = 0; i < mac.length; i++) {
                    System.out.printf("%02X%s", mac[i],
                            (i < mac.length - 1) ? "-" : "");
                }

            } else {
                System.out.println("Network interface not found.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    
