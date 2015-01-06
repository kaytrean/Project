  public class Prep extends Boys{
  
    public Prep(int approval, int time){
      super (approval, time){ 
    }
    public String convo(You other, String userInput){
    if (userInput.equals("1")){
      return ("Hmm I see");
    }
    if (userInput.equals("2")){
      return("Ugh, can you go bother someone else?");
      approval=approval-1;
      annoyance=annoyance+5;
    }
    }
    }
  }
