import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Jimmy extends Boys{
  
     BaseChar c = new BaseChar();

     public ArrayList<String>Likes=new ArrayList<String>();
     public ArrayList<String>Dislikes = new ArrayList<String>();

     public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "Be careful, you wouldnt want to work yourself so hard.";
      }else if (n == 4){
       afterConvo = "Huh? You ok? Anything I can help you with?";
      }else if (n == 3){
	  afterConvo = "Good to see you.";
      }else if (n == 2){
	  afterConvo = "Im starting to think you come here just to spend time with me. Not that I mind...";
      }else{
	  afterConvo = "You did really great today! Huh? No I wasnt watching you!";
      }
      this.approval+= 1;
      return afterConvo;
      
     }
 
     public String gift(String item){
	 String afterGift="";
	 if (Likes.indexOf(item)!=-1){
	     afterGift="Hey, you got this for me? I feel flattered.";
	     this.approval = this.approval+20;
	 }else{ afterGift ="Uh, no thanks, this is really not for me...";
	     
	     this.approval= this.approval-10;

	 }
	 c.energy=c.energy-55;
	 return afterGift;
     }
 }
