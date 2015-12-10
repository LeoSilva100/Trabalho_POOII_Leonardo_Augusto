
package trabalho_3;

import Eventos.Evento_login;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
*
* @author LEO_DRUMS
*/

public class TRABALHO_3 extends JFrame{

public Container c = getContentPane();
public Container p = new JPanel();

public JLabel email_1 = new JLabel("ENTRE COM SEU LOGIN");
public JLabel senha_1 = new JLabel("SENHA");

public JTextField t1 = new JTextField(20);
public JTextField t2 = new JTextField(20);
public JButton b = new JButton("OK");

public TRABALHO_3(){
c.add(email_1);
c.add(t1);
c.add(senha_1);
c.add(t2);
c.add(b);

Evento_login login = new Evento_login(t1,t2,this);
b.addActionListener(login);

setBackground(Color.GRAY);
setSize(300,200);		
setResizable(true);
setVisible(true);
setTitle("LOGIN");
setLayout(new GridLayout(3,2));

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main(String[] args) {
new TRABALHO_3();
}

}
