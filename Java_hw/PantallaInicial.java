package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class PantallaInicial extends JFrame implements ActionListener{

	JButton manzana;
	JButton pera;
	JButton jitomate;
	JButton cebolla;
	JButton platano;
	JButton naranja;
	JButton piña;
	JButton mango;
	JButton melon;
	JButton lechuga;
	JButton espinaca;
	JButton brocoli;
	JButton ajo;
	JButton zanahoria;
	JButton berenjena;
	JButton sandia;
	JButton kiwi;
	JButton aguacate;
	JButton uva;
	JButton durazno;
	JButton papaya;
	JButton limon;
	JButton cilantro;
	JButton perejil;
	
	JButton cerrarCuenta;
	JButton cerrarCuentaDia;
	JButton cerrar;
	
	//ETIQUETAS QUE SE VAN A USAR ---------------------------------------------------------------------
	JLabel nombre;
	
	//Variables que se van a usar ---------------------------------------------------------------------
	//Ventas ventas;
	static Producto fruitSelected;
	
	//Pantalla peso
	PantallaPeso pantallaPeso;
	public PantallaInicial(){
		setLayout (null);
		//ImageIcon manzana = new ImageIcon ("C:\\Users\\Lenovo\\Documents\\A imagenes proyecto java\\manzana.jpg");
		
		
		//Declaracion de variables
		//ventas = new Ventas ();
	//DECLARACION DE BOTONES ----------------------------------------------------------------------
		manzana = new JButton ("Manzana");
		pera = new JButton ("Pera");
		jitomate = new JButton ("Jitomate");
		cebolla = new JButton ("Cebolla");
		platano = new JButton ("Platano");
		naranja = new JButton ("Naranja");
		piña = new JButton ("Piña");
		mango = new JButton ("Mango");
		melon = new JButton ("Melon");
		lechuga = new JButton ("Lechuga");
		espinaca = new JButton ("Espinaca");
		brocoli = new JButton ("Brocoli");
		ajo = new JButton ("Ajo");
		zanahoria = new JButton ("Zanahoria");
		berenjena = new JButton ("Berenjena");
		sandia = new JButton ("Sandia");
		kiwi = new JButton ("Kiwi");
		aguacate = new JButton ("Aguacate");
		uva = new JButton ("Uva");
		durazno = new JButton ("Durazno");
		papaya = new JButton ("Papaya");
		limon = new JButton ("Limon");
		cilantro = new JButton ("Cilantro");
		perejil = new JButton ("Perejil");
		
		cerrarCuenta = new JButton ("Cerrar cuenta");
		cerrarCuentaDia = new JButton ("Cerrar día");
		cerrar = new JButton ("Cerrar");
		
	//DECLARACION DE ETIQUETAS --------------------------------------------------------------------
		nombre = new JLabel ("Verduleria el wero");
		nombre.setBounds(225, 40, 570, 100);
		Font font1 = new Font ("Arial", Font.BOLD, 50);
		nombre.setFont(font1);
		
		//boton1.setIcon(manzana);
	//PantallaPeso
		pantallaPeso = new PantallaPeso();
		pantallaPeso.setBounds(0, 0, 350, 700);
		pantallaPeso.setLocationRelativeTo(null);
	//UBICACION DE BOTONES ----------------------------------------------------------------------------
		manzana.setBounds(5, 185, 100, 100);//linea 1
		pera.setBounds(115, 185, 100, 100);
		jitomate.setBounds(225, 185, 100, 100);
		cebolla.setBounds(335, 185, 100, 100);
		platano.setBounds(445, 185, 100, 100);
		naranja.setBounds(555, 185, 100, 100);
		piña.setBounds(5, 295, 100, 100);// linea 2
		mango.setBounds(115, 295, 100, 100);
		melon.setBounds(225, 295, 100, 100);
		lechuga.setBounds(335, 295, 100, 100);
		espinaca.setBounds(445, 295, 100, 100);
		brocoli.setBounds(555, 295, 100, 100); 
		ajo.setBounds(5, 405, 100, 100);//Linea 3
		zanahoria.setBounds(115, 405, 100, 100);
		berenjena.setBounds(225, 405, 100, 100);
		sandia.setBounds(335, 405, 100, 100);
		kiwi.setBounds(445, 405, 100, 100);
		aguacate.setBounds(555, 405, 100, 100);
		uva.setBounds(5, 515, 100, 100);// Linea 4
		durazno.setBounds(115, 515, 100, 100);
		papaya.setBounds(225, 515, 100, 100);
		limon.setBounds(335, 515, 100, 100);
		cilantro.setBounds(445, 515, 100, 100);
		perejil.setBounds(555, 515, 100, 100);
		
		cerrarCuenta.setBounds(700, 195, 140, 40);
		cerrarCuentaDia.setBounds(700, 240, 140, 40);
		cerrar.setBounds(720, 550, 100, 40);
		
		
		
		
		//nombre.setBackground(Color.green);
	// ADDS DE BOTONES -------------------------------------------------------------------------------
		add (manzana);
		add (pera);
		add (jitomate);
		add (cebolla);
		add (platano);
		add (naranja);
		add (piña);
		add (mango);
		add (melon);
		add (lechuga);
		add (espinaca);
		add (brocoli);
		add (ajo);
		add (zanahoria);
		add (berenjena);
		add (sandia);
		add (kiwi);
		add (aguacate);
		add (uva);
		add (durazno);
		add (papaya);
		add (limon);
		add (cilantro);
		add (perejil);
		add(cerrar);
		
		add(cerrarCuenta);
		add(cerrarCuentaDia);
		add (nombre);
		
	//ACTIVACION DE ACTION LISTENERS --------------------------------------------------------------------------------
		manzana.addActionListener(this);
		pera.addActionListener(this);
		jitomate.addActionListener(this);
		cebolla.addActionListener(this);
		platano.addActionListener(this);
		naranja.addActionListener(this);
		piña.addActionListener(this);
		mango.addActionListener(this);
		melon.addActionListener(this);
		lechuga.addActionListener(this);
		espinaca.addActionListener(this);
		brocoli.addActionListener(this);
		ajo.addActionListener(this);
		zanahoria.addActionListener(this);
		berenjena.addActionListener(this);
		sandia.addActionListener(this);
		kiwi.addActionListener(this);
		aguacate.addActionListener(this);
		uva.addActionListener(this);
		durazno.addActionListener(this);
		papaya.addActionListener(this);
		limon.addActionListener(this);
		cilantro.addActionListener(this);
		perejil.addActionListener(this);
		
		cerrarCuenta.addActionListener(this);
		cerrarCuentaDia.addActionListener(this);
		cerrar.addActionListener(this);
		/*
		TestProyecto pantallaPrincipal = new TestProyecto();
		//establece en que parte de la pantalla aparece la gui
		pantallaPrincipal.setBounds(0,0,1300,700);
		pantallaPrincipal.setBackground(Color.blue);
		//Hace que la interfaz grafica aparezca
		pantallaPrincipal.setVisible(true);
		//Hace que no se pueda cambiar el tamaño
		pantallaPrincipal.setResizable(false);
		//HAce que la interfaz salga en el centro de la pantalla
		pantallaPrincipal.setLocationRelativeTo(null);
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == manzana) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.MANZANA);
		}
		
		
		if (e.getSource() == pera) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.PERA);
		}
		
		if (e.getSource() == jitomate) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.JITOMATE);
		}
		
		if (e.getSource() == cebolla) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.CEBOLLA);
		}
		
		if (e.getSource() == platano) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.PLATANO);
		}
		
		if (e.getSource() == naranja) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.NARANJA);
		}
		
		if (e.getSource() == piña) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.PIÑA);
		}
		
		if (e.getSource() == mango) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.MANGO);
		}
		
		if (e.getSource() == melon) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.MELON);
		}
		
		if (e.getSource() == lechuga) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.LECHUGA);
		}
		
		if (e.getSource() == espinaca) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.ESPINACA);
		}
		
		if (e.getSource() == brocoli) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.BROCOLI);
		}
		
		if (e.getSource() == ajo) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.AJO);
		}
		
		if (e.getSource() == zanahoria) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.ZANAHORIA);
		}
		
		if (e.getSource() == berenjena) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.BERENJENA);
		}
		
		if (e.getSource() == sandia) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.SANDIA);
		}
		
		if (e.getSource() == kiwi) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.KIWI);
		}
		
		if (e.getSource() == aguacate) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.AGUACATE);
		}
		
		if (e.getSource() == uva) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.UVA);
		}
		
		if (e.getSource() == durazno) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.DURAZNO);
		}
		
		if (e.getSource() == papaya) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.PAPAYA);
		}
		
		if (e.getSource() == limon) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.LIMON);
		}
		
		if (e.getSource() == cilantro) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.CILANTRO);
		}
		
		if (e.getSource() == perejil) {
			pantallaPeso.setVisible(true);
			setFruitSelected (Producto.PEREJIL);
		}
		
		if (e.getSource() == cerrarCuenta) {
			//this.ventas = pantallaPeso.getventas();
			//JOptionPane.showMessageDialog(null, "El total de la cuenta es de: " + this.ventas.cortarVentaTotal());
			JOptionPane.showMessageDialog(null, "El total de la cuenta es de: " + PantallaPeso.ventas.ventaTotal);
			PantallaPeso.ventas.ventaTotal = 0;
		}
		
		//BOTON1
		if (e.getSource() == cerrarCuentaDia) {
			//this.ventas = pantallaPeso.getventas();
			//JOptionPane.showMessageDialog(null, "El total de la cuenta del dia es de: " + this.ventas.cortarVentaTotal());
			JOptionPane.showMessageDialog(null, "El total de la cuenta del dia es de: " + PantallaPeso.ventas.ventaTotalDia);
			PantallaPeso.ventas.ventaTotalDia = 0;
			PantallaPeso.ventas.ventaTotal = 0;
		}
		
		//BOTON2
		if (e.getSource() == cerrar) {
			System.exit(0);
		}
	}
	
	public void setFruitSelected (Producto fruit) {
		fruitSelected = fruit;
	}
	
	public static  Producto getFruitSelected () {
		return fruitSelected;
	}
}