package conexionDB;

import java.sql.*;

public class Conectar {
    private Connection con;

    public Conectar() {
        con=null;
    }
    
    public Connection conexion(){
        try {
            //cargar driver
            Class.forName("com.mysql.jdbc.Driver");
            //obtenemos la coneccion
            con=DriverManager.getConnection("jdbc:mysql://localhost/lobomarinobd", "root", "");
            System.out.println("Coneccion exitosa");          
        } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Houston tenemos un problema!"+e.toString());       
        }
        return con;
    }   
}
