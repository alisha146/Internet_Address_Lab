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
public class InetAddressGetter2 {
     public static void main(String[] args) throws UnknownHostException {

        // getLocalHost()
        InetAddress local = InetAddress.getLocalHost();

        System.out.println("Local Host Name: " + local.getHostName());
        System.out.println("Local Host Address: " + local.getHostAddress());

        // getByName()
        InetAddress host = InetAddress.getByName("google.com");

        System.out.println("Google Host Name: " + host.getHostName());
        System.out.println("Google Host Address: " + host.getHostAddress());
    }
}
