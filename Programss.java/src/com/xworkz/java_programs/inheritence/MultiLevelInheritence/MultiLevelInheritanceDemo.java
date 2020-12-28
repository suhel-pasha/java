package com.xworkz.java_programs.inheritence.MultiLevelInheritence;

public class MultiLevelInheritanceDemo {
   public static void main(String[] args) {
            Puppy p = new Puppy();
            p.walk();
            p.eat();
            p.sleep();
            p.bark();
            p.play();

            Dog d=new Dog();
             d.walk();
              d.eat();
              d.sleep();
              d.bark();
        
             Animal a=new Animal();
              a.eat();
              a.walk();
              a.sleep();
       }
 }
