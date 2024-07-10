package oop_in_inheritance;

public class Person {
    //এখানে ৩টি class use করা হয়েছে, main class থেকে এই class-কে call করা হয়েছে।।  

    //private variable
    private String name;
    private int age;

    //getter & setter method -------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //-------------------------

    void displayInformation1() {
        System.out.println("Name  : " + getName());
        System.out.println("Age   : " + getAge());
    }

    /*
    private variables গুলো অন্য class থেকে use করা যাবে না।।
    private variables গুলোকে public হিসেবে ব্যবহার করার জন্য ‍set & get method ব্যবহার করতে হবে।।
        
    set & get method এর আলোচনা:
    every variable must be create setter & getter, but not necessary.
    you could create setter & getter automaticaly.
    follow the steps -> 
    open your java class -> click the right side of the mouse -> select "insert code" -> select "getter & setter"

     */
}
