import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random; 
 public class Prep extends Boys{
  	
  	BaseChar c = new BaseChar();

     public ArrayList<String>Likes=new ArrayList<String>();
     public ArrayList<String>Dislikes = new ArrayList<String>();
     
      public Prep(){
	  Likes.add("Watch");
	  Likes.add("Pencil");
	  Likes.add("Mug");
	  Likes.add("Cologne");
	  Dislikes.add("Dumbell");
	  Dislikes.add("Flour");
	  Dislikes.add("CD");
	  Dislikes.add("Tea");
	  Dislikes.add("Hoodie");
	  Dislikes.add("Novel");
      }
  	
      public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "Landon: I think you come here too often.";
      }else if (n == 4){
       afterConvo = "Landon: Hm? Studying again? You know you will never get to my level.";
      }else if (n == 3){
	  afterConvo = "Landon: If you are asking me to tutor you, the answer is no.";
      }else if (n == 2){
	  afterConvo = "Landon: Consider it an honor I am even talking to you.";
      }else{
	  afterConvo = "Landon: Hm? What do you want now?";
      }
      approval+= 1;
      return afterConvo;
      
      }
      
 public String gift(String item){
	 String afterGift="";
	 if (this.approval!=0){
	     if (Likes.indexOf(item)!=-1){
		 afterGift="Landon: I suppose I can accept this…";
		 this.approval = this.approval+20;
	     }else{ afterGift ="Landon: What is the meaning of this? Are you insulting me? \n ~*I suppose he doesn't like that very much*~";
		 
		 this.approval= this.approval-10;

	     }c.inventory.remove(item);
	 }else afterGift="Landon: What are you doing? Do I even know you? \n ~(You must speak to them at least once before you can gift!)~";
	 c.energy=c.energy-55;
	 return afterGift;
     }
 }
