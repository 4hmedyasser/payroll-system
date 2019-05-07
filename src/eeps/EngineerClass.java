package eeps;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class EngineerClass extends EmployeeClass{

    private double workingHours;
    private Grade grade;

    public EngineerClass() {
        setId(makeID());
    }
    
    public void addEngineer(String name , int age , double workingHours , Grade grade){

        super.setName(name);
        super.setAge(age);
        this.workingHours=workingHours;
        this.grade=grade ;
        this.salary = grade.calculateSalary(workingHours);
        try {
            addTotext (this.name,this.id,this.age,this.workingHours , this.grade,this.salary);
        } catch (IOException e) {
            System.out.println("There is an Exception here yaa !");
        }
    }

    private void addTotext (String name , int id , int age , double workingHours , Grade grade,double salary) throws IOException {

        File file = new File("Engineers.txt");
        FileWriter fw = new FileWriter(file , true);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(id+"@");
        pw.print(String.format("%s@", name));
        pw.print(String.format("%s@", age));
        pw.print(String.format("%s@", salary));
        pw.print(String.format("%s@", workingHours));
        pw.print(String.format("%s@", grade.getpayRate()));
        pw.print(String.format("%s@", grade.getTax()));
        pw.println(grade.getPosition());

        pw.close();
    }

    public boolean deleteEngineer(String removeID) {

        String temp = "temp.txt";
        String filepath = "Engineers.txt";
        String tempId =" " ;
        String tempName = " " ;
        String tempAge = " " ;
        String tempSalary = " ";
        String tempWorkingHours=" ";
        String tempPayRate = " ";
        String tempTax=" " ;
        String tempPosition =" " ;

        File oldFile = new File (filepath);
        File newFile = new File (temp);

        boolean found = false;
        
        try {

            FileWriter fw = new FileWriter(temp,true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw) ;

            Scanner x = new Scanner(new File (filepath));
            x.useDelimiter("[@\n]");

            while(x.hasNext()){

                tempId=x.next();
                tempName = x.next();
                tempAge=x.next();
                tempSalary=x.next();
                tempWorkingHours=x.next();
                tempPayRate=x.next();
                tempTax=x.next();
                tempPosition = x.next();

                if (!removeID.equals(tempId)){
                    pw.println(tempId+"@"+tempName+"@"+tempAge+"@"+tempSalary+"@"+tempWorkingHours+"@"+tempPayRate+"@"+tempTax+"@"+tempPosition);
                }
                else{
                    found = true;
                }
            }

            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File free = new File (filepath);
            newFile.renameTo(free);

        }
        catch (Exception e)
        {
            System.out.println("Engineers.txt doesn't exist.\n\t@ deleteEngineer");
        }
        if (found == true) {
            return true;
        }
        return false;
    }



    public boolean editEngineer(String removeID , String edName , String edAge , String edworkingHours , String edposition ){

        String temp = "temp.txt";
        String filepath = "Engineers.txt";

        File oldFile = new File (filepath);
        File newFile = new File (temp);
        String tempId =" " ;
        String tempName = " " ;
        String tempAge = " " ;
        String tempSalary = " ";
        String tempWorkingHours=" ";
        String tempPayRate = " ";
        String tempTax=" " ;
        String tempPosition =" " ;

        boolean found = false;
        
        try {

            FileWriter fw = new FileWriter(temp,true);
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter pw = new PrintWriter (bw) ;

            Scanner x = new Scanner(new File (filepath));
            x.useDelimiter("[@\n]");

            while(x.hasNext()){

                tempId=x.next();
                tempName = x.next();
                tempAge=x.next();
                tempSalary=x.next();
                tempWorkingHours=x.next();
                tempPayRate=x.next();
                tempTax=x.next();
                tempPosition = x.next();

                if (!removeID.equals(tempId)){
                    pw.println(tempId+"@"+tempName+"@"+tempAge+"@"+tempSalary+"@"+tempWorkingHours+"@"+tempPayRate+"@"+tempTax+"@"+tempPosition);
                }
                else
                {
                    pw.println(tempId+"@"+edName+"@"+edAge+"@"+tempSalary+"@"+edworkingHours+"@"+tempPayRate+"@"+tempTax+"@"+edposition);
                    found = true;
                }
            }

            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File free = new File (filepath);
            newFile.renameTo(free);

        }
        catch (Exception e)
        {
            
            System.out.println("Engineers.txt doesn't exist.\n\t@ editEngineer");

        }
        if (found == true) {
            return true;
        }
        return false;
    }
    
    public ArrayList<ArrayList<String>> viewEngineers(){
        String filepath="Engineers.txt";
        ArrayList<ArrayList<String>> EngList = new ArrayList<ArrayList<String>>();
        try {
            String id =" ";
            String name=" ";
            String age=" ";
            String salary=" ";
            String workHours=" ";
            String payRate=" ";
            String tax =" ";
            String position=" ";

            Scanner w = new Scanner(new File(filepath));
            w.useDelimiter("[@\n]");
            int i = 0;
            while(w.hasNext()) {
                    ArrayList<String> tempEngList = new ArrayList<String>();

                    id=w.next();
                    name=w.next();
                    age=w.next();
                    salary=w.next();
                    workHours = w.next();
                    payRate= w.next();
                    tax=w.next();
                    position = w.next();

                    tempEngList.add(id);
                    tempEngList.add(name);
                    tempEngList.add(age);
                    tempEngList.add(salary);
                    tempEngList.add(workHours);
                    tempEngList.add(payRate);
                    tempEngList.add(tax);
                    tempEngList.add(position);

                    EngList.add(tempEngList);

                }
            
            } catch (Exception e) {
                System.out.println("Engineers.txt doesn't exist.\n\t@ viewEngineers");
            }
        return EngList;
    }
    
    public double getworkingHours() {
        return workingHours;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setworkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}

