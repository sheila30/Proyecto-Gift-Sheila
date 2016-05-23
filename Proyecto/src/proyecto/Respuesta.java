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
public class Respuesta {
    
    private int id_resp;
    private String respuesta;
    private boolean acertada;
    
    List<Respuesta> respuestas = new LinkedList<>();

    public Respuesta() {
    }

    public Respuesta(int id_resp, String respuesta, boolean acertada) {
        this.id_resp = id_resp;
        this.respuesta = respuesta;
        this.acertada = acertada;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.id_resp;
        hash = 23 * hash + Objects.hashCode(this.respuesta);
        hash = 23 * hash + (this.acertada ? 1 : 0);
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
        final Respuesta other = (Respuesta) obj;
        if (!Objects.equals(this.respuesta, other.respuesta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "respuesta=" + respuesta + '}';
    }
    
    

    /**
     * @return the id_resp
     */
    public int getId_resp() {
        return id_resp;
    }

    /**
     * @param id_resp the id_resp to set
     */
    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the acertada
     */
    public boolean isAcertada() {
        return acertada;
    }

    /**
     * @param acertada the acertada to set
     */
    public void setAcertada(boolean acertada) {
        this.acertada = acertada;
    }
    
}
