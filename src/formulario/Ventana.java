
package formulario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener{
    
        private JLabel nom;
        private JTextField tnom;
        private JLabel app;
        private JTextField tapp;
        private JLabel apm;
        private JTextField tapm;
        private JLabel esc;
        private JTextField tesc;
        private JButton send;
        private JButton compro;
        
        public Ventana() {
        super();                    
        configurarVentana();        
        inicializarComponentes();   
        }
        
        private void configurarVentana() {
        this.setTitle("Ejercicio");                   
        this.setSize(500, 300);  //(ancho, alto)
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        }
        
        private void inicializarComponentes() {
            nom = new JLabel();
            tnom = new JTextField();
            app = new JLabel();
            tapp = new JTextField();
            apm = new JLabel();
            tapm = new JTextField();
            esc = new JLabel();
            tesc = new JTextField();
            send = new JButton();
            compro = new JButton();
            
            nom.setText("Nombre: ");
            app.setText("Apellido paterno:");
            apm.setText("Apellido materno");
            esc.setText("Escuela:");
            send.setText("Enviar");
            compro.setText("Comprobar");
            
            nom.setBounds(20, 30, 150, 30);//x,y,w,h.
            app.setBounds(20, 60, 150, 30);
            apm.setBounds(20, 90, 150, 30);
            esc.setBounds(20, 120, 150, 30);
            tnom.setBounds(180, 30, 250, 30);
            tapp.setBounds(180, 60, 250, 30);
            tapm.setBounds(180, 90, 250, 30);
            tesc.setBounds(180, 120, 250, 30);
            send.setBounds(210, 160, 100, 30);
            compro.setBounds(210, 190, 100, 30);
            
            
            add(nom);        
            add(app);
            add(apm);
            add(esc);
            add(tnom);
            add(tapp);
            add(tapm);
            add(tesc);
            add(send);
            add(compro);
            
            send.addActionListener(this);
            compro.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            data datos = new data();            
            datos.setNombre(tnom.getText());
            datos.setPat(tapp.getText());
            datos.setMat(tapm.getText());
            datos.setSkl(tesc.getText());
            
            
            if (e.getSource() == send) {
                
                JOptionPane.showMessageDialog(this, "Enviado");
                JOptionPane.showMessageDialog(this, "tic toc");                   
                JOptionPane.showMessageDialog(this, datos.getNombre());   
            }
            else if (e.getSource() == compro) {
                JOptionPane.showMessageDialog(this, "Comprobar");                                  
                JOptionPane.showMessageDialog(this, datos.getNombre());  
            }
   
        }
}

//copyright China
