/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication188;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication188 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here

        System.out.println("enter any int num");
        Scanner input =new Scanner(System.in);
        int i= input.nextInt();
        
    
        
        
        if (i%3==0) {
            System.out.println("number is divisible by 3");
            
            
        }
        else if (i%5==0&&i%3==0){
        
        System.out.println("number is divisible by 5");
        
        }
        else if (i%5==0){
        
        System.out.println("number is divisible by 5");
        
        }
        else {
        System.out.println("number is not divisible by 3 or 5");
        }
        
        
        
    }
    
}
