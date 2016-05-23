/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sheila
 */
public class Categoria {
    
    private int id_cat;
    private String titulo;
    
    List<Categoria> categorias = new LinkedList<>();

    public Categoria() {
    }

    public Categoria(String titulo) {
        this.titulo = titulo;
    }

    
   
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id_cat;
        hash = 79 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "titulo=" + titulo + '}';
    }

    
    
    /**
     * @return the id_cat
     */
    public int getId_cat() {
        return id_cat;
    }

    /**
     * @param id_cat the id_cat to set
     */
    public void setId_cat(int id_cat) {
        this.id_cat = id_cat;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

    
    
}
