import java.util.Scanner;

public class array {
    // 2.Design a 2D array to print First and Second names of people inputed by the user.

    public static void main(String[] args) {

        String names[][];
        names = new String[2][5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter  First Name for student "+(i+1));
            Scanner read=new Scanner(System.in);
            names[0][i]=read.next();
            System.out.println("Enter your Second Name "+(i+1));
            names[1][i]=read.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+")"+  names[0][i]+"  "+names[1][i]);
        }
    }
}
