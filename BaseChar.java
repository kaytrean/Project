import java.io.*;
import java.util.*;
import java.util.scanner.*;
import java.util.ArrayList;

public class BaseChar{

    public int energy=100;
    public int beauty=5;
    public int brains=5;
    public int charisma=5;
    public boolean relationship=false;

    public void setName(String name){
	this.name = name;
    }

    public int getEnergy(){
	return energy;
    }
    public int getBeauty(){
	return beauty;
    }
    public int getCharisma(){
	return charisma;
    }
    public String getName(){
	return this.name;
    }

    ArrayList<String> inventroy = new ArrayList();
    private String name = "";

}
//more attractive the boy, the less affection gained
//boolean relationship = false
