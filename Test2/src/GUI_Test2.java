import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
public class GUI_Test2 extends JFrame
{
    private static final int HEIGHT = 300;
    private static final int WIDTH = 300;
     
    //**********************************
     
    public GUI_Test2() 
    {
        setTitle("GUI Test2");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end constructor
     
    //**********************************
     
    private void createContents()
    {
        JLabel nameMessage = new JLabel("Hello. Testing, one, two, three.");
        add(nameMessage);
         
    } // end createContents
     
    //**********************************
 
    public static void main(String[] args) 
    {
        new GUI_Test2();
    } // end main
 
} // end GUI_Test