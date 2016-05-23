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
public class Pregunta {
    
    private int id_preg;
    private String enunciado;
    
    List<Pregunta> preguntas = new LinkedList<>();

    public Pregunta() {
    }

    public Pregunta(int id_preg, String enunciado) {
        this.id_preg = id_preg;
        this.enunciado = enunciado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id_preg;
        hash = 11 * hash + Objects.hashCode(this.enunciado);
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
        final Pregunta other = (Pregunta) obj;
        if (!Objects.equals(this.enunciado, other.enunciado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + '}';
    }

    
    /**
     * @return the id_preg
     */
    public int getId_preg() {
        return id_preg;
    }

    /**
     * @param id_preg the id_preg to set
     */
    public void setId_preg(int id_preg) {
        this.id_preg = id_preg;
    }

    /**
     * @return the enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }

    /**
     * @param enunciado the enunciado to set
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    
}
