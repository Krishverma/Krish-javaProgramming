class abc{
    int id;
    String name;
    int marks;
    abc(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
public class usingConstructor {
    public static void main(String[] args) {
        abc std1 = new abc(101,"Ram",23);
        abc std2 = new abc(102,"Shyam",34);
        System.out.println(std1.marks);
        System.out.println(std2.name);
    }
}
