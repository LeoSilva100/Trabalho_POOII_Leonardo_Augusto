package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import trabalho_3.Cadastro;
import trabalho_3.TRABALHO_3;

/**
*
* @author LEO_DRUMS
*/
public class Evento_login implements ActionListener {

public String texto1="LEODRUMS";
public String texto2="12345";

TRABALHO_3 lo;
Cadastro c;
JTextField aux1;
JTextField aux2;

public Evento_login(JTextField t1,JTextField t2,TRABALHO_3 lo){  
this.lo=lo;
this.aux1=t1;
this.aux2=t2;
}

@Override
public void actionPerformed(ActionEvent e) {

this.lo.setVisible(false);


if(aux1.getText().equals(texto1)){
      if(aux2.getText().equals(texto2)){    
       this.c = new Cadastro();
      }else{
       JOptionPane.showMessageDialog(null, "ERRO SUA SENHA ESTA ERRADA!!!");
}
}
else{
JOptionPane.showMessageDialog(null, "ERRO SEU EMAIL ESTA ERRADO!!!");
}
}

}
