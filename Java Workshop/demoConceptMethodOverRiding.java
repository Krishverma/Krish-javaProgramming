class thisChild{
    public static void demoMethod1(){
        System.out.println("Method 1");
    }
    public static void demoMethod2(){
        System.out.println("Method 2");
    }
}
public class demoConceptMethodOverRiding extends thisChild{
    public static void demoMethod1(){
        System.out.println("Method 1 Over Ride");
    }
    public static void main(String[] args) {
        demoConceptMethodOverRiding object = new demoConceptMethodOverRiding();
        object.demoMethod1();
    }
}
