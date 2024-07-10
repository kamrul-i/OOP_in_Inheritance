package oop_in_inheritance;

public class Inheritance_Test {

    public static void main(String[] args) {
        //এখানে ৩টি class use করা হয়েছে, main class থেকে অন্য class-গুলোকে call করা হয়েছে।।

        //Teacher class এর variable & method কে call করা হয়েছে।।        
        Teacher t = new Teacher();
        t.setName("Kamrul Islam");
        t.setAge(32);
        t.qualification = "Computer Science";
        t.displayInformation2();

        //Person class এর variable & method কে call করা হয়েছে।।
        Person p = new Person();
        p.setName("Altuf Hussain");
        p.setAge(29);
        p.displayInformation1();
    }
    //setter & getter create করার পর data গুলো asign হিসেবে নয়, parametre হিসেবে declare করতে হবে।।
    //qualification variable-কে private করা হয় নাই, তাই তাকে asign করা হয়েছে।।

    /*
        Teacher t = new Teacher();
        t.setName("Kamrul Islam");
        t.setAge(32);
        t.qualification = "Computer Science";
        t.displayInformation2();
        
        Person p = new Person();
        p.setName("Altuf Hussain");
        p.setAge(29);
        p.displayInformation1();
     */
}
