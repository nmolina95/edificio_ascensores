package edificio_ascensores;

public class Ascensor {
    private int identificador;
    private int pisoActual;
    private Funcionamiento funcionamiento;

    public Ascensor(int identificador) {
        setIdentificador(identificador);
        setPisoActual(0);
        setRecorrido();
    }

    public boolean puedoLlegar(int piso) {
        boolean resultado = false;
        switch (this.getFuncionamiento()) {
            // Convertir para todos
            case TODOS:
                resultado = true;
                break;
            // Convertirlos en solo impares
            case IMPARES:
                if (piso % 2 != 0)
                    resultado = true;
                break;
            // Convertirlos en solo pares
            case PARES:
                if (piso % 2 == 0)
                    resultado = true;
                break;
        }
        return resultado;
    }

    // Setters y Getters
    public void setRecorrido() {
        if (this.getIdentificador() <= 2) {
            this.setTodos();
        }
        // Convertirlos en solo pares
        else if (this.getIdentificador() % 2 == 0) {
            this.setSoloPares();
        }
        // Convertirlos en solo impares
        else {
            this.setSoloImpares();
        }
    }

    private void setTodos() {
        setFuncionamiento(Funcionamiento.TODOS);
    }

    private void setSoloPares() {
        setFuncionamiento(Funcionamiento.PARES);
    }

    private void setSoloImpares() {
        setFuncionamiento(Funcionamiento.IMPARES);
    }

    public int getDiferenciaDePisos(int piso) {
        int diferencia;

        diferencia = piso - this.getPisoActual();

        if (diferencia < 0) diferencia *= -1; // Modulo

        return diferencia;
    }

    public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Funcionamiento getFuncionamiento() {
        return funcionamiento;
    }

    private void setFuncionamiento(Funcionamiento funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

}
