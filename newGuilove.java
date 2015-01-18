import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class newGuilove extends JFrame implements ActionListener{
    private Container pane;
    //Panels(places)
    private JPanel panelMain;
    private JPanel panelSchool;
    private JPanel panelSchoolHangout;
    private JPanel panelGym;
    private JPanel panelGymHangout;
    private JPanel panelPark;
    private JPanel panelParkHangout;
    private JPanel panelStore;
    //Buttons(do things)
    private JButton btnSchool;
    private JButton btnLearn;
    private JButton btnSHangout;
    private JButton btnSTalk;
    private JButton btnSGift;
    private JButton btnGym;
    private JButton btnGHangout;
    private JButton btnWorkout;
    private JButton btnGTalk;
    private JButton btnGGift;
    private JButton btnPark;
    private JButton btnPHangout;
    private JButton btnStore;
    private JButton btnStroll;
    private JButton btnPTalk;
    private JButton btnPGift;
    private JButton btnTea;
    private JButton btnNovel;
    private JButton btnHoodie;
    private JButton btnWatch;
    private JButton btnPencil;
    private JButton btnDumbell;
    private JButton btnCD;
    private JButton btnFlour;
    private JButton btnMug;
    private JButton btnCologne;
    //Back to Map
    private JButton btnSchoolMap;
    private JButton btnSchoolHangoutMap;
    private JButton btnGymMap;
    private JButton btnGymHangoutMap;
    private JButton btnParkMap;
    private JButton btnParkHangoutMap;
    private JButton btnHomeMap;
    private JButton btnStoreMap;
    //Image Labels
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
	//going places
	if(e.getSource()==btnSchool){
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
	}
    }
    public newGuilove(){
        
	setTitle("Match");
	setLocation(100,100);
	setSize(920,560);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	pane.setLayout(new CardLayout());
	
	//main menu
	panelMain=new JPanel();
	pane.add(panelMain);
	panelMain.setVisible(true);
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
