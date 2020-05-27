package ec.edu.ups.ventanas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
public class VentanaTelefono {
    public VentanaTelefono(){
	Frame ventana = new Frame("Agenda Telefónica");
	ventana.setBounds(1600, 200, 400, 600);
	
	//Creacion panel principal
	Panel pnlPrincipal = new Panel(new FlowLayout(FlowLayout.CENTER));
	
	//Panel para seleccionar una opcion
	Panel pnlSeleciconar = new Panel();
	
	
	//Fin Panel de Seleccion
	
	//Panel de registro de un telefono
	Panel pnlRegistrar = new Panel();
	
	
	//Fin Panel de Registro
	
	//Panel para modificar un telefono
	Panel pnlModificar = new Panel();
	
	
	//Fin Panel de Modificacion
	
	//Panel para eliminar un telefono
	Panel pnlEliminar = new Panel();
	
	
	//Fin Panel de Eliminacion
	
	//Panel para Buscar un telefono
	Panel pnlBuscar = new Panel();
	
	
	//Fin de Panel de Búsqueda
	
	//Panel para listar los Telefonos
	Panel pnlListar = new Panel();
	
	
	//Fin Panel de Listado
	
	pnlPrincipal.add(pnlSeleciconar);
	pnlPrincipal.add(pnlRegistrar);
	
	ventana.setVisible(true);
    }
}

