package eeps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

abstract class EmployeeClass {

    protected String name ;
    protected int id ;
    protected int age ;
    protected double salary ;

    EmployeeClass(){};
    
    protected int makeID(){
        int id = 1;
        try {
            
            FileReader fr = new FileReader("IDs.txt");
            BufferedReader brr= new BufferedReader(fr);
            Scanner w = new Scanner(new File("IDs.txt"));
            while(w.hasNext())
            {
                id=w.nextInt()+1;
            }
            fr.close();
            
        } catch (Exception e) {
            System.out.println("File does not exist but do not worry!");
        }
        
            
            
        try {

            File file = new File("IDs.txt");
            FileWriter fw;
            fw = new FileWriter(file , false);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(1);
            pw.close();

        } catch (Exception e) {
            System.out.println("There is an Exception here whyy WRITE!");
        }
        return id;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

    // Add here any methods for the Employee ...


}
