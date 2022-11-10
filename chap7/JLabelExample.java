package chap7;
import java.awt.Font;
import javax.swing.*;
public class JLabelExample {
    
    
    public static void main(String[] args) {
        JFrame frm = new JFrame("Suban Noksang");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl1 ,lbl2 ;
        lbl1 = new JLabel("My name is ");
        lbl1.setFont(new Font("Tahoma",Font.PLAIN,30));
        
        lbl2 = new JLabel("Niracha");
        lbl2.setFont(new Font("Tahoma", Font.PLAIN,30));
        
        JPanel pnl = new JPanel();
        pnl.add(lbl1); pnl.add(lbl2);
        
        frm.add(pnl);
        
        
        
        
        
        
        frm.setVisible(true); 
    }
    
}