package sprint1Tasca4Exercici2Nivell1;



public class CalculoDni {
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetra(int numeroDni) {
        int resto = numeroDni % 23;
        return LETRAS.charAt(resto);
    }
}
