import java.util.*;
import java.io.*;

public class Example extends BaseChar {

    Random thing = new Random();
    
    public Example(int h, int e, int a, int d, int s, int ac, int c, String n, String w){
	 super(h,e,a,d,s,ac,c,n,w);
    }
    public String action(Boy other, String userInput){
	if(userInput.equals( "1") && thing.nextInt(this.getACC()) > 20 ) {
	    if ((this.getMP() - 20) < 0) {
		return("Not enough energy!");
	    } else {
		int affection = 15 + thing.nextInt(11);
		other.setHP(other.getHP() -  damage);
		this.setMP(this.getMP() - 20);
		return(h);
	    }
	}else if(userInput.equals("2") && thing.nextInt(this.getACC()) > 0) {
	    if ((this.getMP() - 30) < 0) {
		return("Not enough energy!");
	    } else {
	        int affection = 15 + thing.nextInt(11);
		other.setHP(other.getHP() - damage);
		this.setMP(this.getMP() - 30);
		return(this + " talked to " + other + ". " + other + " is appalled and " + this + " has " + " energy.");
	    }
	}else if(userInput.equals("3") && thing.nextInt(this.getACC()) > 20) {
	    if ((this.getMP() - 40) < 0) {
		return("Not enough energy!");
	    } else {
		int affection = 25 + thing.nextInt(11);
		other.setHP(other.getHP() - affection);
	    this.setMP(this.getMP() - 40);
	    return(this + " told a bad joke " + other + ". " + other + " lost " + affection + " approval");
	    }
	} else {
	    if (userInput.equals("1")) {
		this.setMP(this.getMP()-20);
		return "You don't have enough energy";
	    }
	    if (userInput.equals("2")) {
	        this.setMP(this.getMP()-30);
		return "You don't have enough energy";
	    }
	    if (userInput.equals("3")) {
		this.setMP(this.getMP()-40);
		return "You don't have enough energy";
	    }
	    if (userInput.equals("")) {
		return this.toString() + "stared into the distance...";
	    }
	    if (this.getMP() < 0) {
		this.setMP(0); 
	    }
	    return "";
	}
    }	
}
