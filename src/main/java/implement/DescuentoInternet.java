package implement;

import interfaces.TipoDescuento;
import pojo.Compra;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class DescuentoInternet implements TipoDescuento {

    public double importeDescontar(Compra c) {

        double descuento;

        if (c.getImporte() > 0 && c.getImporte() < 200) {descuento = 20;}
        else {descuento = 30;}

        return c.getImporte() * descuento / 100;
    }
}
