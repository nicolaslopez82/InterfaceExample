package factory;

import implement.DescuentoDirectivo;
import implement.DescuentoInternet;
import implement.DescuentoTienda;
import interfaces.TipoDescuento;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class DescuentoFactory {

    public DescuentoFactory() {}

    public static TipoDescuento createDescuento(DescuentoType descuentoType) {

        try {
            switch (descuentoType){
                case INTERNET:
                    System.out.println("Creando objeto INTERNET con ENUM");
                    return new DescuentoInternet();
                case TIENDA:
                    System.out.println("Creando objeto TIENDA con ENUM");
                    return new DescuentoTienda();
                case DIRECTIVO:
                    System.out.println("Creando objeto DIRECTIVO con ENUM");
                    return new DescuentoDirectivo();
            }
        }catch (RuntimeException e){e.getMessage(); }

        return null;
    }

    public static TipoDescuento createDescuento(int id) {

        try {
            switch (id){
                case (1):
                    System.out.println("Creando objeto INTERNET");
                    return new DescuentoInternet();
                case (2):
                    System.out.println("Creando objeto TIENDA");
                    return new DescuentoTienda();
                case (3):
                    System.out.println("Creando objeto DIRECTIVO");
                    return new DescuentoDirectivo();
            }
        }catch (RuntimeException e){e.getMessage(); }

        return null;
    }
}
