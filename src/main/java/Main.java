import factory.DescuentoFactory;
import factory.DescuentoType;
import implement.DescuentoDirectivo;
import pojo.Compra;

import java.util.Random;

/**
 * Created by Nicolas on 7/9/2016.
 */
public class Main {

    public static void main(String[] args) {

        Compra c = new Compra(1000);

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);
        System.out.println(c.descuento(DescuentoFactory.createDescuento(randomInt)));

        //System.out.println(c.descuento(DescuentoFactory.createDescuento(DescuentoType.INTERNET)));

    }

}
