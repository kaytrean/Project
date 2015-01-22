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

}
//more attractive the boy, the less affection gained
//boolean relationship = false
