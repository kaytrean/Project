
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Jimmy extends Boys{

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
     public String specialConvo1(){
	 String afterSpecial1="";
	 afterSpecial1="Jimmy: Hey! I don't think I've ever seen you before, name's Jim. So, you come here to check out the hot guys huh? \n You: Huh?! What are you trying to say? Do you count as one? \n Jimmy: Hey, I'm just teasing, don't take everything so seriously cutie... \n You: Cutie??? I think you need to watch your attitude. \n Jimmy: Sorry, I don't mean anything by it Amy... Just ignore me if you want. \n You:  Amy? \n Jimmy: Well yeah, I don't know your name, and you look kinda like an Amy.\n You: You could just ask me my name... \n Jimmy: Meh, I probably won't remember it, Amy.";
	 return afterSpecial1;
     }

     public String specialConvo2(){
	 String afterSpecial2="";
	 afterSpecial2="Jimmy: You alright Lola? You don't look so good. \n You: I'm fine... just a bit dizzy. Perhaps I pushed myself too hard. \n Jimmy: You shouldn't be walking alone, do you want me to take you home? \n You: Actually yeah, that would be great.\n Jimmy: Cool, let me just grab my equipment and we'll get going. \n Jimmy: You starting to like this town? I gotta say it's gotten a lot nicer since you came.";
     }

     
 
     public String gift(String item){
	 String afterGift="";
	 if (this.approval!=0){
	     if (Likes.indexOf(item)!=-1){
		 afterGift="Jimmy: Hey, you got this for me? I feel flattered.";		 
		 this.approval = this.approval+20;
	     }else{ afterGift ="Jimmy: Uh, no thanks, this is really not for me...\n ~*I suppose he doesn't like that very much*~";
		 this.approval= this.approval-10;
	     }
	 }else afterGift="Jimmy: What no! Who do you think you are? \n ~(You must speak to them at least once before you can gift!)~";
	 return afterGift;
     }
 }
