package implement;

import interfaces.TipoDescuento;
import pojo.Compra;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class DescuentoTienda implements TipoDescuento {

    public double importeDescontar(Compra c) {

        double descuento;

        if (c.getImporte() > 0 && c.getImporte() < 100) {descuento = 10;}
        else {descuento = 20;}

        return c.getImporte() * descuento / 100;
    }

}
