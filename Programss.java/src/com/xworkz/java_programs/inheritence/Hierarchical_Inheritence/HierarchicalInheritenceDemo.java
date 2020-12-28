package com.xworkz.java_programs.inheritence.Hierarchical_Inheritence;

public class HierarchicalInheritenceDemo {
     public static void main(String[] args) {
          System.out.println("CSE branch details..."); 
          CSE c=new CSE(); 
          c.DataStructure(); 
          c.MachineLearning();
          c.maths();
          c.physics();
          System.out.println();

        System.out.println("MECH branch details.......");
         MECH m=new MECH();
         m.appliedThermoDynamics();
          m.machineToolAndOperations();
         m.maths();
          m.physics();
         System.out.println();

        System.out.println("ECE branch details...");
         ECE e=new ECE();
          e.maths();
           e.physics();
           e.EmbeddedSystems();
           e.FieldTheory();
         System.out.println();
     }
 }
