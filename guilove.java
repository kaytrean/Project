import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/* 
   STEPS TO ADD NEW MAP:
   1. Create map in map.java
   2. Create function to compile map (make___)
   3. Add map-making function to gui constructor
   4. Add new map to getCurrentMap() function
   5. Add door to new map
   6. Add door to return to old map
   7. 
   
 */

public class guilove extends JFrame{ // implements ActionListener{
    private JPanel canvas;
    private ImageIcon image1;
    private JLabel label1;
    private ImageIcon image2;
    private JLabel label2;
    private JButton b1,b2,b3,b4,b5;

    // public void actionPerformed(ActionEvent e){
    //	if (e.getSource()==b1){
	    


    public guilove(){
	setTitle("MATCH");
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	//pane=getContentPane();
        setLayout(new FlowLayout());
	
		canvas = new JPanel();
	canvas.setPreferrredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.red,2));
	add(canvas);
	*/
	b1=new JButton("School");
	//image1=new ImageIcon(getClass().getResource("taec1.PNG"));
	//label1=new JLabel(image1);
	add(b1);
	//b1.addActionListener(this);
			
	b2=new JButton("Home");
	//image2=new ImageIcon(getClass().getResource("sukitte.jpg"));
	//label2=new JLabel(image2);
	add(b2);
	//	b2.addActionListener(this);
    }

    public static void main(String[] args){
	guilove gui=new guilove();
	gui.setVisible(true);
        
    }
}
