package factory;

/**
 * Created by Nicolas on 7/9/2016.
 */
public enum DescuentoType {
    INTERNET(1), TIENDA(2), DIRECTIVO(3);

    private final int value;

    private DescuentoType(final int value) {
        this.value = value;
    }

    public int getValue(){return value;}
}
