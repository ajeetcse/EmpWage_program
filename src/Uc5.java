public class Uc5 {
    public static final int Part_Time = 1;
    public static final int Full_Time = 2;
    public static final int Emp_Rate_Per_Hrs = 20;
    public static final int Num_of_days_working = 5;
    public static void main(String[] arg){
        //variables
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

            for (int day = 0; day<Num_of_days_working; day++){
                int empCheck = (int) Math.floor(Math.random() * 10) %3;
                    switch (empCheck){
                        case Part_Time:
                            empHrs = 4;
                            break;
                        case Full_Time:
                            empHrs = 8;
                            break;
                        default:
                            empHrs = 0;
                    }
                    empWage = empHrs * Emp_Rate_Per_Hrs;
                    totalEmpWage += empWage;
                    System.out.println("Emp wage" +empWage);
            }
            System.out.println("totalEmpwage:" +totalEmpWage);
    }
}
