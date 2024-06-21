import java.util.Scanner;
class Student{
    private int eno,fee;
    private String sname,course,cno;
    private void setFee(){
        if(course.equalsIgnoreCase("c"))
            fee=3000;
        else if(course.equalsIgnoreCase("c++"))
            fee=3500;
        else if(course.equalsIgnoreCase("java"))
            fee=4500;
        else if(course.equalsIgnoreCase("python"))
            fee=5000;
    }
    public void getRegister(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter eno");
        eno=s1.nextInt();
        System.out.println("Enter Student name");
        sname = s1.next();
        System.out.println("Enter Course Name");
        course = s1.next();
        System.out.println("Enter Contact number");
        cno = s1.next();
        setFee();
    }
    public void showDetail(){
        System.out.println("Eno is "+eno);
        System.out.println("Name is "+sname);
        System.out.println("Course Selected "+course);
        System.out.println("Contact Number "+cno);
        System.out.println("Course Fees "+fee);
    }

}


public class Demo {
    public static void main(String ar[]){
        /*Student s1;//reference bariable that can contain the reference of actual object
        new Student();//object or instance of class
        */
        Student s1=new Student();
        s1.getRegister();
        s1.showDetail();

    }
}
