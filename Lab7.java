/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportutwo;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
/**
 *
 * @author dell
 */
public class Lab7 {
     public static void main(String[] args) {

        try {
            String requiredMAC = "5C-80-B6-2F-2C-04";

            Enumeration<NetworkInterface> interfaces =
                    NetworkInterface.getNetworkInterfaces();

            boolean found = false;

            while (interfaces.hasMoreElements()) {

                NetworkInterface network =
                        interfaces.nextElement();

                byte[] mac = network.getHardwareAddress();

                if (mac == null) {
                    continue;
                }

                StringBuilder macAddress = new StringBuilder();

                for (byte b : mac) {
                    macAddress.append(String.format("%02X-", b));
                }

                macAddress.deleteCharAt(macAddress.length() - 1);

                if (macAddress.toString().equalsIgnoreCase(requiredMAC)) {

                    System.out.println("MAC Address: " + macAddress);

                    Enumeration<InetAddress> ipAddresses =
                            network.getInetAddresses();

                    while (ipAddresses.hasMoreElements()) {
                        InetAddress ip = ipAddresses.nextElement();

                        System.out.println("IP Address: "
                                + ip.getHostAddress());

                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("No IP address found for this MAC address.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}