public class Sim{
    public int day;
    public int energy=100;


    public void reEnergize(){
	if (energy==0){
	    energy=100;
	    day++;
	    print "I'm so tired... I better go to bed";
	}
    }
}
