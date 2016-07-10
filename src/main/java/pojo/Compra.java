package pojo;

import interfaces.TipoDescuento;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class Compra {

    private double importe;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Compra(double importe) {
        super();
        this.importe = importe;
    }

    public double descuento(TipoDescuento tipoDescuento) {

        return importe - tipoDescuento.importeDescontar(this);
    }
}
