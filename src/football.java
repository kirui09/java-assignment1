import java.util.ArrayList;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        //3.Design an array list to display three best properties of a user 10 best football players
String names[];
names=new String[10];
        ArrayList<footballone> list;
        list = new ArrayList<footballone>();
for(int i=0;i<10;i++){
    System.out.println("Enter footballer "+(i+1));
    Scanner read=new Scanner(System.in);
    names[i]=read.next();

        String p1,p2,p3;
        System.out.println("Enter the first best first property");
        p1=read.next();
        System.out.println("Enter the first best second property");
        p2=read.next();
        System.out.println("Enter the first best third property");
        p3=read.next();

        footballone p;
        p = new footballone(p1,p2,p3,names[i]);
        list.add(p);

}
        System.out.println(list.toString());


    }
}
