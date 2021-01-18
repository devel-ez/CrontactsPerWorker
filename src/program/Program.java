/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.util.Locale;
import java.util.Scanner;


class Program {

    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker =  new Worker( workerName,WorkerLevel.valueOf(workerLevel), baseSalary, new Departament (departamentName) );
        
        
        
        sc.close();
    }
    
}
