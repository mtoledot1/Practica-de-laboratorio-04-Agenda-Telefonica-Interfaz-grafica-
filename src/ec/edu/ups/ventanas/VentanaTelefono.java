package ec.edu.ups.ventanas;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
public class VentanaTelefono {
    public VentanaTelefono(){
	Frame ventana = new Frame("Agenda Telefónica");
	ventana.setBounds(1600, 200, 400, 400);
	
	//Creacion panel principal
	Panel pnlPrincipal = new Panel(new BorderLayout());
	
	//Panel de registro de un telefono
	GridBagLayout grid = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
	Panel pnlRegistrar = new Panel(grid);
	
	Label lblCodigo = new Label("Código:");
	Label lblNumero = new Label("Número:");
	Label lblTipo = new Label("Tipo:");
	Label lblOperadora = new Label("Operadora:");
	Label lblEstado = new Label("Estado");
	
	TextField txtCodigo = new TextField();
	TextField txtNumero = new TextField();
	TextField txtTipo = new TextField();
	TextField txtOperadora = new TextField();
	
	Button btnRegistrar = new Button("Registrar");
	Button btnModificar = new Button("Modificar");
	Button btnEliminar = new Button("Eliminar");
	Button btnBuscar = new Button("Buscar");
	Button btnListar = new Button("Listar");
	Button btnSalir = new Button("Salir");
	
	c.fill = GridBagConstraints.NONE;
	c.gridx = 0;
	c.weighty = 1;
	pnlRegistrar.add(lblCodigo,c);
	pnlRegistrar.add(lblNumero,c);
	pnlRegistrar.add(lblTipo,c);
	pnlRegistrar.add(lblOperadora,c);
	
	c.ipadx = 200;
	c.ipady = 5;
	c.gridx = 1;
	c.gridy = 0;
	c.gridwidth = GridBagConstraints.RELATIVE;
	pnlRegistrar.add(txtCodigo,c);
	c.gridy = GridBagConstraints.RELATIVE;
	pnlRegistrar.add(txtNumero,c);
	pnlRegistrar.add(txtTipo,c);
	pnlRegistrar.add(txtOperadora,c);
	
	c.gridy = GridBagConstraints.LAST_LINE_END;
	c.gridwidth = 1;
	System.out.println(c.gridy);
	c.gridx = 0;
	c.ipadx = 10;
	c.weightx = 0;
	pnlRegistrar.add(btnRegistrar,c);
	c.gridx+=2;
	pnlRegistrar.add(btnModificar,c);
	c.gridx+=2;
	pnlRegistrar.add(btnEliminar,c);
	c.gridwidth = 3;
	c.gridx = 0;
	c.gridy++;
	pnlRegistrar.add(btnBuscar,c);
	c.gridx+=2;
	pnlRegistrar.add(btnListar,c);
	
	c.gridx = 0;
	c.gridwidth = 10;
	c.gridy++;
	pnlRegistrar.add(lblEstado,c);
	c.gridx = 0;
	c.gridwidth = 10;
	c.gridy++;
	pnlRegistrar.add(btnSalir,c);
	
	//Fin Panel de Registro
	
	pnlPrincipal.add(pnlRegistrar, BorderLayout.CENTER);
	
	ventana.add(pnlPrincipal);
	ventana.setVisible(true);
    }
}

