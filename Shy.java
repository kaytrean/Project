import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

 public class Jimmy{
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
      affection+= 1;
      return afterConvo;
      
     }
 }
