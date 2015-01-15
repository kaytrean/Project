public class Sim{
    public int day;
    public int energy=100;

/*if (day >30){
	endgame()
}

public void endgame(){
	if (relationship = true){
		do something
	}
	if (relationship = false){
		shopkeeper()
	}
}
talking =10
working = 40
dating = 50
gift giving = 60

items for shop:
tea(goth)
romance novel(gymnast)
hoodie(gymnast)
watch(prep)
overpriced pencil(prep)
dumbells(no one)
cd(goth)
flour(goth)
mug(everyone)
cologne(everyone)
*/

    public void reEnergize(){
	if (energy==0){
	    energy=100;
	    day++;
	    print "I'm so tired... I better go to bed";
	}
    }
}
