/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labreportutwo;
import java.net.InetAddress;

/**
 *
 * @author dell
 */
public class Lab4 {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();

            System.out.println("IP Address: " + address.getHostAddress());

            if (address.getAddress().length == 4) {
                System.out.println("It is an IPv4 Address.");
            } else if (address.getAddress().length == 16) {
                System.out.println("It is an IPv6 Address.");
            }

        } catch (Exception e) {
            System.out.println("Unable to find IP address.");
        }
    }
}
    

