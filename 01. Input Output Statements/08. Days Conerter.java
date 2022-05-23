import java.util.Scanner;

class days {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter number of days: ");
            int total_days = sn.nextInt();
            int years = total_days/365;
            int months = (total_days%365)/30;
            int days = (total_days%365)%30;

            System.out.println("\n"+total_days+" days = "+
            years+" year(s), "+months+" month(s) and "+days+" days\n");
        }
    }
}