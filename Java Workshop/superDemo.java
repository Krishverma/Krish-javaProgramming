class Emp{
    Emp(){
        System.out.println("Emp class constructor");
    }
}
class HR extends Emp{
    HR(){
        super();
        System.out.println("HR class constructor");
    }
}
class Supercons{
    public static void main(String[] args) {
        HR obj = new HR();
    }
}