
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Jimmy extends Boys{
  
     BaseChar c = new BaseChar();

     public ArrayList<String>Likes=new ArrayList<String>();
     public ArrayList<String>Dislikes = new ArrayList<String>();
   

     public Jimmy(){
	 Likes.add("Novel");
	 Likes.add("Hoodie");
	 Likes.add("Mug");
	 Likes.add("Cologne");
	 Dislikes.add("Dumbell");
	 Dislikes.add("Flour");
	 Dislikes.add("CD");
	 Dislikes.add("Tea");
	 Dislikes.add("Watch");
	 Dislikes.add("Pencil");
     }
     public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "Jimmy: Be careful, you wouldnt want to work yourself so hard.";
      }else if (n == 4){
       afterConvo = "Jimmy: Huh? You ok? Anything I can help you with?";
      }else if (n == 3){
	  afterConvo = "Jimmy: Good to see you.";
      }else if (n == 2){
	  afterConvo = "Jimmy: Im starting to think you come here just to spend time with me. Not that I mind...";
      }else{
	  afterConvo = "Jimmy: You did really great today! Huh? No I wasnt watching you!";
      }
      this.approval+= 1;
      return afterConvo;
      
     }
 
     public String gift(String item){
	 String afterGift="";
	 if (this.approval!=0){
	     if (Likes.indexOf(item)!=-1){
		 afterGift="Jimmy: Hey, you got this for me? I feel flattered.";
		 this.approval = this.approval+20;
	     }else{ afterGift ="Jimmy: Uh, no thanks, this is really not for me...\n ~*I suppose he doesn't like that very much*~";
		 
		 this.approval= this.approval-10;

	     }c.inventory.remove(item);
	 }else afterGift="Jimmy: What no! Who do you think you are? \n ~(You must speak to them at least once before you can gift!)~";
	 c.energy=c.energy-55;
	 return afterGift;
     }
 }
