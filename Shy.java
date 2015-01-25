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
      this.approval+= 3;
      return afterConvo;
     }
     
     public String specialConvo1(){
	 String afterSpecial1="";
	 afterSpecial1= "Harry:  Hi... \n You: Hi! Nice day out, huh? \n  Harry: Yeah...I guess... \n You: Are you ok? Are you waiting for someone? \n Harry: No...";
	 this.approval+=10;
	 return afterSpecial1;
     }
     
     public String specialConvo2(){
	 String afterSpecial2="";
	 afterSpecial2="You: You come here often. \n Harry: I love being surrounded by nature, it's really calming. \n You: Me too. It's quiet here. \n You: I also like talking to you. \n Harry: Oh, that's nice.";
	 this.approval+=10;
	 return afterSpecial2;
     }
    
     
        public String gift(String item){
	 String afterGift="";
	 if (this.approval!=0){
	     if (Likes.indexOf(item)!=-1){
		 afterGift="Harry: This is for me? You're too kind...";
		 this.approval = this.approval+20;
	     }else{ afterGift ="Harry: Um… no thanks...\n ~*I suppose he doesn't like that very much*~";
		 this.approval= this.approval-10;
	     }
	 }else afterGift="Harry: What no! STRANGER DANGER! PLEASE LEAVE ME ALONE! \n ~(You must speak to them at least once before you can gift!)~";
	 return afterGift;
     }
 }

