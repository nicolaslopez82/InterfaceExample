package implement;

import interfaces.TipoDescuento;
import pojo.Compra;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class DescuentoDirectivo implements TipoDescuento {

    public double importeDescontar(Compra c) {

        return c.getImporte() * 50 / 100;
    }
}
