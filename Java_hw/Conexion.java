package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;


public class Conexion {
    private Connection connection;
    String url = "jdbc:mysql://localhost/Verduleria";
    String user = "root";
    String password = "Ouagadougou/7285";
    
    public Conexion() {

        try {
            // Establece la conexión con la base de datos
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos.");
            Statement statement = connection.createStatement();

            // Ejecutar la sentencia SQL para crear la tabla
            String sqlCrearTabla = "CREATE TABLE IF NOT EXISTS Ventas ("
                    + "Id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "Fecha DATE,"
                    + "Producto VARCHAR(50),"
                    + "Precio DECIMAL(10,2),"
                    + "Peso DECIMAL(10,2),"
                    + "VentaTotal DECIMAL(10,2)"
                    + ")";
            statement.executeUpdate(sqlCrearTabla);

            // System.out.println("La tabla Ventas se ha creado correctamente.");

            // Cierra la declaración
            statement.close();
        } catch (SQLException e) {
            // Error de conexión
            System.out.println("Error al conectarse a la base de datos.");
            e.printStackTrace();
        }
    }
	    
    public void agregarDatos(Producto producto, double precio, double peso, double ventaTotal) {
        try {
            // Prepara la declaración SQL para insertar los datos
        	// Sentencia SQL para insertar una venta
        	
            String sqlInsertarVenta = "INSERT INTO Ventas (Fecha, Producto, Precio, Peso, VentaTotal) "
                    + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statement2 = connection.prepareStatement(sqlInsertarVenta);
            
            // Obtener la fecha actual
            java.util.Date fechaActual = new java.util.Date();
            Timestamp timestamp = new Timestamp(fechaActual.getTime());

            // Establece los valores de los parámetros en la declaración preparada
            
            statement2.setDate(1, new java.sql.Date(timestamp.getTime()));
            statement2.setString(2, producto.name());
            statement2.setDouble(3, precio);
            statement2.setDouble(4, peso);
            statement2.setDouble(5, ventaTotal);

            // Ejecuta la declaración para insertar los datos
            statement2.executeUpdate();
            System.out.println("La venta se ha insertado correctamente en la tabla Ventas.");

            // Cierra la declaración y la conexión
            statement2.close();
            
        } catch (SQLException e) {
        	System.out.println("Error al conectarse a la base de datos.");
            e.printStackTrace();
        }
    }
    
    public static void imprimirTablaVentas() {
    	String url = "jdbc:mysql://localhost/Verduleria";
        String user = "root";
        String password = "Ouagadougou/7285";
    	
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa a la base de datos.");
            Statement statement = connection.createStatement();

            // Sentencia SQL para obtener los datos de la tabla Ventas
            String sqlObtenerVentas = "SELECT * FROM Ventas";

            // Ejecutar la consulta y obtener el resultado
            ResultSet resultSet = statement.executeQuery(sqlObtenerVentas);

            // Imprimir los datos de la tabla
            System.out.println("Contenido de la tabla Ventas:");
            while (resultSet.next()) {
                java.sql.Date fecha = resultSet.getDate("Fecha");
                double total = resultSet.getDouble("Total");
                System.out.println("Fecha: " + fecha + ", Total: " + total);
            }

            // Cerrar el resultado, la declaración y la conexión
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            // Error de conexión
            System.out.println("Error al conectarse a la base de datos.");
            e.printStackTrace();
            // Maneja cualquier error de conexión aquí
        }
    }
}
