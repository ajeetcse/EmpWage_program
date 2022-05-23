public class Uc3 {
    public static void main(String[] args){
        int Part_Time = 1;
        int Full_Time = 2;
        int Emp_Rate_per_Hrs=20;
            //variables
        int empHrs = 0;
        int empWedge = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == Part_Time)
            empHrs = 4;
        else if (empCheck == Full_Time)
            empHrs = 8;
        else
            empHrs = 0;
        empWedge = empHrs * Emp_Rate_per_Hrs;
        System.out.println("Emp Wdge:" +empWedge);

    }
}
