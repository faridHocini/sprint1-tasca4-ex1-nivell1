package sprint1Tasca4Exercici2Nivell1;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int numeroDni;
    private char letraEsperada;

    public CalculoDniTest(int numeroDni, char letraEsperada) {
        this.numeroDni = numeroDni;
        this.letraEsperada = letraEsperada;
    }

    @Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            { 12345678, 'Z' },
            { 87654321, 'H' },
            { 11223344, 'M' },
            { 55667788, 'S' },
            { 99887766, 'R' },
            { 12312312, 'K' },
            { 78978978, 'Q' },
            { 45645645, 'Y' },
            { 32132132, 'F' },
            { 65465465, 'A' }
        });
    }

    @Test
    public void testCalculoLetra() {
    	assertEquals('A', CalculoDni.calcularLetra(65465465));
       
    }

	
}
