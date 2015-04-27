import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import java.util.Random;

public class newGuilove extends JFrame implements ActionListener{
    BaseChar b = new BaseChar();
    Prep p = new Prep();
    Jimmy j=new Jimmy();
    Shy s=new Shy();
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
    JTextArea schoolConvo, gymConvo, parkConvo,storeTalk,homeWords,schoolWords,gymWords,parkWords;
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
	    if (b.getDays()>30) {
		JOptionPane.showMessageDialog(pane,b.notWin());
		}
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
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnHoodie){
	    if(b.money-26>=0){
		b.buy("Hoodie");
		b.money=b.money-26;
		storeTalk.append(newLine+"You bought a hoodie!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnNovel){
	    if(b.money-15>=0){
		b.buy("Romance Novel");
		b.money=b.money-15;
		storeTalk.append(newLine+"You bought a romance novel!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnWatch){
	    if(b.money-90>=0){
		b.buy("Watch");
		b.money=b.money-90;
		storeTalk.append(newLine+"You bought a watch!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnPencil){
	    if(b.money-9>=0){
		b.buy("Pencil");
		b.money=b.money-9;
		storeTalk.append(newLine+"You bought an over priced pencil!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnDumbell){
	    if(b.money-15>=0){
		b.buy("Dumbell");
		b.money=b.money-15;
		storeTalk.append(newLine+"You bought some dumbells!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnCD){
	    if(b.money-9>=0){
		b.buy("CD");
		b.money=b.money-9;
		storeTalk.append(newLine+"You bought a CD!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnFlour){
	    if(b.money-5>=0){
		b.buy("Flour");
		b.money=b.money-5;
		storeTalk.append(newLine+"You bought some flour!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnMug){
	    if(b.money-7>=0){
		b.buy("Mug");
		b.money=b.money-7;
		storeTalk.append(newLine+"You bought a mug!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}else if (e.getSource()==btnCologne){
	    if(b.money-25>=0){
		b.buy("Cologne");
		b.money=b.money-25;
		storeTalk.append(newLine+"You bought cologne!");
		storeTalk.append(newLine+"You now have $"+b.getMoney()+" dollars");
		storeTalk.append(newLine+"You now have "+b.getInventory()+" in your bag");
	    }else{ storeTalk.append(newLine+"You dont have enough money!");
		storeTalk.append(newLine+"You have $"+b.getMoney()+" dollars");
	    }
	}//Giving things
    
	else if (e.getSource()==btnGGift){
	    if(b.getEnergy()>=55){
		String input = JOptionPane.showInputDialog("What would you like to give:" + b.inventory);
		if (b.inventory.indexOf(input)!= -1){
		    gymConvo.append(newLine+j.gift(input));
		}else {gymConvo.append(newLine+"~*WHOOPS! You don't have that in your invetory!*~");
		}
		b.energy=b.energy-55;
		b.inventory.remove(input);
		gymConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	    }else gymConvo.append(newLine+"You don't have enough energy! It is now: "+ b.getEnergy());
	}else if (e.getSource()==btnSGift){
	    if(b.getEnergy()>=55){
		String input = JOptionPane.showInputDialog("What would you like to give:" + b.inventory);
		if (b.inventory.indexOf(input)!= -1){
		    schoolConvo.append(newLine+p.gift(input));
		}else {schoolConvo.append(newLine+"~*WHOOPS! You don't have that in your invetory!*~");
		}
		b.energy=b.energy-55;
		b.inventory.remove(input);
		schoolConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	    }else schoolConvo.append(newLine+"You don't have enough energy! It is now: "+ b.getEnergy());
	}else if (e.getSource()==btnPGift){
	    if(b.getEnergy()>=55){
	   String input = JOptionPane.showInputDialog("What would you like to give:" + b.inventory);
	   if (b.inventory.indexOf(input)!= -1){
	       parkConvo.append(newLine+s.gift(input));
	   }else {parkConvo.append(newLine+"~*WHOOPS! You don't have that in your invetory!*~");
	   
	   	b.energy=b.energy-55;
		b.inventory.remove(input);
		parkConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	   }
	    }else{ parkConvo.append(newLine+"You don't have enough energy! It is now: "+ b.getEnergy());
	    }
	}//talking (OMG FINALLY RIGHT LOL)
    else if (e.getSource()==btnSTalk){
	   if (b.getEnergy()>=50){
	       if (p.approval>=100&&b.brains>=42&&b.charisma>=17&&b.strength>=13&&b.day<=30){
		   schoolConvo.append(newLine+ p.confess());
		   b.relationship=true;
		   JOptionPane.showMessageDialog(pane, "Turns out, Landon really did belong to the upper class of society. \n He often got me expensive things I didn`t want or need, but seeing him try to be romantic was too much fun. \n If I ever do marry him, I certainly would never have to work a day in my life. Good to know. \n \n Congratulations! You completed our game. There are three more endings, do you want to try and get them all? \n (Please exit game and restart HAVE FUN!!!)");
	       }else{
		if (p.approval<20){
		    schoolConvo.append(newLine+p.convo());
		}else if(p.approval<35&& b.brains<15){
		    Random f = new Random();
		    int d=f.nextInt(2)+1;
		    if (d==2){
			schoolConvo.append(newLine+p.specialConvo1());
		    }else{
			schoolConvo.append(newLine+p.convo());
		    }
		}else { 
			Random m = new Random();
			int h =m.nextInt(4)+1;
			if(h>2){
			    schoolConvo.append(newLine+p.specialConvo2());
			}else if (h==2){
			    schoolConvo.append(newLine+p.specialConvo1());
			}else {schoolConvo.append(newLine+p.convo());
			}
		}
	       }b.energy=b.energy-50;
	   gymConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	   } else {gymConvo.append(newLine+" You don't have enough energy! It is now: "+b.getEnergy());
	}
    }
    else if (e.getSource()==btnGTalk){
	if (b.getEnergy()>=50){
	    if (j.approval>=100&&b.strength>=45&&b.charisma>=20&&b.brains>=12&&b.day<=30){
		gymConvo.append(newLine+ j.confess());
		b.relationship=true;
		JOptionPane.showMessageDialog(pane, "He may not be the brightest guy I`ve ever met, but out of everyone in this town, \n Jimmy is definitely one of the nicest. If only I didn`t have to keep in shape so much to keep him happy... \n Oh well, I guess being with him is like promoting future health. \n \n Congratulations! You completed our game. There are three more endings, do you want to try and get them all? \n (Please exit game and restart HAVE FUN!!!)");

	    }else{
		if (j.approval<20){
		    gymConvo.append(newLine+j.convo());
		}else if(j.approval<35&& b.strength<15){
		    Random g = new Random();
		    int q=g.nextInt(2)+1;
		    if (q==2){
			gymConvo.append(newLine+j.specialConvo1());
		    }else{
			gymConvo.append(newLine+j.convo());
		    }
		}else { 
		    Random o = new Random();
		    int U =o.nextInt(4)+1;
		    if(U>2){
			gymConvo.append(newLine+j.specialConvo2());
		    }else if (U==2){
			gymConvo.append(newLine+j.specialConvo1());
		    }else {gymConvo.append(newLine+j.convo());
		    }
		}
	    } b.energy=b.energy-50;
	    gymConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	    }else {
	gymConvo.append(newLine+" You don't have enough energy! It is now: "+b.getEnergy());
    }
    }
	else if (e.getSource()==btnPTalk){
	    if (b.getEnergy()>=50){
		if(s.approval>=100&&b.charisma>=42&&b.brains>=21&&b.strength>=12&&b.day<=30){
		    parkConvo.append(newLine+ s.confess());
		    b.relationship=true;
		    JOptionPane.showMessageDialog(pane, "Harry never really said much, and that hasn`t changed since we started dating. \n I think Mom liked him though, but maybe that`s just because she likes to talk so much. \n He is kinda like an ear to listen to my problems, or a shoulder to fall asleep on.  \n \n Congratulations! You completed our game. There are three more endings, do you want to try and get them all? \n (Please exit game and restart HAVE FUN!!!)");
			}else{
		    if (s.approval<20){
			parkConvo.append(newLine+s.convo());
		    }else if(p.approval<35&& b.charisma<15){
			Random k = new Random();
			int i=k.nextInt(2)+1;
			if (i==2){
			    parkConvo.append(newLine+s.specialConvo1());
			}else{parkConvo.append(newLine+s.convo());
			}
		    }else { 
			Random t = new Random();
			int u =t.nextInt(4)+1;
			if(u>2){
			    parkConvo.append(newLine+s.specialConvo2());
			}else if (u==2){
			    parkConvo.append(newLine+s.specialConvo1());
			}else {parkConvo.append(newLine+s.convo());
			}
		    }
		} b.energy=b.energy-50;
		parkConvo.append(newLine+"Your energy is now: "+b.getEnergy());
	    }else {parkConvo.append(newLine+" You don't have enough energy! It is now: "+b.getEnergy());
	    }
	}
    }
    
	
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
	homeWords = new JTextArea(10,50);
	homeWords.append("What would you like to do?");
	panelHome.add(homeWords);
	homeWords.setColumns(40);
	panelHome.add(new JScrollPane(homeWords));
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
	schoolWords = new JTextArea(10,50);
	schoolWords.append("What would you like to do?");
        panelSchool.add(schoolWords);
	panelSchool.add(new JScrollPane(schoolWords));
	//School Activities
	panelSchoolHangout=new JPanel();
	pane.add(panelSchoolHangout);
	panelSchoolHangout.setVisible(false);
	School2 = new ImageIcon(getClass().getResource("schoolTalk.jpg"));
	labelSchool2= new JLabel(School2);
	panelSchoolHangout.add(labelSchool2);
	btnSTalk =new JButton("Talk");
	btnSTalk.addActionListener(this);
       	btnSGift =new JButton("Gift");
	panelSchoolHangout.add(btnSTalk);
	panelSchoolHangout.add(btnSGift);
	btnSGift.addActionListener(this);
	btnSchoolHangoutMap=new JButton("Back to Map");
	btnSchoolHangoutMap.addActionListener(this);
	panelSchoolHangout.add(btnSchoolHangoutMap);
	schoolConvo = new JTextArea(10,50);
	schoolConvo.append("This is Landon, he's really smart, and cute too i guess... \n ~*What would you like to do?*~");
	schoolConvo.setColumns(20);
	schoolConvo.setRows(10);
	panelSchoolHangout.add(schoolConvo);
	panelSchoolHangout.add(new JScrollPane(schoolConvo));
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
	panelGym.add(gymWords);
	panelGym.add(new JScrollPane(gymWords));
	//Gym Activities
	panelGymHangout=new JPanel();
	pane.add(panelGymHangout);
	panelGymHangout.setVisible(false);
	Gym2 = new ImageIcon(getClass().getResource("gymTalk.jpg"));
	labelGym2= new JLabel(Gym2);
	panelGymHangout.add(labelGym2);
	btnGTalk =new JButton("Talk");
	btnGTalk.addActionListener(this);
       	btnGGift =new JButton("Gift");
	panelGymHangout.add(btnGTalk);
	panelGymHangout.add(btnGGift);
	btnGGift.addActionListener(this);
	btnGymHangoutMap=new JButton("Back to Map");
	btnGymHangoutMap.addActionListener(this);
	panelGymHangout.add(btnGymHangoutMap);
	gymConvo = new JTextArea(10,50);
	gymConvo.append("This is Jimmy, he's captain of the swim team, fencing team, and gymnatics team \n Wow, athletic AND cute. \n ~*What would you like to do?*~");
	gymConvo.setColumns(20);
	gymConvo.setRows(10);
	panelGymHangout.add(new JScrollPane(gymConvo));
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
	parkWords = new JTextArea(10,50);
	parkWords.append("What would you like to do?");
	parkWords.setColumns(20);
	parkWords.setRows(10);
	panelPark.add(parkWords);
	panelPark.add(new JScrollPane(parkWords));
	//Park Activities
	panelParkHangout=new JPanel();
	pane.add(panelParkHangout);
	panelParkHangout.setVisible(false);
	Park2=new ImageIcon(getClass().getResource("parkTalk.jpg"));
	labelPark2=new JLabel(Park2);
	panelParkHangout.add(labelPark2);
	btnPTalk =new JButton("Talk");
	btnPTalk.addActionListener(this);
       	btnPGift =new JButton("Gift");
	btnPGift.addActionListener(this);
	panelParkHangout.add(btnPTalk);
	panelParkHangout.add(btnPGift);
	btnParkHangoutMap=new JButton("Back to Map");
	btnParkHangoutMap.addActionListener(this);
	panelParkHangout.add(btnParkHangoutMap);
	parkConvo = new JTextArea(10,50);
	parkConvo.append("This is Harry, he's pretty quiet, around school he usually reads or listens to music \n by himself in the courtyard. He seems nice \n Maybe I should get to know him better. \n ~*What would you like to do?*~");
	parkConvo.setColumns(20);
	parkConvo.setRows(10);
	panelParkHangout.add(parkConvo);
	panelParkHangout.add(new JScrollPane(parkConvo));
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
	storeTalk = new JTextArea(10,50);
	storeTalk.append("What do you want to buy?");
	panelStore.add(storeTalk);
	panelStore.add(new JScrollPane(storeTalk));
    }

}
