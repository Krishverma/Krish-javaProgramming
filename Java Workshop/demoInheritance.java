class firstChild{
    public static void demoMethod1(){
        System.out.println("Method 1");
    }
    public static void demoMethod2(){
        System.out.println("Method 2");
    }
}
public class demoInheritance extends firstChild{
    public static void main(String[] args) {
        demoInheritance obj = new demoInheritance();
        obj.demoMethod1();
    }
}
