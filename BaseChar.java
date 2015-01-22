import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Random;

public class BaseChar{

    public int energy=100;
    public int strength=5;
    public int brains=5;
    public int charisma=5;
    public boolean relationship=false;
    public int money=10;
    public ArrayList<String> inventroy = new ArrayList<String>();

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


    public String learning(){
	String afterLearning="";
	Random r = new Random();
	int n = r.nextInt(3)+1;
	if (n==3){
	    afterLearning = "Hmm, this wasn't as hard as I expected... I really learned a lot today!";
	    brains=brains+3;
	    return afterLearning;
	}else if (n==2){
	    afterLearning = "Hey, I think I'm getting the hang of this!";
	    brains=brains+2;
	    return afterLearning;
	}else{
	    afterLearning = "Urgg! I don't understand any of this! I should just stop now...";
	    brains=brains+1;
	    return afterLearning;
	}
    }
    
    public String workout(){
    	String afterWorkout="";
    	Random f = new Random();
    	int x = f.nextInt(3)+1;
    	if (x==3){
    		afterWorkout = "Hmm, don't I feel healthy!";
    		strength = strength + 3;
    		return afterWorkout;
    	}else if (x==2){
    		afterWorkout = "Ewww, I feel all sweaty... at least I got some exercise.";
    		strength = strength + 2;
    		return afterWorkout;
    	}else{
    		afterWorkout = "I think that woman was staring at me...";
    		strength = strength + 1;
    		return afterWorkout;
	    	}
    }
    public String stroll(){
    	String afterStroll="";
    	Random w = new Random();
    	int z = w.nextInt(3)+1;
    	if (z==3){
    		afterStroll = "Isn't it just lovely today! I think I can hear the birds...";
    		charisma = charisma + 3;
    		return afterStroll;
    	}else if (z==2){
    		afterStroll = "What a nice walk! It looks a little cloudy though, I should leave.";
    		charisma = charisma + 2;
    		return afterStroll;
    	}else{
    		afterStroll = "I think the trees are speaking to me...";
    		charisma = charisma + 1;
    		return afterStroll;
	    }
	}
	public String chores(){
    	String afterChores="";
    	Random c = new Random();
   	Random k = new Random();
   	int m=k.nextInt(10)+5;
    	int a = c.nextInt(3)+1;
    	if (a==3){
    		afterChores = "Isn't it just lovely today! I think I can hear the birds...";
    		money = money + a+m;
    		return afterChores;
    	}else if (a==2){
    		afterChores = "What a nice walk! It looks a little cloudy though, I should leave.";
    		money = money + a + m
    		return afterChores;
    	}else{
    		afterChores = "I think the trees are speaking to me...";
    		money = money + a+m;
    		return afterChores;
	    }
	}
}
//more attractive the boy, the less affection gained
//boolean relationship = false
