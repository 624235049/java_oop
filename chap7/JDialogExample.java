
package chap7;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class JDialogExample {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Suban Noksang");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true); 
        
        JDialog dlg = new JDialog(frm, "Warning!!!");
        dlg.setSize(100,100);
        dlg.setVisible(true);
    }
    
}
