/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author laboratorio
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor ingrese entrada: num num1 ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String num2 = in.next();
        System.out.println(num);
        System.out.println(num2);
        for(int i=0;i<num2.length();i++){
            switch(num2.charAt(i)){
                    case '1': one(num);
            }
        }
    }
    public static void one(int num){
        for(int i=0;i<num+3;i++){
            for(int k=0;k<2*num+3;k++){
                if(i!=0&&i!=num+2&&i!=2*num+3){
                    if(k==2*num+2){
                        System.out.print("|");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println(" ");
        }
    }
    
}
