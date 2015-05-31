package Negocio;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author GAb
 */
public class NegImpuesto {

    private int codImpuesto;
    private String descripcion;

    public NegImpuesto(int codImpuesto, String descripcion) {
        this.codImpuesto = codImpuesto;
        this.descripcion = descripcion;
    }

    public NegImpuesto() {
    }

    public int getCodImpuesto() {
        return codImpuesto;
    }

    public void setCodImpuesto(int codImpuesto) {
        this.codImpuesto = codImpuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
