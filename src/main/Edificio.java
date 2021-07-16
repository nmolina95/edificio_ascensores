package edificio_ascensores;

import java.util.ArrayList;

public class Edificio {
    private int cantidadDePisos;
    private ArrayList<Ascensor> ascensores;

    // Metodo constructor
    public Edificio(int cantidadDePisos, int cantidadAscensores) {
        setCantidadDePisos(cantidadDePisos);
        setAscensores(nuevosAscensores(cantidadAscensores));
    }

    // Metodo para agregar mas de un ascensor a la vez
    public static ArrayList<Ascensor> nuevosAscensores(int cantidadAscensores) {
        int i = 1;
        ArrayList<Ascensor> nuevosAscensores = new ArrayList<Ascensor>();

        while (i <= cantidadAscensores) {
            nuevosAscensores.add(new Ascensor(i));
            i++;
        }
        return nuevosAscensores;
    }

    public Ascensor obtenerMasCercano(int piso) {
        Ascensor menor = ascensores.get(0);
        Ascensor ascensorActual = null;

        for (int i = 1; i < ascensores.size(); i++) {
            ascensorActual = ascensores.get(i);
            if (ascensorActual.puedoLlegar(piso)
                    && ascensorActual.getDiferenciaDePisos(piso) <= menor.getDiferenciaDePisos(piso)) {
                // Menor o igual nos da cualquier ultimo ascensor que sea menor
                menor = ascensorActual;
            }
        }
        return menor;
    }

    public int llamarAscensor(int piso) {
        Ascensor menor = obtenerMasCercano(piso);
        menor.setPisoActual(piso);
        return menor.getIdentificador();
    }

    // Setters y Getters
    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    private void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public ArrayList<Ascensor> getAscensores() {
        return ascensores;
    }

    private void setAscensores(ArrayList<Ascensor> ascensores) {
        this.ascensores = ascensores;
    }

}
