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
    
    private VPCategorias vPCategorias = null; 
    
    private List<Categoria> categorias = new LinkedList<>();
    
   
    public void nuevaCategoria ( Categoria c ){
        categorias.add(c);
        
        
    }
    
    public void borrarCategoria( Categoria c ){
        categorias.remove(c);
        
        
    }
    
    public static void main(String[] args) throws SQLException{
   


            // Cargar el driver correspondiente
            // http://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            // Cadena de conexión: driver@machineName:port:SID, userid, password
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.20.225.114:1521:orcl", "noc11", "noc11");
        
            System.out.println("INFO: Conexión abierta");

        /*// Consulta simple
            Statement stmt = conn.createStatement();
            ResultSet rset = stmt.executeQuery("select * from SYS.V_$VERSION");
            while (rset.next()) {
                System.out.println(rset.getString(1));
            }
            stmt.close();

            // Llamada a procedimiento almacenado
            // Creamos el statement
            String sql = "{ call gest_depart.insert_depart(?,?) }";
            CallableStatement cs = conn.prepareCall(sql);

            // Cargamos los parametros de entrada IN
            cs.setString(1, "NuevoDep");
            cs.setString(2, "VitoriaGasteiz");

            // Ejecutamos la llamada
            cs.execute();

            System.out.println("INFO: Procedimiento ejecutado");

            
            
            // Llamada a procedimiento almacenado
            // Creamos el statement
            String sql2 = "{ call gest_depart.visualizar_lista_depart(?) }";
            CallableStatement cs2 = conn.prepareCall(sql2);

            // Cargamos los parametros de entrada OUT
            cs2.registerOutParameter(1, OracleTypes.CURSOR);

            // Ejecutamos la llamada
            cs2.execute();

            ResultSet rs = (ResultSet)cs2.getObject(1);

            while (rs.next()){
                System.out.println(rs.getString("LOC"));
            }
            rs.close();            
            
            
            System.out.println("INFO: Procedimiento ejecutado");
            
            
            
        } catch (SQLException ex) {
            System.out.println("ERROR: No se ha podido ejecutar la consulta");
            Logger.getLogger(EjemploOracle.class.getName()).log(Level.SEVERE, null, ex);
        }*/
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


    
  
    

