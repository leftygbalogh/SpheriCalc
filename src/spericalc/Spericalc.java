/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spericalc;

import java.util.Scanner;

/**
 *
 * @author lefty
 */
public class Spericalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sphere radius? ");
        double radius = sc.nextDouble();
        
        double volume = (4*3.1415*radius*radius*radius)/3;
        System.out.println("Sphere volume: "+volume);
        
        double surface = (4*3.1415*radius*radius);
        System.out.println("Sphere area: "+surface);

    }
    
}
