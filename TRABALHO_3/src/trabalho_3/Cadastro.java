
package trabalho_3;

import Eventos.Evento_cadastro;
import java.awt.Choice;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
*
* @author LEO_DRUMS
*/
public class Cadastro extends JFrame{

Container c = getContentPane();
Container p = new JPanel();

public JLabel nome = new JLabel("NOME:");
public JTextField nome_1 = new JTextField(40);
public JLabel sexo = new JLabel("SEXO:");
public JLabel comentario = new JLabel("COMENTARIO:");
public JTextArea comentario_1 = new JTextArea();
public JButton b = new JButton ("CADASTRAR");


public Choice C;
public List L;

public Cadastro(){

c.add(nome);
c.add(nome_1);
c.add(comentario);
c.add(comentario_1);
    
c.add(sexo);    
C = new Choice();
C.add("MASCULINO");
C.add("FEMININO");
c.add(C);

List l = new List();

l.add("POO_1");
l.add("POO_2");
l.add("PAA");
l.add("REDES_1");
l.add("REDES_2");
c.add(l);
this.L = l;

Evento_cadastro cadastro = new Evento_cadastro(this);
b.addActionListener(cadastro);
c.add(b); 

setSize(550,235);
setLocation(100,150);
setTitle("CADASTRO");
setResizable(true);
setVisible(true);
setLayout(new GridLayout(4,2));

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}     
   public static void main(String[] args){
       new Cadastro();     
   }    
   
}
