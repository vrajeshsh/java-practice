import java.util.Scanner;

class lateFine {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        double charge = 0;
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter no. of days late: ");
            int days_late = sn.nextInt();
            System.out.print("Enter type of book [T/G]: ");
            String book_type = sn.next();

            if(book_type.equals("T")){
                if(days_late<=10) {
                    charge = 3.5 * days_late;
                }
                else if(days_late<=15){
                    charge = 3.5 * 10 + 5.5 * (days_late - 10);
                }
                else if(days_late <= 30){
                    charge = 3.5 * 10 + 5.5 * 5 + 7 * (days_late - 15);
                }
                else {
                    charge = 3.5 * 10 + 5.5 * 5 + 7 * 15 + 10 * (days_late - 30);
                }
            }
            else if(book_type.equals("G")) {
                if(days_late<=10) {
                    charge = 5 * days_late;
                }
                else if(days_late<=15){
                    charge = 5 * 10 + 7.5 * (days_late - 10);
                }
                else if(days_late <= 30){
                    charge = 5 * 10 + 7.5 * 5 + 10 * (days_late - 15);
                }
                else {
                    charge = 5 * 10 + 7.5 * 5 + 10 * 15 + 15 * (days_late - 30);
                }

            }
            System.out.println("\nDAYS LATE: "+days_late+"\nBOOK TYPE: "+book_type+"\nLATE FEES: Rs "+charge+"\n");
        }
    }
}
        
    