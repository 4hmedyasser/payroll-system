package eeps;

import java.io.File;
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
        try {
            
            Scanner w = new Scanner(new File("IDs.txt"));
            while(w.hasNext())
            {
                id=w.nextInt()+1;
            }
            w.close();
            
            FileWriter fw = new FileWriter("IDs.txt" , false);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(id);
            pw.close();
            fw.close();
            
        } catch (Exception e) {
            System.out.println("File does not exist, New file will be created");
            
            try {
                id = 1;
                File file = new File("IDs.txt");
                FileWriter fw;
                fw = new FileWriter(file , false);
                PrintWriter pw = new PrintWriter(fw);
                pw.print(id);
                pw.close();
            } catch (Exception ex) {
                System.out.println("There is an Exception in creating the IDs file");
            }
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

}
