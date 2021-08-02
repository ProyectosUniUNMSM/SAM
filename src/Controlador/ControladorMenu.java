
package Controlador;

import Vista.Vista_Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu {
    private Vista_Menu vista;

    public ControladorMenu(Vista_Menu vista) {
        this.vista = vista;
        this.vista.btnInventario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        this.vista.btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        this.vista.btnBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

    }
    
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
}
