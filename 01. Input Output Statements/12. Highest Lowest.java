import java.util.Scanner;
import java.lang.Math;

class highLow {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            System.out.print("Enter a 3-digit number: ");
            int num = sn.nextInt();

            int last = num%10;
            int mid = (num/10)%10;
            int first = (num/100);

            int maxi = Math.max(Math.max(first, mid), last);
            int mini = Math.min(Math.min(first, mid), last);

            System.out.println("\nMaximum of "+first+", "+mid+" and "+last+": "+maxi+
            "\nAnd, minimum: "+mini+"\n");
        }
    }
}