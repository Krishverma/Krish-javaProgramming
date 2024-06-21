class demo{
    public void Example(){
        System.out.println("Inside Example");
        class def{
            public void Display(){
                System.out.println("Display");
            }
        }
        System.out.println("This");
        def obj = new def();
        obj.Display();
    }
}
class Mainn{
    public static void main(String[] args) {
        demo obj1 = new demo();
        obj1.Example();
    }
}
