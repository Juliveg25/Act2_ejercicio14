
class HermanoMayor {

    public String encontrarHermanoMayor() {
        int edadPrimerHermano = Hermanos.values()[0].getEdad();
        String nombreEnum = Hermanos.values()[0].toString();

        for (int i = 1; i < Hermanos.values().length; i++) {
            int edadAnalizada = Hermanos.values()[i].getEdad();
            if (edadAnalizada > edadPrimerHermano) {
                edadPrimerHermano = edadAnalizada;
                nombreEnum = Hermanos.values()[i].toString();
            }
        }
        return nombreEnum;
    }
}