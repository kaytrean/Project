import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class newGuilove extends JFrame implements ActionListener{
    private Container pane;
    //Opening Sequence
    private JPanel panelOpening1,panelOpening2,panelOpening3, panelCharacter;
    private JLabel Opening1,Opening2;
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
    private JButton btnStore, btnTea, btnNovel, btnHoodie, btnWatch, btnPencil;
    private JButton btnDumbell, btnCD, btnFlour,btnMug, btnCologne;
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
    private ImageIcon Opening1;
    private JLabel labelOpening1;
    private ImageIcon Home1;
    private JLabel labelHome1;
    private ImageIcon School1;
    private JLabel labelSchool1;
    private ImageIcon School2;
    private JLabel labelSchool2;
    private ImageIcon Gym1;
    private JLabel labelGym1;
    private ImageIcon Gym2;
    private JLabel labelGym2;
    private ImageIcon Park1;
    private JLabel labelPark1;
    private ImageIcon Park2;
    private JLabel labelPark2;
    private ImageIcon Store1;
    private JLabel labelStore1;

    public void actionPerformed(ActionEvent e){
	//opening
	if(e.getSource()==btnStart){
	    panelCharacter.setVisible(true);
	    panelOpening1.setVisible(false);
	}else if(e.getSource()==btnG1||e.getSource()==btnG2||e.getSource()==btnG3){
	    panelMain.setVisible(true);
	    panelCharacter.setVisible(false);
	}else if (e.getSource()==btnNxt1){
	    panelOpening2.setVisible(true);
	    panelCharacter.setVisible(false);
	}else if (e.getSource()==btnNxt2){
	    panelMain.setVisible(true);
	    panelOpenging2.setVisible(false);
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
	}//back to map
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
	}
    }
    public newGuilove(){
        
	setTitle("Match");
	setLocation(100,100);
	setSize(850,560);
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
	panelOpening2.setVisibilty(false);
	Opening1 = new JLabel("This is my home. For 3 years,nothing eventful has ever happened to me. I've lived an extraordinarily ordinary life... until the day I moved.");
	panelOpening2.add(Opening1);
	Opening1 = new ImageIcon(getClass().getResource("room.jpg"));
	labelOpening1 = new JLabel();
	panelOpening2.add(labelOpening1);
	btnNext1=new JButton("Next");
	btnNext1.addActionListener(this);
	panelOpening2.add(btnNext1);
	panelOpening3=new JPanel();
	panelOpening3.setVisibilty(false);
	Opening2 = new JLabel("It wasn't as if I had many friends to begin with, but still... moving to a completely new place? It's all too strange. New school, new places to discover... and on top of that Mom wants me to find a boyfriend.Well, if it's the only thing that will get her off my back.... then I must have a date before she visits me next month!");
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
	//home
	panelHome=new JPanel();
	pane.add(panelHome);
	panelHome.setVisible(false);
	Home1= new ImageIcon(getClass().getResource("home.png"));
	labelHome1=new JLabel(Home1);
	panelHome.add(labelHome1);
	btnSleep = new JButton("Sleep");
	btnChores=new JButton("Chores");
	panelHome.add(btnSleep);
	panelHome.add(btnChores);
	btnHomeMap=new JButton("Back to Map");
	btnHomeMap.addActionListener(this);
	panelHome.add(btnHomeMap);
	//school
	panelSchool=new JPanel();
	pane.add(panelSchool);
	panelSchool.setVisible(false);
	School1=new ImageIcon(getClass().getResource("school.jpg"));
	labelSchool1=new JLabel(School1);
	panelSchool.add(labelSchool1);
	btnLearn=new JButton("Learn");
	btnSHangout = new JButton("Hangout");
	btnSHangout.addActionListener(this);
	panelSchool.add(btnSHangout);
	panelSchool.add(btnLearn);
	btnSchoolMap=new JButton("Back to Map");
	btnSchoolMap.addActionListener(this);
	panelSchool.add(btnSchoolMap);
	//School Activities
	panelSchoolHangout=new JPanel();
	pane.add(panelSchoolHangout);
	panelSchoolHangout.setVisible(false);
	btnSTalk =new JButton("Talk");
       	btnSGift =new JButton("Gift");
	panelSchoolHangout.add(btnSTalk);
	panelSchoolHangout.add(btnSGift);
	btnSchoolHangoutMap=new JButton("Back to Map");
	btnSchoolHangoutMap.addActionListener(this);
	panelSchoolHangout.add(btnSchoolHangoutMap);
	//Gym
        panelGym=new JPanel();
	pane.add(panelGym);
	panelGym.setVisible(false);
	Gym1=new ImageIcon(getClass().getResource("gym.jpg"));
	labelGym1=new JLabel(Gym1);
	panelGym.add(labelGym1);
	btnWorkout=new JButton("Workout");
	btnGHangout = new JButton("Hangout");
	btnGHangout.addActionListener(this);
	panelGym.add(btnGHangout);
	panelGym.add(btnWorkout);
	btnGymMap=new JButton("Back to Map");
	btnGymMap.addActionListener(this);
	panelGym.add(btnGymMap);
	//Gym Activities
	panelGymHangout=new JPanel();
	pane.add(panelGymHangout);
	panelGymHangout.setVisible(false);
	btnGTalk =new JButton("Talk");
       	btnGGift =new JButton("Gift");
	panelGymHangout.add(btnGTalk);
	panelGymHangout.add(btnGGift);
	btnGymHangoutMap=new JButton("Back to Map");
	btnGymHangoutMap.addActionListener(this);
	panelGymHangout.add(btnGymHangoutMap);
	//Park
	panelPark=new JPanel();
	pane.add(panelPark);
	panelPark.setVisible(false);
        Park1=new ImageIcon(getClass().getResource("park.jpg"));
	labelPark1=new JLabel(Park1);
	panelPark.add(labelPark1);
	btnStroll=new JButton("Stroll");
	btnPHangout = new JButton("Hangout");
	btnPHangout.addActionListener(this);
	panelPark.add(btnPHangout);
	panelPark.add(btnStroll);
	btnParkMap=new JButton("Back to Map");
	btnParkMap.addActionListener(this);
	panelPark.add(btnParkMap);
	//Park Activities
	panelParkHangout=new JPanel();
	pane.add(panelParkHangout);
	panelParkHangout.setVisible(false);
	btnPTalk =new JButton("Talk");
       	btnPGift =new JButton("Gift");
	panelParkHangout.add(btnPTalk);
	panelParkHangout.add(btnPGift);
	btnParkHangoutMap=new JButton("Back to Map");
	btnParkHangoutMap.addActionListener(this);
	panelParkHangout.add(btnParkHangoutMap);
	//Store
	panelStore=new JPanel();
	pane.add(panelStore);
	panelStore.setVisible(false);
	Store1=new ImageIcon(getClass().getResource("store.jpg"));
	labelStore1=new JLabel(Store1);
	panelStore.add(labelStore1);
	btnTea=new JButton("Tea");
	btnNovel = new JButton("Romance Novel");
	btnHoodie =new JButton("Hoodie");
	btnWatch = new JButton("Watch");
	btnPencil =new JButton("Over Priced Pencil");
	btnDumbell = new JButton("Dumbells");
	btnCD =new JButton("CD");
	btnFlour = new JButton("Flour");
	btnMug =new JButton("Mug");
	btnCologne = new JButton("Cologne");
	panelStore.add(btnTea);
	panelStore.add(btnNovel);
	panelStore.add(btnHoodie);
	panelStore.add(btnWatch);
	panelStore.add(btnPencil);
	panelStore.add(btnDumbell);
	panelStore.add(btnCD);
	panelStore.add(btnFlour);
	panelStore.add(btnMug);
	panelStore.add(btnCologne);
	btnStoreMap=new JButton("Back to Map");
	btnStoreMap.addActionListener(this);
	panelStore.add(btnStoreMap);
    }

    public static void main(String args[]){
	newGuilove gui=new newGuilove();
	gui.setVisible(true);
    }
}
