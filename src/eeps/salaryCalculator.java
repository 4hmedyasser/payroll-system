package eeps;

interface salaryCalculator {
    double managerPayRateCoefficient = 10;
    double teamLeaderPayRateCoefficient = 8;
    double teamMemberPayRateCoefficient = 6;
    
    double managerTaxPercentage = 0.23;
    double teamLeaderTaxPercentage = 0.20;
    double teamMemberTaxPercentage = 0.17;
    
    double calculateSalary (double workinghours);
    
}
