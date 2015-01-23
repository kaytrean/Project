import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class BaseChar{

    public int energy=100;
    public int strength=10;
    public int brains=10;
    public int charisma=10;
    public boolean relationship=false;
    public int money=10;
    public int day=1;
    public ArrayList<String> inventory = new ArrayList<String>();

    public int getEnergy(){
	return energy;
    }
    public int getStrength(){
	return strength;
    }
    public int getCharisma(){
	return charisma;
    }
    public int getBrains(){
	return brains;
    }
    public int getMoney(){
    	return money;
    }
    public int getDays(){
    	return day;
    }
    public String getInventory(){
	for(int x=0;x<=inventory.size()+1;x++){
	    return inventory.get(x);
	} return "";
    }
     public void buy(String item){
	    inventory.add(item);
    }
}
    
    
    public String learning(){
	String afterLearning="";
	Random r = new Random();
	int n = r.nextInt(3)+1;
	if(energy>=20){
	    if (n==3){
		afterLearning = "Hmm, this wasn't as hard as I expected... I really learned a lot today!";
		brains=brains+3;
		energy=energy-20;
		return afterLearning;
	    }else if (n==2){
		afterLearning = "Hey, I think I'm getting the hang of this!";
		brains=brains+2;
		energy=energy-20;
		return afterLearning;
	    }else{
		afterLearning = "Urgg! I don't understand any of this! I should just stop now...";
		brains=brains+1;
		energy=energy-20;
		return afterLearning;
	    }
	}else{
	    return "I think i've had enough for the day, I should sleep";
	}
    }
    
    public String workout(){
    	String afterWorkout="";
    	Random f = new Random();
    	int x = f.nextInt(3)+1;
    	if (energy>=20){
	    if (x==3){
		afterWorkout = "Hmm, don't I feel healthy!";
    		strength = strength + 3;
    		energy=energy-20;
    		return afterWorkout;
    	}else if (x==2){
		afterWorkout = "Ewww, I feel all sweaty... at least I got some exercise.";
    		strength = strength + 2;
    		energy=energy-20;
    		return afterWorkout;
	    }else{
		afterWorkout = "I think that woman was staring at me...";
    		strength = strength + 1;
    		energy=energy-20;
    		return afterWorkout;
	    }
	}else{
	    return "I think i've had enough for the day, I should sleep";
	}
    }
    public String stroll(){
    	String afterStroll="";
    	Random w = new Random();
    	int z = w.nextInt(3)+1;
    	if (energy>=20){
	    if (z==3){
		afterStroll = "Isn't it just lovely today! I think I can hear the birds...";
    		charisma = charisma + 3;
    		energy=energy-20;
    		return afterStroll;
	    }else if (z==2){
		afterStroll = "What a nice walk! It looks a little cloudy though, I should leave.";
    		charisma = charisma + 2;
    		energy=energy-20;
    		return afterStroll;
	    }else{
		afterStroll = "I think the trees are speaking to me...";
    		charisma = charisma + 1;
    		energy=energy-20;
    		return afterStroll;
	    }
	}else{
	    return "I think i've had enough for the day, I should sleep";
	}
    }
    public String chores(){
	String afterChores="";
    	Random c = new Random();
   	Random k = new Random();
   	int m=k.nextInt(10)+4;
    	int a = c.nextInt(3)+1;
    	if (energy>=20){
	    if (a==3){
		afterChores = "HOLLA HOLLA GET DOLLA!";
    		money = money + m;
		energy=energy-20;
    		return afterChores;
	    }else if (a==2){
		afterChores = "That was a lot of work...";
    		money = money + m;
		energy=energy-20;
    		return afterChores;
    	}else{
		afterChores = "Why is everything so messy? It looks worse than when I started";
    		money = money + m;
		energy=energy-20;
    		return afterChores;
	    }
	}else{
	    return "I think i've had enough for the day, I should sleep";
	}
    }
    public String sleep(){
	    String afterSleep="";
	    energy = 100;
	    day++;
	    afterSleep="I feel well rested! Let's get this day started";
	    return afterSleep;
    }
    
   
