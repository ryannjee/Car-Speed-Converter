/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cw2q4;

/**
 *
 * @author Ryan
 */
import java.util.*;

public class CW2Q4 {
    /**
     * @param args the command line arguments
    */

    double speed, mps=0.278, newspeed;
    public static void main(String[] args) 
    {
        double speed;
        Scanner s = new Scanner(System.in);
        String type1;
        char unit;
    do{    
        System.out.println("| A = km/h | B = m/s |");
        System.out.print("Please Choose The Speed Unit: ");
        type1=s.nextLine().toUpperCase();
        unit = type1.charAt(0);
        
        if(!((unit == 'A')||(unit == 'B'))){
            System.out.println("Please Enter A Or B To Choose Units.");
        }
        }while(!((unit == 'A')||(unit == 'B')));
        //conversion for km/h to m/s
        if(unit == 'A'){
            //validation for negative car speed
            do{
            //imput for car speed
            System.out.println("Please Enter the car speed(km/h): ");
            Scanner k = new Scanner(System.in);
            speed=k.nextDouble();
            }while(speed<0);  
            //activate loop
            convertKmhToMs(speed);
        }
        //conversion for m/s to km/h
        if(unit == 'B'){
            //validation for negative car speed
            do{
            //imput for car speed    
            System.out.println("Please Enter the car speed(m/s): ");
            Scanner m = new Scanner(System.in);
            speed=m.nextDouble();
            }while(speed<0);
            //activate loop
            convertMsToKmh(speed);
        }
    }
    
        public static double convertKmhToMs(double speed1){
            // from m/s to km/h
            // 1km/h = 0.278m/s
            double newspeed=speed1 /3.6;
            //display new unit speed
            System.out.printf("Car speed(m/s): %.3f" ,newspeed);
            return newspeed;
        }
        
        public static double convertMsToKmh(double speed2){
            // from km/h to m/s
            // 1m/s = 3.6km/h
            double newspeed = speed2*3.6;
            //display new unit speed
            System.out.printf("Car speed(km/h): %.3f" ,newspeed);
            return newspeed;
        }  
}
