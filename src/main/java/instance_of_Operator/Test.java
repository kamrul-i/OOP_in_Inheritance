package instance_of_Operator;

public class Test {

    public static void main(String[] args) {
        //এখানে ৪টি class use করা হয়েছে, main class থেকে অন্য class-কে call করা হয়েছে।।
        //এখানে multilevel inheritance use করা হয়েছে।।

        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        Grass grass = new Grass();

        System.out.println(tiger instanceof Tiger);
        System.out.println(deer instanceof Tiger);
        System.out.println(grass instanceof Deer);
        System.out.println(grass instanceof Tiger);
        System.out.println(tiger instanceof Deer);
        System.out.println(tiger instanceof Grass);
    }
    /*
    Tiger -> Deer -> Grass.
    (Tiger খায় Deer, Deer খায় Grass, তার মানে Tiger খায় Grass.) এতোটুকু সত্য
    (Deer খায় Tiger, Grass খায় Deer, তার মানে Grass খায় Tiger.) এতোটুকু মিথ্যা
    //---------------------------------------
    Tiger extends করেছে Tiger. -> true
    Deer extends করেছে Tiger. -> true
    Grass extends করেছে Deer. -> true
    তার মানে Grass extends করেছে Tiger. -> true
    
    Tiger অন্য কাউকে extends করে নাই, //super class অন্য কাউকে extends করে না।। 
    Tiger extends করেছে Deer. -> false
    Tiger extends করেছে Grass. -> false
    //-----------------------------------------
    Tiger খায় Deer, তার মানে Deer extends করেছে Tiger.
    Deer খায় Grass, তার মানে Grass extends করেছে Deer.
    Tiger খায় Grass, তার মানে Grass extends করেছে Tiger.
    
    Deer খাবে না Tiger, তার মানে Tiger extends করে না Deer.
    Grass খাবে না Deer, তার মানে Deer extends করে না Grass.
    Grass খাবে না Tiger, তার মানে Tiger extends করে না Grass.
    
     */

}
