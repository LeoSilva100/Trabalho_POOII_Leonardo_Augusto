package trabalho_3;

import Eventos.Evento_confirmacao;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
*
* @author LEO_DRUMS
*/
public class Confirmacao extends JFrame{

public Container c = getContentPane();
public Container p = new JPanel();

public JLabel l = new JLabel("DESEJA REALMENTE CADASTRAR?");
public JButton b = new JButton("OK");
public JButton b1 = new JButton("CANCELAR");
Cadastro ca;

public Confirmacao(Cadastro ca){
this.ca=ca;
c.add(l);
c.add(b);
c.add(b1);

Evento_confirmacao  conf = new Evento_confirmacao(ca, this, true);    
b.addActionListener(conf);  
Evento_confirmacao  confi = new Evento_confirmacao(ca, this, false);
b1.addActionListener(confi);
    
setSize(250,100);
setLocation(90, 90);
setTitle("CADASTRO");
setResizable(true);
setVisible(true);
setLayout(new GridLayout(3,2));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

}
