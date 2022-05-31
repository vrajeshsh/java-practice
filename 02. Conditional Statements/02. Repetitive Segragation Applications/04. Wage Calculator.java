import java.util.Scanner;

class wageCalculator {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double hours, wage, rate;
            System.out.print("Enter the number of hours worked: ");
            hours = sn.nextDouble();
            System.out.print("Enter the hourly rate: ");
            rate = sn.nextDouble();

            if(hours<=35){
                wage = hours * rate;
            }
            else if(hours <= 60){
                wage = rate * 35 + 1.5 * rate * (hours-35);
            }
            else if(hours <= 70){
                wage = rate * 35 + 1.5 * rate * 25 + 2 * rate * (hours - 60);
            }
            else {
                wage = rate * 35 + 1.5 * rate * 25 + 2 * rate * 10;
            }
            System.out.println("\nHOURS WORKED: "+hours+"\nRATE: "+rate+"\nWEEKLY WAGE: Rs "+(double)Math.round(wage*100)/100+"\n");
        }
    }
}