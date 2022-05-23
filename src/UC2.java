public class UC2 {
    public static void main(String[] args){
        //constant
        int Full_Time =1;
        int Emp_Rate_per_Hr= 20;
        //variables
        int empHrs = 0;
        int empWadge = 0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Full_Time)
            empHrs=8;
        else

            empHrs =0;
              empWadge = empHrs * Emp_Rate_per_Hr;
        System.out.println("emp wedge: " + empWadge);



    }
}
