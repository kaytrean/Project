import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Shy extends Boys{
   
 BaseChar c = new BaseChar();

     public ArrayList<String>Likes=new ArrayList<String>();
     Likes.add("CD");
     Likes.add("Tea");
     Likes.add("Mug");
     Likes.add("Cologne");
     public ArrayList<String>Dislikes = new ArrayList<String>();
     Dislikes.add("Dumbell");
     Dislikes.add("Flour");
     Dislikes.add("Hoodie");
     Dislikes.add("Novel");
     Dislikes.add("Watch");
     Dislikes.add("Pencil");
 
     public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "The sun is very bright today.";
      }else if (n == 4){
       afterConvo = "Yes?";
      }else if (n == 3){
	  afterConvo = "There are many trees here";
      }else if (n == 2){
	  afterConvo = "No... you are not bothering me...";
      }else{
	  afterConvo = "People eat food in the park? Whatever for? What are picnics?";
      }
      affection+= 1;
      return afterConvo;
      
     }
     
       public String gift(String item){
	 String afterGift="";
	 if (Likes.indexOf(item)!=-1){
	     afterGift="This is for me? You’re too kind…";
	     this.approval = this.approval+20;
	 }else{ afterGift ="Um… no thanks...";
	     
	     this.approval= this.approval-10;

	 }
	 c.energy=c.energy-55;
	 return afterGift;
     }
     
 }
 
