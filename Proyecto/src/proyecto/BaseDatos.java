/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import com.mysql.jdbc.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Sheila
 */
public class BaseDatos {

    public static void main(String[] args) throws SQLException {

            // Cargar el driver correspondiente
        // http://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

        // Cadena de conexión: driver@machineName:port:SID, userid, password
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.20.225.114:1521:orcl", "noc11", "noc11");

        System.out.println("INFO: Conexión abierta");

    }

    private VPCategorias vPCategorias = null;

    private List<Categoria> categorias = new LinkedList<>();

    public void nuevaCategoria(Categoria c) {
        categorias.add(c);

    }

    public void borrarCategoria(Categoria c) {
        categorias.remove(c);

    }

    /**
     * @return the vPCategorias
     */
    public VPCategorias getvPCategorias() {
        return vPCategorias;
    }

    /**
     * @param vPCategorias the vPCategorias to set
     */
    public void setvPCategorias(VPCategorias vPCategorias) {
        this.vPCategorias = vPCategorias;
    }

}
