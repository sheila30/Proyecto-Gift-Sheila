/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author 7FPROG10
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        
        try{
            Class.forName("");
            String bd = "";
            String login =  "";
            String password = "";
            String url = ""+bd;
            
            
            Connection conexion = DriverManager.getConnection(url, login, password);
            
            Statement sentencia1 = conexion.createStatement();
            ResultSet resultado = sentencia1.executeQuery("select * from Categorias");
            
            while(resultado.next() == true){
                System.out.println("Id: " + resultado.getInt("id_cat"));
                System.out.println("Título: " + resultado.getString("titulo"));
                
            }
            
            conexion.close();
            
        }catch (ClassNotFoundException ex ){
            System.err.println("Error: Driver no disponible");
            System.out.println(ex.getCause());
        }catch (SQLException ex ){
            
            
            
            
        }
        
      
        
     /*  

       // Exportar
    
    String texto = "";
    
    // Conectar y volcar información
    byte buffer[] = texto.getBytes();
   
    
   
    
    // De esta manera la conexión se cierra automáticamente
    try (FileOutputStream gift = new FileOutputStream("../GIFT.TX")){
    
    
    // Escribir
    gift.write(buffer);
    
    } catch (IOException e) {
            System.err.println("ERROR: Error de E/S");
            
       
    }*/
    
    
    
    
    
    BufferedReader in = null;
        
        try {
            
            // Dirección desde la que vamos a leer
            URL url = null;
            try {
                url = new URL("");
            } catch (MalformedURLException ex) {
                System.err.println("ERROR: URL errónea");
            }

            if (url != null) {

                // Crear y configurar la conexión
                HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
                conexion.setConnectTimeout(5000);
                conexion.setReadTimeout(5000);
                conexion.setInstanceFollowRedirects(true);
 // Abrir el stream de lectura
                in = new BufferedReader(
                        new InputStreamReader(conexion.getInputStream()));

                // Leer línea a línea
                String linea;
                StringBuilder respuesta = new StringBuilder();
                while ((linea = in.readLine()) != null) {
                    respuesta.append(linea);
                }


                // Volcado a disco
                byte buffer[] = respuesta.toString().getBytes();

                FileOutputStream ficheroSalida = new FileOutputStream("../GIFT.txt");

                ficheroSalida.write(buffer);

                ficheroSalida.close();

            }
        } catch (IOException ex) {
            System.err.println("ERROR: Error de E/S");
            
           } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                System.err.println("ERROR: Error de E/S");
            }
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    }
    
    
    
    
    
    

