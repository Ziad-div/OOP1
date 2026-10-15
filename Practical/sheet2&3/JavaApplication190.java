/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication190;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication190 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("enter any int num");
        Scanner input =new Scanner(System.in);
        int i= input.nextInt();
       for( int x =0; x<i ; x++ ){
       for( int n=1;n<x ;n++ ){
           System.out.print(n);
       
       }
       
       System.out.println(x);
       
       
       }
        
        
        
           
        
        
        
        
    }
    
}
