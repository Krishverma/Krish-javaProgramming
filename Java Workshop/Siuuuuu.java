class A{
    public void show1(){
        System.out.println("Show1");
    }
    public void show2(){
        System.out.println("Show2");
    }
}
class B extends A{
    public void show3(){
        System.out.println("Show3");
    }
    public void show4(){
        System.out.println("show4");
    }

}
class Maain{
    public static void main(String[] args) {
        B obj = new B();
        obj.show3();

    }
}