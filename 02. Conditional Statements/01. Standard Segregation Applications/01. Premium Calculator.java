import java.util.Scanner;

class premium {
    public static void main(String args[]){
        System.out.print("\033[H\033[2J");
        try (Scanner sn = new Scanner(System.in)) {
            double prem;
            System.out.print("Enter name: ");
            String name = sn.nextLine();
            System.out.print("Enter age: ");
            int age = sn.nextInt();
            System.out.print("Enter salary: Rs ");
            float sal = sn.nextFloat();
            if(age<20){
                prem = 0;
            } 
            else if(age<=35) {
                prem = .08*sal;
            }
            else if(age<=50) {
                prem = .1*sal;
            }
            else {
                prem = .14*sal;
            }
            System.out.println("\n"+name+"'s total insurance due: Rs "+prem+"\n");
        }
    }
}