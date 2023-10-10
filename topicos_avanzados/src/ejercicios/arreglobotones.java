package ejercicios;


import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
*
* @author ccomputoj
*/
public class arreglobotones extends JFrame{​​​​​​​
private arreglobotones(){​​​​​​​
    setTitle("Botones dinámicos");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setSize(400, 400);
    initComponents();
    setVisible(true);
}​​​​​​​
public void initComponents(){​​​​​​​
    Container cpane = this.getContentPane(); //por default toma borderlayout Si no existe obj
    JPanel panelbtn = new JPanel();
            
    ActionListener listener=new ActionListener(){​​​​​​​
        @Override
        public void actionPerformed(ActionEvent e){​​​​​​​                
            if(e.getSource() instanceof JButton){​​​​​​​
                String text=((JButton) e.getSource()).getText();
                //String text = e.getActionCommand();                   
                JOptionPane.showMessageDialog(null, text);
            }​​​​​​​
            //System.out.println("->"+e.getActionCommand());
        }​​​​​​​
    }​​​​​​​
    		       
    String[] oper={​​​​​​​"A","B","C","D","E","F"}​​​​​​​;
    JButton[] arr_btn = new JButton[oper.length];
    int ind=0;
    for (String oper1 : oper) {​​​​​​​
        arr_btn[ind] = new JButton(String.valueOf(oper[ind]));
        //arr_btn[ind].setCursor(new Cursor(Cursor.HAND_CURSOR)); //12 mano
        arr_btn[ind].setMinimumSize(new Dimension(50, 25));
        arr_btn[ind].setPreferredSize(new Dimension(50, 50));
        arr_btn[ind].setMaximumSize(new Dimension(Short.MAX_VALUE,
            Short.MAX_VALUE));
        arr_btn[ind].setMnemonic( oper1.charAt(0));
        arr_btn[ind].setActionCommand(oper1);
        arr_btn[ind].addActionListener(listener);            
        //btn.addActionListener(1);
        panelbtn.add(arr_btn[ind]);
        ind++;
    }​​​​​​​
    add(panelbtn);
}​​​​​​​

public static void main(String args[]){​​​​​​​
    new arreglobotones();
}​​​​​​​

}​​​​​​​




