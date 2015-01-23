public class Boys{
  public int approval=0;
  public int time;
  public boolean date;
    
    public int getApproval(){
	return approval;
    }
    public void dateMe(){
	if (approval==100){
	    date=true;
	}else{
	    date=false;
	}
    }
}
