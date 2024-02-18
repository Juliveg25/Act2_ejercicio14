
public enum Hermanos {
    JULIANA(31),
    ALEJANDRO(38),
    LAURA(28);

    private final int edad; //constante

    Hermanos(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}