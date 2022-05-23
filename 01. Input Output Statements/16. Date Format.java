import java.util.Scanner;

class date {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter an 8 digit number: ");
            int num = sn.nextInt();

            int yy = num%100;
            int mm = (num/10000)%100;
            int dd = (num/1000000)%100;

            System.out.println("");
        }
    }
}