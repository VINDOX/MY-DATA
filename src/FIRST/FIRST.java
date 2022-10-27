
import jdk.nashorn.internal.ir.WhileNode;
import javax.swing.*;
import static jdk.nashorn.internal.parser.TokenType.ELSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sc
 */

public class FIRST {
    
    public  static void main (String[] argS) {
      
       
       // ADD VARIABLE STRING AND INTERGER AND SIMPLE MATHEMATICKS
       
       String A="KAZINA VINDOX HAGENIMANA";
       int num=28;
       int age=10;
       
      
        System.out.println("MY NAME IS" +"  "+  A +" "+ "I AM " +"  "+ num +" "+ "YEARS OLD");
        System.out.println(num+5);
        
        // ADD IF/ELSE CONDITION
        
        if(age<=10){
        
        System.out.println("your age is less than "+age);
        
        }
        else{
       System.out.println("Your age is not less than "+age);
        }
         //LOOP while
        int c=0;
        while(c!=10){
       c=c+1;
        System.out.println(c);
         
        }
        
        //FOR LOOP
        
       for(int i=11;i!=21;i++){
           
         System.out.println(i);
       }     
    
       // * PRINT USING FOR NESTED LOOP
     for(int k=0;k<=10;k++){
         
      for(int J=0;J<=k ;J++){
         System.out.print("*");   
       } 
       System.out.println("");
       
}
   //INPUT BOX
    //String word=JOptionPane.showInputDialog("ENTER A WORD");
    //while(!(word.equalsIgnoreCase("stop"))){
    //System.out.println(word);
    //word=JOptionPane.showInputDialog("ENTER A WORD");
     
     
     // uppercase translation and lower case translation
    String peter=JOptionPane.showInputDialog("enter word to translate");
    
    if(peter.equalsIgnoreCase("KAZINA")){
      System.out.println("you re translated to uppercase" +" "+ peter.toUpperCase());
    }
      else{
       
        System.out.println("you re translated to LOWERCASE" +" "+ peter.toLowerCase());
    }}}
    

