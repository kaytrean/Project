import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Shy extends Boys{

     public ArrayList<String>Likes=new ArrayList<String>();
     public ArrayList<String>Dislikes = new ArrayList<String>();
     public Shy(){
	 Likes.add("CD");
	 Likes.add("Tea");
	 Likes.add("Mug");
	 Likes.add("Cologne");
	 Dislikes.add("Dumbell");
	 Dislikes.add("Flour");
	 Dislikes.add("Hoodie");
	 Dislikes.add("Novel");
	 Dislikes.add("Watch");
	 Dislikes.add("Pencil");
     }
 
     public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "Harry: The sun is very bright today.";
      }else if (n == 4){
       afterConvo = "Harry: Yes?";
      }else if (n == 3){
	  afterConvo = "Harry: There are many trees here";
      }else if (n == 2){
	  afterConvo = "Harry: No... you are not bothering me...";
      }else{
	  afterConvo = "Harry: People eat food in the park? Whatever for? What are picnics?";
      }
     approval+= 1;
      return afterConvo;
      
     }
     
        public String gift(String item){
	 String afterGift="";
	 if (this.approval!=0){
	     if (Likes.indexOf(item)!=-1){
		 afterGift="Harry: This is for me? You’re too kind…";
		 this.approval = this.approval+20;
	     }else{ afterGift ="Harry: Um… no thanks...\n ~*I suppose he doesn't like that very much*~";
		 this.approval= this.approval-10;
	     }
	 }else afterGift="Harry: What no! STRANGER DANGER! PLEASE LEAVE ME ALONE! \n ~(You must speak to them at least once before you can gift!)~";
	 return afterGift;
     }
 }

