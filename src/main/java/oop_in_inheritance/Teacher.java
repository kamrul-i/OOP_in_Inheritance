package oop_in_inheritance;

public class Teacher extends Person {
    //এখানে ৩টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।

    String qualification;

    void displayInformation2() {
        displayInformation1(); //extends করার কারণে super class এর method-কে call করা হয়েছে।।
        System.out.println("qualification : " + qualification);
        System.out.printf("\n");
    }

    /*
    এখানে, 
    Person হলো super class / parent class / base class,
    Teacher হলো sub class / child class / derived class.
    
    Person class-কে Teacher class extends করেছে।। যে extends করে তাকে sub class বলে, যাকে extends করা হয় তাকে super class বলে।।
    super class-কে extends করলে তার সবকিছু sub class-এ চলে আসে, যদিও দেখা যায় না।। extends করলে sub class থেকে super class-এর সবকিছু control করা যায়।।
    
     */
}
