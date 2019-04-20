package eeps;

public class GradeClass {

    private String position ;
    private double tax ;
    private double payRate ;

    GradeClass (String position , double tax , double payRate ){

        this.position=position ;
        this.tax=tax ;
        this.payRate=payRate ;

    }

    GradeClass() {};
    
    public double CalcSalary(double workingHours)
        {
            switch (position) {
                case "Manager":
                    this.payRate = 10*workingHours;
                    this.tax = this.payRate*0.23;
                    break;
                case "Team Leader":
                    this.payRate = 8*workingHours;
                    this.tax = this.payRate*0.20;
                    break;
                case "Team Memeber":
                    this.payRate = 6*workingHours;
                    this.tax = this.payRate*0.17;
                    break;
                default:
                    System.out.println("There is an Exception here noo !");
                    break;
            }
            double salary=this.payRate - this.tax;
            return salary;
        }

    public double getTax() {
        return tax;
    }

    public double getpayRate() {
        return payRate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setpayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getPosition() {
        return position;
    }


}

