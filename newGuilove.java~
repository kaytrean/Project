import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class newGuilove extends JFrame implements ActionListener{
    BaseChar b = new BaseChar();
    //Prep p = new Prep();
    Jimmy j=new Jimmy();
    //shy s=new shy();
    private String newLine="\n";

    private Container pane;
    //Opening Sequence
    private JPanel panelOpening1,panelOpening2,panelOpening3, panelCharacter;
    private JTextArea Opening1,Opening2,MapText;
    //Panels(places)
    private JPanel panelMain,panelSchool, panelSchoolHangout,panelGym;
    private JPanel panelGymHangout, panelPark, panelParkHangout;
    private JPanel panelStore, panelHome;
    //Buttons(do things)
    private JButton btnStart,btnG1,btnG2,btnG3,btnNext1,btnNext2;
    private JButton btnHome, btnSleep,btnChores;
    private JButton btnSchool, btnLearn,btnSHangout,btnSTalk,btnSGift;
    private JButton btnGym,btnGHangout,btnWorkout,btnGTalk,btnGGift;
    private JButton btnPark,btnPHangout, btnStroll, btnPTalk, btnPGift;
    private JButton btnStore, btnTea, btnNovel, btnHoodie, btnWatch, btnPencil, btnDumbell, btnCD, btnFlour,btnMug, btnCologne;
    //conversations(and other text things)
    private JTextArea schoolConvo, gymConvo, parkConvo,storeTalk,homeWords,schoolWords,gymWords,parkWords;
    /*private JScrollPane scroll = new JScrollPane(schoolConvo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private JScrollPane scroll1 = new JScrollPane(gymConvo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private JScrollPane scroll2 = new JScrollPane(parkConvo, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private JScrollPane scroll3 = new JScrollPane(storeTalk, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private JScrollPane scroll4 = new JScrollPane(homeWords, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private JScrollPane scroll5 = new JScrollPane(schoolWords, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    */
    private JScrollPane scroll6 = new JScrollPane(gymWords, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    // private JScrollPane scroll7 = new JScrollPane(parkWords, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
   
    //Back to Map
    private JButton btnSchoolMap, btnSchoolHangoutMap;
    private JButton btnGymMap, btnGymHangoutMap;
    private JButton btnParkMap, btnParkHangoutMap;
    private JButton btnHomeMap;
    private JButton btnStoreMap;
    //Image Labels
    private ImageIcon Title;
    private JLabel labelTitle;
    private ImageIcon G1, G2,G3;
    private JLabel avatar1,avatar2,avatar3;
    private ImageIcon OpeningRoom;
    private JLabel labelOpeningRoom;
    private ImageIcon Map;
    private JLabel labelMap;
    private ImageIcon Home1;
    private JLabel labelHome1;
    private ImageIcon School1,School2;
    private JLabel labelSchool1,labelSchool2;
    private ImageIcon Gym1,Gym2;
    private JLabel labelGym1,labelGym2;
    private ImageIcon Park1,Park2;
    private JLabel labelPark1,labelPark2;
    private ImageIcon Store1;
    private JLabel labelStore1;
    
    public void actionPerformed(ActionEvent e){
	//opening
	if(e.getSource()==btnStart){
	    panelCharacter.setVisible(true);
	    panelOpening1.setVisible(false);
	}else if(e.getSource()==btnG1||e.getSource()==btnG2||e.getSource()==btnG3){
	    panelOpening2.setVisible(true);
	    panelCharacter.setVisible(false);
	}else if (e.getSource()==btnNext1){
	    panelOpening3.setVisible(true);
	    panelOpening2.setVisible(false);
	}else if (e.getSource()==btnNext2){
	    panelMain.setVisible(true);
	    panelOpening3.setVisible(false);
	//going places
	}else if(e.getSource()==btnHome){
	    panelHome.setVisible(true);
	    panelMain.setVisible(false);
	}else if(e.getSource()==btnSchool){
	    panelSchool.setVisible(true);
	    panelMain.setVisible(false);
	}else if(e.getSource()==btnGym){
	    panelGym.setVisible(true);
	    panelMain.setVisible(false);
	}else if(e.getSource()==btnPark){
	    panelPark.setVisible(true);
	    panelMain.setVisible(false);
	}else if (e.getSource()==btnStore){
	    panelStore.setVisible(true);
	    panelMain.setVisible(false);
	}//hangingout
	else if (e.getSource()==btnSHangout){
	    panelSchoolHangout.setVisible(true);
	    panelSchool.setVisible(false);
	}else if (e.getSource()==btnGHangout){
	    panelGymHangout.setVisible(true);
	    panelGym.setVisible(false);
	}else if (e.getSource()==btnPHangout){
	    panelParkHangout.setVisible(true);
	    panelPark.setVisible(false);
	}else if (e.getSource()==btnSchoolMap){
	    panelMain.setVisible(true);
	    panelSchool.setVisible(false);
	}//doing things
	else if (e.getSource()==btnLearn){
	    schoolWords.append(newLine+b.learning());
	    schoolWords.append(newLine+"Your smarts level is now:"+b.getBrains());
	    schoolWords.append(newLine+"Your energy is now:"+b.getEnergy());
	}else if (e.getSource()==btnWorkout){
	    gymWords.append(newLine+b.workout());
	    gymWords.append(newLine+"Your strength level is now:"+b.getStrength());
	    gymWords.append(newLine+"Your energy is now:"+b.getEnergy());
	}else if (e.getSource()==btnStroll){
	    parkWords.append(newLine+b.stroll());
	    parkWords.append(newLine+"Your charisma level is now:"+b.getCharisma());
	    parkWords.append(newLine+"Your energy is now:"+b.getEnergy());
	}else if (e.getSource()==btnChores){
	    homeWords.append(newLine+b.chores());
	    homeWords.append(newLine+"You now have $"+b.getMoney()+" dollars");
	    homeWords.append(newLine+"Your energy is now:"+b.getEnergy());
	}else if (e.getSource()==btnSleep){
	    homeWords.append(newLine+b.sleep());
	    homeWords.append(newLine+"Your energy level is now: "+b.getEnergy());
	    homeWords.append(newLine+"You now have "+(31-b.getDays())+" days left");
	}
	//back to map
	else if (e.getSource()==btnSchoolHangoutMap){
	    panelMain.setVisible(true);
	    panelSchoolHangout.setVisible(false);
	}else if (e.getSource()==btnGymMap){
	    panelMain.setVisible(true);
	    panelGym.setVisible(false);
	}else if (e.getSource()==btnGymHangoutMap){
	    panelMain.setVisible(true);
	    panelGymHangout.setVisible(false);
	}else if (e.getSource()==btnParkMap){
	    panelMain.setVisible(true);
	    panelPark.setVisible(false);
	}else if (e.getSource()==btnParkHangoutMap){
	    panelMain.setVisible(true);
	    panelParkHangout.setVisible(false);
	}else if (e.getSource()==btnStoreMap){
	    panelMain.setVisible(true);
	    panelStore.setVisible(false);
	}else if (e.getSource()==btnHomeMap){
	    panelMain.setVisible(true);
	    panelHome.setVisible(false);
	}//Buying things
	else if (e.getSource()==btnTea){
	    if(b.money-10>=0){
		b.buy("Tea");
		b.money=b.money-10;
		storeTalk.append(newLine+"You bought some tea!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnHoodie){
	    if(b.money-26>=0){
		b.buy("Hoodie");
		b.money=b.money-26;
		storeTalk.append(newLine+"You bought a hoodie!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnNovel){
	    if(b.money-15>=0){
		b.buy("Romance Novel");
		b.money=b.money-15;
		storeTalk.append(newLine+"You bought a romance novel!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnWatch){
	    if(b.money-90>=0){
		b.buy("Watch");
		b.money=b.money-90;
		storeTalk.append(newLine+"You bought a watch!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnPencil){
	    if(b.money-9>=0){
		b.buy("Pencil");
		b.money=b.money-9;
		storeTalk.append(newLine+"You bought an over priced pencil!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//	storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnDumbell){
	    if(b.money-15>=0){
		b.buy("Dumbell");
		b.money=b.money-15;
		storeTalk.append(newLine+"You bought some dumbells!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnCD){
	    if(b.money-9>=0){
		b.buy("CD");
		b.money=b.money-9;
		storeTalk.append(newLine+"You bought a CD!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnFlour){
	    if(b.money-5>=0){
		b.buy("Flour");
		b.money=b.money-5;
		storeTalk.append(newLine+"You bought some flour!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnMug){
	    if(b.money-7>=0){
		b.buy("Mug");
		b.money=b.money-7;
		storeTalk.append(newLine+"You bought a mug!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnCologne){
	    if(b.money-25>=0){
		b.buy("Cologne");
		b.money=b.money-25;
		storeTalk.append(newLine+"You bought cologne!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		//storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}
<<<<<<< HEAD
	}
=======
	else if (e.getSource()==btnGGift){
	    gymConvo.append(newLine+"What would you like to give?");
	    gymConvo.append()
	    j.gift()
    }
>>>>>>> origin/master
    public newGuilove(){
        
	setTitle("Match");
	setLocation(0,0);
	setSize(950,660);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new CardLayout());
	//opening scene
	panelOpening1 =new JPanel();
	pane.add(panelOpening1);
	panelOpening1.setVisible(true);
	Title = new ImageIcon(getClass().getResource("match.png"));
	labelTitle = new JLabel (Title);
	panelOpening1.add(labelTitle);
	btnStart=new JButton("START!");
	btnStart.addActionListener(this);
	panelOpening1.add(btnStart);
	//avatar choose
	panelCharacter=new JPanel();
	pane.add(panelCharacter);
	panelCharacter.setVisible(false);
	G1 = new ImageIcon(getClass().getResource("girl1.png"));
	avatar1=new JLabel(G1);
	panelCharacter.add(avatar1);
	G2 = new ImageIcon(getClass().getResource("girl2.jpg"));
	avatar2=new JLabel(G2);
	panelCharacter.add(avatar2);
	G3 = new ImageIcon(getClass().getResource("girl3.jpg"));
	avatar3=new JLabel(G3);
	panelCharacter.add(avatar3);
	btnG1= new JButton("Avatar 1");
	btnG1.addActionListener(this);
	btnG2=new JButton("Avatar 2");
	btnG2.addActionListener(this);
	btnG3=new JButton("Avatar 3");
	btnG3.addActionListener(this);
	panelCharacter.add(btnG1);
	panelCharacter.add(btnG2);
	panelCharacter.add(btnG3);
	//back story
	panelOpening2=new JPanel();
	panelOpening2.setVisible(false);
	pane.add(panelOpening2);
	Opening1 = new JTextArea("This is my home. For 3 years,nothing eventful has ever happened to me. \n I've lived an extraordinarily ordinary life... until the day I moved.");
	panelOpening2.add(Opening1);
	OpeningRoom = new ImageIcon(getClass().getResource("room.jpg"));
	labelOpeningRoom= new JLabel(OpeningRoom);
	panelOpening2.add(labelOpeningRoom);
	btnNext1=new JButton("Next");
	btnNext1.addActionListener(this);
	panelOpening2.add(btnNext1);
	panelOpening3=new JPanel();
	panelOpening3.setVisible(false);
	pane.add(panelOpening3);
	Opening2 = new JTextArea("It wasn't as if I had many friends to begin with, but still... moving to a completely new place? It's all too strange. \n New school, new places to discover...and on top of that Mom wants me to find a boyfriend. \n Well, if it's the only thing that will get her off my back.... then I must have a date before she visits me next month!");
	panelOpening3.add(Opening2);
	btnNext2= new JButton("Let's Go!");
	btnNext2.addActionListener(this);
	panelOpening3.add(btnNext2);
	//main menu
	panelMain=new JPanel();
	pane.add(panelMain);
	panelMain.setVisible(false);
	btnHome=new JButton("Home");
	btnHome.addActionListener(this);
	panelMain.add(btnHome);
	btnSchool=new JButton("School");
	btnSchool.addActionListener(this);
	panelMain.add(btnSchool);
	btnGym= new JButton("Gym");
	btnGym.addActionListener(this);
	panelMain.add(btnGym);
	btnPark=new JButton("Park");
	btnPark.addActionListener(this);
	panelMain.add(btnPark);
	btnStore=new JButton("Store");
	btnStore.addActionListener(this);
	panelMain.add(btnStore);
	Map = new ImageIcon(getClass().getResource("map1.png"));
	labelMap= new JLabel(Map);
	panelMain.add(labelMap);
	MapText = new JTextArea("From my map, I can go to different locations every day. \n It is still summer vacation, but I can still go to the local school to catch up on my studies. \n I could go to the gym if I want to work out... Or maybe just the park if I want to relax. \n There is also a store nearby if I want to go shopping.");
	MapText.setColumns(40);
	MapText.setRows(10);
	panelMain.add(MapText);
	//home
	panelHome=new JPanel();
	pane.add(panelHome);
	panelHome.setVisible(false);
	Home1= new ImageIcon(getClass().getResource("home.png"));
	labelHome1=new JLabel(Home1);
	panelHome.add(labelHome1);
	btnSleep = new JButton("Sleep");
	btnSleep.addActionListener(this);
	btnChores=new JButton("Chores");
	btnChores.addActionListener(this);
	panelHome.add(btnSleep);
	panelHome.add(btnChores);
	btnHomeMap=new JButton("Back to Map");
	btnHomeMap.addActionListener(this);
	panelHome.add(btnHomeMap);
	homeWords = new JTextArea("What would you like to do?");
	panelHome.add(homeWords);
	//school
	panelSchool=new JPanel();
	pane.add(panelSchool);
	panelSchool.setVisible(false);
	School1=new ImageIcon(getClass().getResource("school.jpg"));
	labelSchool1=new JLabel(School1);
	panelSchool.add(labelSchool1);
	btnLearn=new JButton("Learn");
	btnLearn.addActionListener(this);
	btnSHangout = new JButton("Hangout");
	btnSHangout.addActionListener(this);
	panelSchool.add(btnSHangout);
	panelSchool.add(btnLearn);
	btnSchoolMap=new JButton("Back to Map");
	btnSchoolMap.addActionListener(this);
	panelSchool.add(btnSchoolMap);
	schoolWords = new JTextArea("What would you like to do?");
	panelSchool.add(schoolWords);
	//School Activities
	panelSchoolHangout=new JPanel();
	pane.add(panelSchoolHangout);
	panelSchoolHangout.setVisible(false);
	School2 = new ImageIcon(getClass().getResource("schoolTalk.jpg"));
	labelSchool2= new JLabel(School2);
	panelSchoolHangout.add(labelSchool2);
	btnSTalk =new JButton("Talk");
       	btnSGift =new JButton("Gift");
	panelSchoolHangout.add(btnSTalk);
	panelSchoolHangout.add(btnSGift);
	btnSchoolHangoutMap=new JButton("Back to Map");
	btnSchoolHangoutMap.addActionListener(this);
	panelSchoolHangout.add(btnSchoolHangoutMap);
	schoolConvo = new JTextArea("This is Landon, he's really smart, and cute too i guess... \n ~What would you like to do?~");
	schoolConvo.setColumns(20);
	schoolConvo.setRows(10);
	panelSchoolHangout.add(schoolConvo);
	//Gym
        panelGym=new JPanel();
	pane.add(panelGym);
	panelGym.setVisible(false);
	Gym1=new ImageIcon(getClass().getResource("gym.jpg"));
	labelGym1=new JLabel(Gym1);
	panelGym.add(labelGym1);
	btnWorkout=new JButton("Workout");
	btnWorkout.addActionListener(this);
	btnGHangout = new JButton("Hangout");
	btnGHangout.addActionListener(this);
	panelGym.add(btnGHangout);
	panelGym.add(btnWorkout);
	btnGymMap=new JButton("Back to Map");
	btnGymMap.addActionListener(this);
	panelGym.add(btnGymMap);
	gymWords = new JTextArea("What would you like to do?");
	gymWords.setColumns(20);
	gymWords.setRows(10);
	panelGym.add(scroll6);
	panelGym.add(gymWords);
	//Gym Activities
	panelGymHangout=new JPanel();
	pane.add(panelGymHangout);
	panelGymHangout.setVisible(false);
	Gym2 = new ImageIcon(getClass().getResource("gymTalk.jpg"));
	labelGym2= new JLabel(Gym2);
	panelGymHangout.add(labelGym2);
	btnGTalk =new JButton("Talk");
       	btnGGift =new JButton("Gift");
	panelGymHangout.add(btnGTalk);
	panelGymHangout.add(btnGGift);
	btnGymHangoutMap=new JButton("Back to Map");
	btnGymHangoutMap.addActionListener(this);
	panelGymHangout.add(btnGymHangoutMap);
	gymConvo = new JTextArea("This is Jimmy, he's captain of the swim team, fencing team, and gymnatics team \n Wow, athletic AND cute. \n ~What would you like to do?~");
	gymConvo.setColumns(20);
	gymConvo.setRows(10);
	panelGymHangout.add(gymConvo);
	//Park
	panelPark=new JPanel();
	pane.add(panelPark);
	panelPark.setVisible(false);
        Park1=new ImageIcon(getClass().getResource("park.jpg"));
	labelPark1=new JLabel(Park1);
	panelPark.add(labelPark1);
	btnStroll=new JButton("Stroll");
	btnStroll.addActionListener(this);
	btnPHangout = new JButton("Hangout");
	btnPHangout.addActionListener(this);
	panelPark.add(btnPHangout);
	panelPark.add(btnStroll);
	btnParkMap=new JButton("Back to Map");
	btnParkMap.addActionListener(this);
	panelPark.add(btnParkMap);
	parkWords = new JTextArea("What would you like to do?");
	parkWords.setColumns(20);
	parkWords.setRows(10);
	panelPark.add(parkWords);
	//Park Activities
	panelParkHangout=new JPanel();
	pane.add(panelParkHangout);
	panelParkHangout.setVisible(false);
	Park2=new ImageIcon(getClass().getResource("parkTalk.jpg"));
	labelPark2=new JLabel(Park2);
	panelParkHangout.add(labelPark2);
	btnPTalk =new JButton("Talk");
       	btnPGift =new JButton("Gift");
	panelParkHangout.add(btnPTalk);
	panelParkHangout.add(btnPGift);
	btnParkHangoutMap=new JButton("Back to Map");
	btnParkHangoutMap.addActionListener(this);
	panelParkHangout.add(btnParkHangoutMap);
	parkConvo = new JTextArea("This is Harry, he's pretty quiet, around school he usually reads or listens to music \n by himself in the courtyard. He seems nice \n Maybe I should get to know him better. \n ~What would you like to do?~");
	parkConvo.setColumns(20);
	parkConvo.setRows(10);
	panelParkHangout.add(parkConvo);
	//Store
	panelStore=new JPanel();
	pane.add(panelStore);
	panelStore.setVisible(false);
	Store1=new ImageIcon(getClass().getResource("store.jpg"));
	labelStore1=new JLabel(Store1);
	panelStore.add(labelStore1);
	btnTea=new JButton("Tea: $10");
	btnNovel = new JButton("Romance Novel: $15");
	btnHoodie =new JButton("Hoodie: $26");
	btnWatch = new JButton("Watch: $90");
	btnPencil =new JButton("Over Priced Pencil: $9");
	btnDumbell = new JButton("Dumbells: $15");
	btnCD =new JButton("CD: $9");
	btnFlour = new JButton("Flour: $5");
	btnMug =new JButton("Mug: 7");
	btnCologne = new JButton("Cologne: $25");
	panelStore.add(btnTea);
	btnTea.addActionListener(this);
	panelStore.add(btnNovel);
	btnNovel.addActionListener(this);
	panelStore.add(btnHoodie);
	btnHoodie.addActionListener(this);
	panelStore.add(btnWatch);
	btnWatch.addActionListener(this);
	panelStore.add(btnPencil);
	btnPencil.addActionListener(this);
	panelStore.add(btnDumbell);
	btnDumbell.addActionListener(this);
	panelStore.add(btnCD);
	btnCD.addActionListener(this);
	panelStore.add(btnFlour);
	btnFlour.addActionListener(this);
	panelStore.add(btnMug);
	btnMug.addActionListener(this);
	panelStore.add(btnCologne);
	btnCologne.addActionListener(this);
	btnStoreMap=new JButton("Back to Map");
	btnStoreMap.addActionListener(this);
	panelStore.add(btnStoreMap);
	storeTalk = new JTextArea("What do you want to buy?");
	panelStore.add(storeTalk);
    }

    public static void main(String args[]){
	newGuilove gui=new newGuilove();
	gui.setVisible(true);
    }
}
