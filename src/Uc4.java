public class Uc4 {

        public static final int Part_time = 1;
        public static final int Full_time = 2;
        public static final int Emp_rate_per_Hrs = 20;
            public static void main(String[] args){
                int empHrs = 0;
                int empwdge = 0;
                //computation
                int empCheck = (int) Math.floor(Math.random() * 10) %3;
                switch (empCheck){
                    case Part_time:
                        empHrs = 4;
                        break;
                    case Full_time:
                        empHrs = 8;
                        break;
                    default:
                        empHrs = 0;
                }
                empwdge = empHrs * Emp_rate_per_Hrs;
                System.out.println("Emp wedge:" +empwdge);

    }
}
