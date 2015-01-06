public class Boys extends BaseChar{
  public int approval;
  public int time;
  public boolean date;
  
  public boolean dateMe(){
    if approval==100{
      date=true;
    }
  }
  
  public int doesHeApprove(){
    //somethingsomething
    approval++;
  }
}

