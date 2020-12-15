package com.xworkz.java_programs.Has_a_Relationship.Composition;

//class Compositiondemo

public class CompositionDemo{

    public static void main(String[] args){

    Human human =new Human();

    System.out.println(human.name);
    human.playgame();
    human.heart.heartbeat();
    }
}
