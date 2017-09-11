/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritoverloadtest;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class InheritOverLoadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float rate;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total OT hour: ");
        int hour = scan.nextInt();
        employee emp1 = new employee(hour);
        System.out.println("\"Employee\"\nTotal OT Pay = (" + emp1.rate + " * "+ hour + ") = "+ emp1.pay + " BAHT");
        
        System.out.print("\"Daily Employee\"\nRate per day = ");
        rate = scan.nextFloat();
        daily_emp emp2 = new daily_emp(hour, rate);
        System.out.println("Total OT Pay = ("+ emp2.rate + " * "+hour+") = "+emp2.pay + " BAHT");
        
        System.out.print("\"Montly Employee\"\nEnter Salary = ");
        rate = scan.nextFloat();
        System.out.print("Enter bonus = ");
        float bonus = scan.nextFloat();
        montly_emp emp3 = new montly_emp(hour,rate/30,bonus);
        System.out.println("Total OT Pay = ("+ emp3.rate+" * "+hour+") + "+ bonus + " = "+emp3.pay + " BAHT");
       
    }
}
