import java.util.Scanner;
class Supply{
    private int Code;
    private String foodName,Sticker,foodType;
    private void GetType(){
        if(Sticker.equalsIgnoreCase("green"))
            foodType = "Vegetarian";
        else if (Sticker.equalsIgnoreCase("yellow")) {
            foodType = "Contains Egg";
        }
        else if (Sticker.equalsIgnoreCase("red")) {
            foodType = "Non - Vegetarian";
        }
    }
    public void FoodIn(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Code ");
        Code = s1.nextInt();
        System.out.println("Enter Name of the Food ");
        foodName= s1.next();
        System.out.println("Enter Sticker");
        Sticker = s1.next();
        GetType();


    }

    public void FoodOut(){
        System.out.println("Food Code is "+Code);
        System.out.println("Given Food is "+foodName);
        System.out.println("Sticker on Food is "+Sticker);
        System.out.println("Type of Food is "+foodType);
    }
}


public class FoodType {
    public static void main(String ar[]){
        Supply s1 = new Supply();
        s1.FoodIn();
        s1.FoodOut();
    }
}
