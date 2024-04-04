package calculadoraBasica;


/**
 * @author David Rodríguez González
 *
 */
public class ProcesadorBasico {

	private static int sumar (int valor1, int valor2) {
		return valor1+valor2;
    }
    
    private static int restar (int valor1, int valor2) {
    	return valor1-valor2;
    }
    
    private static int multiplicar (int valor1, int valor2) {
    	return valor1*valor2;
    }
    
    private static int dividir (int valor1, int valor2) {
    	return valor1/valor2;
    }
    
    //devuelve el resto de la division.
    private static int modulo (int valor1, int valor2) {
    	return valor1%valor2;
    }

}
