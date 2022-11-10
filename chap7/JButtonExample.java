package chap7;

import javax.swing.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Suban Noksang");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true); 
        
        JButton btnOk, btnCancel, btnExit;
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        btnExit = new JButton("Exit");
        
        JPanel pnl = new JPanel();
        pnl.add(btnOk); pnl.add(btnCancel); pnl.add(btnExit);
        
        frm.add(pnl);
        frm.setVisible(true);
        
    }
    
}
