import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        //1.Overload 'classExample' method to print Five subject names and volumes of five Cylinders respectively.

        String subject;
        Double volume[],height,radius;
        volume=new Double[5];
        Scanner read=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter radius");
            radius=read.nextDouble();
            System.out.println("Enter Height");
            height=read.nextDouble();
            volume[i]=volume(height,radius);
        }
        String array[];
        array=new String[5];
        System.out.println("Enter names of Five Subjects");
        for(int i=0;i<5;i++){
            array[i]=read.next();
        }
        for(int i=0;i<5;i++){
            System.out.println(array[i]);

        }
        for(int i=0;i<5;i++){
            System.out.println(volume[i]);

        }



    }





    public static double volume(double height,double radius){
        double v;
        v=(22/7)*Math.pow(radius,2)*height;
        return v;

    }
    public static int volume(int height,int radius){
        int v;
        v=(22/7)*radius*radius*height;
        return v;

    }
}

