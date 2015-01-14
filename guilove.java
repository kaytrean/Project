import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guilove extends JFrame{ // implements ActionListener{
    private Container pane;
    private JPanel canvas;
    private ImageIcon image1=new ImageIcon(getClass().getResource("taec1.PNG"));
    private JLabel label1=new JLabel(image1);;
    private ImageIcon image2=new ImageIcon(getClass().getResource("sukitte.jpg"));;
    private JLabel label2=new JLabel(image2);;
    private JButton b1,b2,b3,b4,b5;
    
    public void actionPerformed(ActionEvent e){
	if (e.getSource()==b1){
	    canvas.update(pane.add(image1));
	}else if (e.getSource()==b2){
	    canvas.update(pane.add(image2));
	}
	   }
 
    public guilove(){
	setTitle("MATCH");
	setLocation(100,100);
	setSize(720,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane=getContentPane();
        pane.setLayout(new FlowLayout());
	
       
	
	b1=new JButton("School");
	//image1=new ImageIcon(getClass().getResource("taec1.PNG"));
	//label1=new JLabel(image1);
	pane.add(b1);
	b1.addActionListener(this);
			
	b2=new JButton("Home");
	//image2=new ImageIcon(getClass().getResource("sukitte.jpg"));
	//label2=new JLabel(image2);
	pane.add(b2);
      	b2.addActionListener(this);

	b3=new JButton("Gym");
	pane.add(b3);
	b4=new JButton("Park");
	pane.add(b4);
	b5=new JButton("Store");
	pane.add(b5);
	
	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(canvas);
    }

    public static void main(String[] args){
	guilove gui=new guilove();
	gui.setVisible(true);
        
    }
}
