package edificio_ascensores;
public class Test {

    /*
     * En la clase Test, creá una instancia de Edificio, con 30 pisos y 4
     * ascensores, y luego ejecutá las instrucciones respetando el siguiente
     * escenario:
     * 
     * Llamar ascensor desde piso 14 → Debe mostrar “ASCENSOR 4” Llamar ascensor
     * desde piso 13 → Debe mostrar “ASCENSOR 3” Llamar ascensor desde piso 2 → Debe
     * mostrar “ASCENSOR 2” Llamar ascensor desde piso 16 → Debe mostrar “ASCENSOR
     * 4” Llamar ascensor desde piso 5 → Debe mostrar “ASCENSOR 2” Llamar ascensor
     * desde piso 30 → Debe mostrar “ASCENSOR 4” Llamar ascensor desde piso 1 → Debe
     * mostrar “ASCENSOR 1”
     */

    public static void main(String[] args) {
        // Genero nuevo edificio con 30 pisos y 4 ascensores
        Edificio edificio = new Edificio(30, 4);

        System.out.println(edificio.getAscensores());

        // Llamo a los ascensores desde los distintos pisos comprobando que respete el funcionamiento establecido
        System.out.println("Llamar ascensor desde piso 14 -> " + edificio.llamarAscensor(14));
        System.out.println("Llamar ascensor desde piso 13 -> " + edificio.llamarAscensor(13));
        System.out.println("Llamar ascensor desde piso 2 -> " + edificio.llamarAscensor(2));
        System.out.println("Llamar ascensor desde piso 16 -> " + edificio.llamarAscensor(16));
        System.out.println("Llamar ascensor desde piso 5 -> " + edificio.llamarAscensor(5));
        System.out.println("Llamar ascensor desde piso 30 -> " + edificio.llamarAscensor(30));
        System.out.println("Llamar ascensor desde piso 1 -> " + edificio.llamarAscensor(1));
    }

}

