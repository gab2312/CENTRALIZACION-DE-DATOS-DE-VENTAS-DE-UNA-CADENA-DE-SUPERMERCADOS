package Negocio;

import Datos.DatSucursal;

/**
 *
 * @author GAb
 */
public class NegSucursal {

    private int codSucursal;
    private String nombreSucursal;

    public NegSucursal() {
    }

    public static NegSucursal[] consultarSucursales() {
        DatSucursal datSucursal = new DatSucursal();
        return datSucursal.consultarSucursales();
    }

    public static void main(String[] args) {
        NegSucursal[] negSucursals = consultarSucursales();
        for (int i = 0; i < negSucursals.length; i++) {
            System.out.println(negSucursals[i].getCodSucursal() + " " + negSucursals[i].getNombreSucursal());
        }
    }
    
    
    public NegSucursal(int codSucursal, String nombreSucursal) {
        this.codSucursal = codSucursal;
        this.nombreSucursal = nombreSucursal;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

}
