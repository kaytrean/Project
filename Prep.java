  public class Prep extends Boys{
  
    public Prep(int approval, int time){
      super (approval, time){ 
      }
      public String convo(){
      String afterConvo="";
      Random r = new Random();
      int n = r.nextInt(5)+1;
      if (n == 5){
       afterConvo = "I think you come here too often.";
      }else if (n == 4){
       afterConvo = "Hm? Studying again? You know you will never get to my level.";
      }else if (n == 3){
	  afterConvo = "If you are asking me to tutor you, the answer is no.";
      }else if (n == 2){
	  afterConvo = "Consider it an honor I am even talking to you.";
      }else{
	  afterConvo = "Hm? What do you want now?";
      }
      affection+= 1;
      return afterConvo;
      
     }
 }
}
//use Togami pictures
