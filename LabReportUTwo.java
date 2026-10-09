/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.labreportutwo;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 *
 * @author dell
 */
public class LabReportUTwo {

   public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println("Unable to find IP address.");
        }
     }
}
