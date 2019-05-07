package eeps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TraineeClass extends EmployeeClass{

    private String universityName ;
    private double GPA ;
    private int academicYear ;
    private final double traineesalary = 1500 ;

    public TraineeClass() {
        setId(makeID());
    }
    
    public void AddTrainee (String name , int age , String universityName , double GPA , int academicYear){

        super.setName(name);
        super.setAge(age);
        this.universityName=universityName;
        this.GPA=GPA;
        this.academicYear=academicYear;
        this.salary = traineesalary;
        
        try {

            addTotext (name,id,age,universityName,GPA,academicYear);

        }

        catch (IOException dfg) {

            System.out.println("There is an Exception here !");

        }
        
    }
    
    private void addTotext (String name , int id , int age , String universityName , double GPA , int academicYear) throws IOException {

        File file = new File("Trainees.txt");
        FileWriter fw = new FileWriter(file , true);
        PrintWriter pw = new PrintWriter(fw);

        pw.print(id+"@");
        pw.print(String.format("%s@", name));
        pw.print(String.format("%s@", age));
        pw.print(String.format("%s@", salary));
        pw.print(String.format("%s@", universityName));
        pw.print(String.format("%s@", GPA));
        pw.println(String.format("%s", academicYear));

        pw.close();
    }
    
    public boolean editTrainee(String removeID , String edname , String edage , String eduniversityName, String edGPA, String edacademicYear){
        
        String temp = "temp.txt";
        String filepath = "Trainees.txt";

        File oldFile = new File (filepath);
        File newFile = new File (temp);
        String tempId =" " ;
        String tempName = " " ;
        String tempAge = " " ;
        String tempSalary = " ";
        String tempUniversityName=" ";
        String tempGPA = " ";
        String tempAcademicYear=" " ;
        
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
                tempUniversityName=x.next();
                tempGPA=x.next();
                tempAcademicYear=x.next();

                if (!removeID.equals(tempId)){
                    pw.println(tempId+"@"+tempName+"@"+tempAge+"@"+tempSalary+"@"+tempUniversityName+"@"+tempGPA+"@"+tempAcademicYear);
                }
                else
                {
                    pw.println(tempId+"@"+edname+"@"+edage+"@"+tempSalary+"@"+eduniversityName+"@"+edGPA+"@"+edacademicYear);
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

            System.out.println("Trainees.txt doesn't exist.\n\t@ editTrainee");

        }
        if (found == true) {
            return true;
        }
        return false;
    }
    
    public boolean deleteTrainee(String removeID){
        String temp = "temp.txt";
        String filepath = "Trainees.txt";
        
        String tempId =" " ;
        String tempName = " " ;
        String tempAge = " " ;
        String tempSalary = " ";
        String tempUniversityName=" ";
        String tempGPA = " ";
        String tempAcademicYear=" " ;

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
                tempUniversityName=x.next();
                tempGPA=x.next();
                tempAcademicYear=x.next();

                if (!removeID.equals(tempId)){
                    pw.println(tempId+"@"+tempName+"@"+tempAge+"@"+tempSalary+"@"+tempUniversityName+"@"+tempGPA+"@"+tempAcademicYear);
                }
                else {
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
            System.out.println("Trainees.txt doesn't exist.\n\t@ deleteTrainee");
        }
        
        if (found == true){
            return true;
        }
        return false;
    }
    
    
    
    public ArrayList<ArrayList<String>> viewTrainees()
    {
    String filepath="Trainees.txt";
    ArrayList<ArrayList<String>> tempViewTrain = new ArrayList<ArrayList<String>>();
        try {
            String id =" ";
            String name=" ";
            String age=" ";
            String salary=" ";
            String universityName=" ";
            String GPA =" ";
            String academicYear=" ";
            
            Scanner w = new Scanner(new File(filepath));
            w.useDelimiter("[@\n]");
            while(w.hasNext()) {
                
                ArrayList<String> tempViewList = new ArrayList<String>();
                
                id=w.next();
                name=w.next();
                age=w.next();
                salary=w.next();
                universityName= w.next();
                GPA= w.next();
                academicYear=w.next();
                
                tempViewList.add(id);
                tempViewList.add(name);
                tempViewList.add(age);
                tempViewList.add(universityName);
                tempViewList.add(academicYear);
                tempViewList.add(GPA);
                tempViewList.add(salary);
                
                tempViewTrain.add(tempViewList);
                
            }
            
        } catch (Exception e) {
            System.out.println("Trainees.txt doesn't exist.\n\t@ viewTrainees");
        }
        
        return tempViewTrain;
        
    }
    
    public ArrayList<ArrayList<String>> searchTrainees(String upgradeID)
    {
        String filepath="Trainees.txt";

        ArrayList<ArrayList<String>> searchResults = new ArrayList<ArrayList<String>>();

        try {
                String tempId = " ";
                String tempName = " ";
                String tempAge = " ";
                String tempSalary = " ";
                String tempUniversity = " ";
                String tempGPA = " ";
                String tempYear = " ";
            
            Scanner x = new Scanner(new File (filepath));
            x.useDelimiter("[@\n]");
                
            while(x.hasNext()){
                
                ArrayList<String> tempResult = new ArrayList<String>();
                
                tempId=x.next();
                tempName = x.next();
                tempAge=x.next();
                tempSalary=x.next();
                tempUniversity=x.next();
                tempGPA=x.next();
                tempYear=x.next();

                if ( upgradeID.equals(tempId) ){
                    tempResult.add(tempId);
                    tempResult.add(tempName);
                    tempResult.add(tempAge);
                    tempResult.add(tempSalary);
                    tempResult.add(tempUniversity);
                    tempResult.add(tempGPA);
                    tempResult.add(tempYear);
                    
                    searchResults.add(tempResult);
                    
                }
            }
            
            x.close();
        }
        catch (Exception e)
        {
            System.out.println("Trainees.txt doesn't exist.\n\t@ searchTrainees");
        }
        
        return searchResults;
    }
    
    public void upgradeTrainee(String upgradeID, String tmpPosition, double workhours){
        
        ArrayList<ArrayList<String>> tempList = searchTrainees(upgradeID);
        
        Grade tmpGrade = new Grade();
        tmpGrade.setPosition(tmpPosition);
        
        EngineerClass tempEmp = new EngineerClass();
        tempEmp.addEngineer(tempList.get(0).get(1), Integer.parseInt( tempList.get(0).get(2) ), workhours, tmpGrade);
            
        deleteTrainee(upgradeID);
        
    }

    public double getGPA() {
        return GPA;
    }

    public double getSalary() {
        return traineesalary;
    }

    public void setuniversityName(String universityName) {
        universityName = universityName;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setacademicYear(int academicYear) {
        academicYear = academicYear;
    }

    public int getacademicYear() {
        return academicYear;
    }

    public String getuniversityName() {
        return universityName;
    }

}
