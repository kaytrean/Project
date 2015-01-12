 public class Gym extends Boys{
  
    public Gym(int approval, int time){
      super (approval, time){ 
    }
    public String convo(You other, String userInput){
    if (userInput.equals("1")){
      return ("Uh yeah, that's cool...");
      annoyance=annoyance+1;
    }
    if (userInput.equals("2")){
      return("I'm kinda in the middle of something...");
      approval=approval-1;
      annoyance=annoyance+5;
    }
    }
    }
  }