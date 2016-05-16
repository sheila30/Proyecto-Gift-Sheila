/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.LinkedList;
import java.util.List;

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
    
    
    /*
    BufferedReader in = null;
        
        
            
                   
        
            
           
                try{
                // Crear y configurar la conexión
                HttpURLConnection conexion = (HttpURLConnection) .openConnection();
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



            }*/

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


    
  
    

