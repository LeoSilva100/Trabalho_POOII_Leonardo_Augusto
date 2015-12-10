package Eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import trabalho_3.Cadastro;
import trabalho_3.Confirmacao;

/**
*
* @author LEO_DRUMS
*/
public class Evento_cadastro implements ActionListener{
  
    Cadastro cadastro;
    Confirmacao confirmacao;
 
    public Evento_cadastro(Cadastro cadastro) {       
       this.cadastro = cadastro;
    }
    @Override
    public void actionPerformed(ActionEvent e) {   
        this.confirmacao = new Confirmacao(cadastro);
    }
    
}
