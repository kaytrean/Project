import java.io.*;
import java.util.*;
import java.util.scanner.*;

public class BaseChar{
    
    public int energy=100;
    public int attractiveness;
    public int brains;
    public int charisma;

    public BaseChar(String n){
	setName(n);
	setEnergy(energy);
    }
    public void setName(String name){
	this.name=name;
    }
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
}
	
