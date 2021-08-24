
package com.mycompany.first_swing_screen;

import javax.swing.JOptionPane;

public class FirstSwingScreen {
    
    public static void main(String[] args) {
        MinhaTela tela = new MinhaTela();
        tela.setVisible(true);
        
        JOptionPane.showMessageDialog(tela, """
                                            Preencha o formul\u00e1rio a seguir com os seus dados, veja o texto de declara\u00e7\u00e3o
                                            e em seguida clique em SIM para confirmar o aceite de conte\u00fado""");
        
    }
    
}
