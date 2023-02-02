/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice.pkg3;

import java.util.Scanner;

/**
 *
 * @author 2124478
 */
public class Practice_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Give in the temperature : ");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("Water is boiling!! ");
        }else if (temp <= 0){
            System.out.println("The Water is freezing. ");
            } else  {
            System.out.println("The Water is in normal state. ");
        }       
                    
       




    }
    
}
