package oop_in_inheritance;

public class OOP_in_Inheritance {

    public static void main(String[] args) {
        System.out.println("Types of inheritance in object oriented programming_OOP.");
    }
    /*
    There are 4 types of inheritance in object oriented programming_OOP.
        1. Single inheritane.  
            এখানে ২টি class থাকবে, ১টি class অন্য class-কে extends করবে।।
    
        2. multilevel inheritance. 
            এখানে কয়েকটি class চেইন আকারে থাকতে পারে, 
            ১টি class অপর class-কে extends করবে।। যেমন, A->B->C->D->E->F->G.
            (A extends B, B extends C, C extends D, D extends E, E extends F).
    
        3. Hierarchical inheritance. 
            এখানে কয়েকটি class থাকতে পারে,তবে চেইন আকারে নয়, 
            এখানে ১টি super class থাকবে, অন্য সকল class ১টি class-কে extends করবে।। 
            যেমন, A extends B, 
                 A extends C, 
                 A extends D.
    
        4. multiple inheritance. 
            এটা java support করে না, যেমন, A extends B, 
                                        A extends C. ৩নং এর মতো, এতোটুকু সম্ভব।।
    
             তবে D extends B, 
                 D extends C. 
            একই class ২টি class-কে extends করবে, এটা সম্ভব না।। 
    
       (object oriented programming এর interface অংশে এর সমাধান দেখুন।।

     */

}
