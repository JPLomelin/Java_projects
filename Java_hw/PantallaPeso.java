package proyecto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PantallaPeso extends JFrame implements ActionListener{
	
	JButton cerrarPeso;
	JButton ok;
	JLabel ingresePeso;
	JTextField fieldPeso;
	String pesoStr;
	float peso;
	//Vamos a usar las ventas para los cortes de caja
	static Ventas ventas;
	//Almacenar las ventas en la base de datos
	
	//Vamos a usar los productos para los precios
	Productos productos;
	//PantallaInicial pantallaInicial;
	PantallaInicial pantallaInicial;
	
	public PantallaPeso () {
		setLayout (null);
		ingresePeso = new JLabel ("Ingrese el peso del producto en kilogramos:");
		Font font2 = new Font("Arial", Font.BOLD, 13);
		ingresePeso.setFont(font2);
		cerrarPeso = new JButton ("Cerrar");
		ok = new JButton ("OK");
		fieldPeso = new JTextField();
		ventas = new Ventas();
		productos = new Productos();
		//pantallaInicial = new PantallaInicial();
		
		ingresePeso.setBounds(30, 200, 300, 50);
		cerrarPeso.setBounds(113, 575, 100, 50);
		ok.setBounds(113, 350, 100, 50);
		fieldPeso.setBounds(55, 250, 230, 50);
		
		add(ingresePeso);
		add(cerrarPeso);
		add(ok);
		add(fieldPeso);
		
		ok.addActionListener(this);
		cerrarPeso.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == ok && fieldPeso.getText().isEmpty()) {
			JOptionPane.showMessageDialog(this, "Favor de no dejar campos vacios");
		}
		//manzana
		else if (e.getSource() == ok && fieldPeso.getText() != null){
			//Obtiene el peso que ingreso
			pesoStr = fieldPeso.getText();
			//Parse del string de peso
			peso = Float.parseFloat(pesoStr);
			double precio = productos.getPrecio(PantallaInicial.getFruitSelected());
			Producto producto = PantallaInicial.getFruitSelected();
			
			
			double precioTotal = precio * peso;
			String precioFormateado = String.format("%.2f", precioTotal);
			ventas.sumarVenta(precioTotal);
			JOptionPane.showMessageDialog(this, "El precio total es de : " + precioFormateado);
			this.dispose();
			
			// Actualizar la base de datos
	        Conexion databaseController = new Conexion();
	        databaseController.agregarDatos(producto, precio, peso, precioTotal);
			
			
		}
		//pera, etc...
		
		if (e.getSource() == cerrarPeso) {
			this.dispose();
		}
		
	}
	
	public Ventas getventas() {
		return ventas;
	}
}