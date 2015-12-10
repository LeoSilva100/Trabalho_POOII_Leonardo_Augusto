
package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import trabalho_3.Cadastro;
import trabalho_3.Confirmacao;
/**
*
* @author LEO_DRUMS
*/
public class Evento_confirmacao implements ActionListener{
    
  public Cadastro cadastro; 
  public Confirmacao e;
  boolean r;
  
  public Evento_confirmacao(Cadastro cad, Confirmacao x, boolean g){
  this.cadastro = cad;
  this.e = x;
  this.r = g; 
  }
    @Override
  public void actionPerformed(ActionEvent e) { 
        if(r==true){
              this.cadastro.setVisible(false);
              this.e.setVisible(false);          
  JOptionPane.showMessageDialog(null,"NOME: "+cadastro.nome_1.getText()+"\nSEXO: "+cadastro.C.getSelectedItem()+"\nDISCIPLINAS: "+cadastro.L.getSelectedItem()+"\nCOMENTARIO: "+cadastro.comentario_1.getText());

        }else{
           this.e.setVisible(false);
            JOptionPane.showMessageDialog(null, "NÃO SALVOU NADA");
        }
}
    
}
