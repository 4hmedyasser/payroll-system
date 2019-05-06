package eeps;

public class Grade implements salaryCalculator{

    private String position;
    private double tax;
    private double payRate;

    Grade (String position , double tax , double payRate ){

        this.position=position;
        this.tax=tax;
        this.payRate=payRate;

    }

    Grade(){};
    
    @Override
    public double calculateSalary(double workingHours)
        {
            switch (position) {
                case "Manager":
                    this.payRate = managerPayRateCoefficient*workingHours;
                    this.tax = this.payRate*managerTaxPercentage;
                    break;
                case "Team Leader":
                    this.payRate = teamLeaderPayRateCoefficient*workingHours;
                    this.tax = this.payRate*teamLeaderTaxPercentage;
                    break;
                case "Team Member":
                    this.payRate = teamMemberPayRateCoefficient*workingHours;
                    this.tax = this.payRate*teamMemberTaxPercentage;
                    break;
                default:
                    System.out.println("Invalid Position");
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

