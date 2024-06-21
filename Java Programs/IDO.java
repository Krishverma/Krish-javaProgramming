package javaApp;

public class IDO {
    public static void main(String[] args) {
        try{
            int x =0+24;
            int y =48/x;
            System.out.println(y);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("ENd");
        }
    }
}
