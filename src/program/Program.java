/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


class Program {

    
    public static void main(String[] args) throws ParseException {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");    
        
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
        
        System.out.println("How many conracts to this worker?  ");
        int n = sc.nextInt();
        
        for (int i =1; i<=n;i++){
            System.out.println("Enter contract #" + i + "data:");
            System.out.print("Date DD/MM/YYYY: ");
            Date contractDate =  sdf.parse(sc.next());
            System.out.print("Value Per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hour); 
            worker.addContract (contract);
        }
        
        System.out.println();
        System.out.print(" Enter month and yer to calculate income (MM/YYYY): ");
        String montAndYear = sc.next();
        int month = Integer.parseInt(montAndYear.substring(0,2));
        int Year = Integer.parseInt(montAndYear.substring(3));
        
        
        sc.close();
    }
    
}
