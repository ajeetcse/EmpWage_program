public class Uc1 {
    public static void main(String[] args){
        int Is_Full_Time = 1;
        int Is_Part_Time= 2;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_Full_Time)
            System.out.println("Employe is present");
        if (empCheck == Is_Part_Time)
            System.out.println("Employee is absent");
    }
}
