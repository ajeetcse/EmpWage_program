public class Uc6 {
    public static final int Part_Time = 1;
    public static final int Full_Time = 2;
    public static final int Emp_Rate_Per_Hrs = 20;
    public static final int Num_of_Working_Days = 2;
    public static final int Max_Hrs_In_Month = 10;


    public static void main(String[] args){
        System.out.println("Welcome to Employee wage computation program");
        //variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalworkingDays = 0;
        //
        while(totalEmpHrs <= Max_Hrs_In_Month && totalworkingDays < Num_of_Working_Days){
            totalworkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck){
                case Part_Time:
                    empHrs = 4;
                    break;
                case Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs +=empHrs;
            System.out.println("Day#:" + totalworkingDays + "Emp Hr: " +empHrs);
        }
        int totalEmpwage =  totalEmpHrs * Emp_Rate_Per_Hrs;
        System.out.println("Total Emp wage:" + totalEmpwage);
    }
}
