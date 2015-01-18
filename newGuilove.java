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
    

    public void actionPerformed(ActionEvent e){
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
	}else if (e.getSource()==btnSHangout){
	    panelSchoolHangout.setVisible(true);
	    panelSchool.setVisible(false);
	}else if (e.getSource()==btnGHangout){
	    panelGymHangout.setVisible(true);
	    panelGym.setVisible(false);
	}else if (e.getSource()==btnPHangout){
	    panelParkHangout.setVisible(true);
	    panelPark.setVisible(false);
	}
    }
    public newGuilove(){
        
	setTitle("Match");
	setLocation(100,100);
	setSize(720,360);
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
	btnLearn=new JButton("Learn");
	btnSHangout = new JButton("Hangout");
	btnSHangout.addActionListener(this);
	panelSchool.add(btnSHangout);
	panelSchool.add(btnLearn);
	//School Activities
	panelSchoolHangout=new JPanel();
	pane.add(panelSchoolHangout);
	panelSchoolHangout.setVisible(false);
	btnSTalk =new JButton("Talk");
       	btnSGift =new JButton("Gift");
	panelSchoolHangout.add(btnSTalk);
	panelSchoolHangout.add(btnSGift);
	//Gym
        panelGym=new JPanel();
	pane.add(panelGym);
	panelGym.setVisible(false);
	btnWorkout=new JButton("Workout");
	btnGHangout = new JButton("Hangout");
	btnGHangout.addActionListener(this);
	panelGym.add(btnGHangout);
	panelGym.add(btnWorkout);
	//Gym Activities
	panelGymHangout=new JPanel();
	pane.add(panelGymHangout);
	panelGymHangout.setVisible(false);
	btnGTalk =new JButton("Talk");
       	btnGGift =new JButton("Gift");
	panelGymHangout.add(btnGTalk);
	panelGymHangout.add(btnGGift);
	//Park
	panelPark=new JPanel();
	pane.add(panelPark);
	panelPark.setVisible(false);
	btnStroll=new JButton("Stroll");
	btnPHangout = new JButton("Hangout");
	btnPHangout.addActionListener(this);
	panelPark.add(btnPHangout);
	panelPark.add(btnStroll);
	//Park Activities
	panelParkHangout=new JPanel();
	pane.add(panelParkHangout);
	panelParkHangout.setVisible(false);
	btnPTalk =new JButton("Talk");
       	btnPGift =new JButton("Gift");
	panelParkHangout.add(btnGTalk);
	panelParkHangout.add(btnGGift);
	//Store
	panelStore=new JPanel();
	pane.add(panelStore);
	panelStore.setVisible(false);
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
    }

    public static void main(String args[]){
	newGuilove gui=new newGuilove();
	gui.setVisible(true);
    }
}
