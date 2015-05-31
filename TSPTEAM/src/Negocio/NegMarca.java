package Negocio;

/**
 *
 * @author GAb
 */
public class NegMarca {

    private int codMarca;
    private String nombreMarca;

    public NegMarca() {
    }

    public NegMarca(int codMarca, String nombreMarca) {
        this.codMarca = codMarca;
        this.nombreMarca = nombreMarca;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

}
