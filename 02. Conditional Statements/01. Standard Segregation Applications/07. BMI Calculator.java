import java.util.Scanner;

class bmi {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            String cat;
            System.out.print("\nEnter weight (in Kgs): ");
            float wgt = sn.nextFloat();
            System.out.print("\nEnter height (in mtrs): ");
            float hgt = sn.nextFloat();
            double bmi = wgt/(hgt*hgt);

            if(bmi<15){
                cat = "Starvation";
            }
            else if(bmi<18.5){
                cat = "Underweight";
            }
            else if(bmi<25){
                cat = "Normal";
            }
            else if(bmi<30){
                cat = "Overweight";
            }
            else if(bmi<40){
                cat = "Obese";
            }
            else {
                cat="Morbidly Obesely";
            }
            System.out.println("\nBMI Category: "+cat);
            if(bmi<18.5 || bmi>=25){
                double ideal = 21.75*(hgt*hgt);
                System.out.println("\nIdeal weight: "+(double)Math.round(ideal*100)/100);
            }
        }
    }
}