public class Sim{
    public int day;
    public int energy=100;


    public void reEnergize(){
	if (energy==0){
	    energy=100;
	    day++;
	}
    }
}
