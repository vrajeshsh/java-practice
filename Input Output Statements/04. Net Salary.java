import java.util.Scanner;

class salary {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter basic salary: Rs ");
            float sal = sn.nextFloat();

            double da = 0.42*sal;
            double hra = 0.12*sal;
            double gross = sal+da+hra;
            double it = 0.1*gross;
            double pf = 0.12*gross;
            double net = gross-it-pf;

            System.out.println("\nNet Salary: Rs "+(double)Math.round(net*100)/100+"\n");
        }
    }
}