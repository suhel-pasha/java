package com.xworkz.java_programs.Has_a_Relationship.Aggregation;

 //Library and Student
// class aggregation
public class AggregationDemo {

   public static void main(String[] args) {

     Library library = new Library();
    

     System.out.println("Library has a Student :"+library.student.name);

}

}

