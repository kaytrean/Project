import java.io.*;
import java.util.*;
import java.util.scanner.*;

public class BaseChar{
    
    public int energy=100;
    public int attractiveness;
    public int brains;
    public int charisma;
    public String name ="";

    public BaseChar(String n){
	setName(n);
	setEnergy(energy);
    }
    public void setName(String name){
	this.name=name;
    }
    //stats
    public void setEnergy(int e){
	this.energy=e;
    }
    public void setAttractiveness(int a){
    	this.attractiveness=a;
    }
    public void setBrains(int b){
    	this.brains=b;
    }
    public void setCharisma(int c){
    	this.charisma=c;
    }
 
 //getting stats   
    public String getName(){
    	return name;
    }
    public int getEnergy(){
    	return engergy;
    }
    public int getAttractiveness(){
    	return attractiveness;
    }
    public int getBrains(){
    	return brains;
    }
    public int getCharisma(){
    	return charisma;
    }
}


//more attractive the boy, the less affection gained
