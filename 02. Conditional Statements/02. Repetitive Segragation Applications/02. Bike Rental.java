import java.util.Scanner;

class bikeRental {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double charge;
            System.out.print("Enter number of days: ");
            int days = sn.nextInt();

            if(days<=5){
                charge = 500*days;
            }
            else if(days <= 10) {
                charge = 2500 + 400 * (days - 5);
            }
            else {
                charge = 500 * 5 + 400 * 5 + 200 * (days - 10);
            }
            System.out.println("\n\nNO. OF DAYS\t\t:\t"+days+
	        "\nCHARGES\t\t\t:\tRs "+charge+"\n");
        }
    }
}