package chap7;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JPanelExample {
    
    public static void main(String[] args) {
        JPanel pnl;
        JFrame frm = new JFrame("Suban Noksang");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pnl = new JPanel();
        pnl.setBackground(Color.CYAN);
        frm.add(pnl);
        
        
        
        frm.setVisible(true); 
    }
    
}

    
