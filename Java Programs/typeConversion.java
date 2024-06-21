package javaApp;

public class typeConversion {
    public static void  main(String[] args){
        //Implicit Conversion
        int radius = 400;
        double newRadius =  radius;
        System.out.println(newRadius);

        //Explicit Conversion
        double diameter = 4.17;
        int newDiameter = (int) diameter;
        System.out.println(newDiameter);

    }
}
