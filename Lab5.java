/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportutwo;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 *
 * @author dell
 */
public class Lab5 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces =
                    NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface networkInterface = interfaces.nextElement();

                if (networkInterface.isUp()
                        && !networkInterface.isLoopback()
                        && !networkInterface.isVirtual()) {

                    System.out.println("Interface Name: "
                            + networkInterface.getName());

                    System.out.println("Display Name: "
                            + networkInterface.getDisplayName());

                    System.out.println();
                }
            }

        } catch (SocketException e) {
            System.out.println("Unable to list network interfaces.");
        }
    }
}
    

