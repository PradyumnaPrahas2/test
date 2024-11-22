package dsa_java;
import java.util.*;
public class enumerations{
    public static void main(String[] args) {
        // DaysOfTheWeek day=DaysOfTheWeek.MONDAY;
        // for(DaysOfTheWeek my:DaysOfTheWeek.values()){
        //     System.out.println(my+ "this is "+my.num+"th day of the week");
        // }
        System.out.println("Please select one item from below");
        for(Menu myItems:Menu.values()){
            System.out.println(myItems+ " "+myItems.rating+" "+myItems.price);
        }

    }
}
enum Menu{
    MANCHURIAN(3.4,250),BURGER(3.9,310),PASTA(4.1,280),PIZZA(3.6,170);
    final double rating;
    final int price;
    Menu(double rating,int price){
        this.rating=rating;
        this.price=price;
    }
}
enum DaysOfTheWeek{
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    final int num;
    DaysOfTheWeek(int num){
        this.num=num;
    }
}