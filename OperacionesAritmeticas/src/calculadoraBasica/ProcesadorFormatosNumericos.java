package calculadoraBasica;

import java.math.BigInteger;

public class ProcesadorFormatosNumericos {

	//----------INT--------------
	private static double int_a_double (int valor) {
		return (double) valor;
    }
	
	private static String int_a_string (int valor) {
		return Integer.toString(valor);
    }
	
	private static short int_a_short (int valor) {
		return (short) valor;
    }
	
	private static long int_a_long (int valor) {
		return (long) valor;
    }
	
	private static BigInteger int_a_BigInteger (int valor) {
		  return BigInteger.valueOf(valor);
    }
	
	//----------string--------------
	private static double string_a_double (String valor) {
		return Double.parseDouble(valor);
	}

	private static short string_a_short (String valor) {
		return Short.parseShort(valor);
	}

	private static long string_a_long (String valor) {
		return Long.parseLong(valor);
	}

	private static BigInteger string_a_BigInteger (String valor) {
		return new BigInteger(valor);
	}

	//----------double--------------
	private static String double_a_string (double valor) {
		return Double.toString(valor);
	}

	private static short double_a_short (double valor) {
		return (short) valor;
	}

	private static long double_a_long (double valor) {
		 return (long) valor;
	}

	private static BigInteger double_a_BigInteger (double valor) {
		return BigInteger.valueOf((long) valor);
	}

	private static int double_a_int (double valor) {
		return (int) valor;
	}
	
	//----------short--------------

	private static double short_a_double (short valor) {
		return (double) valor;
	}
	
	private static String short_a_string (short valor) {
		 return Short.toString(valor);
	}
	
	private static long short_a_long (short valor) {
		return (long) valor;
	}
	
	private static BigInteger short_a_BigInteger (short valor) {
		 return BigInteger.valueOf((long) valor);
	}
	
	private static int short_a_int (short valor) {
		return (int) valor;
	}
	
	
		//----------long--------------
	
	private static double long_a_double (long valor) {
		return (double) valor;
	}
	
	private static String long_a_string (long valor) {
		return Long.toString(valor);
	}
	
	private static short long_a_short (long valor) {
		if (valor < Short.MIN_VALUE || valor > Short.MAX_VALUE) {
            throw new IllegalArgumentException("Valor fuera del rango de short");
        }
        return (short) valor;
	}
	
	private static BigInteger long_a_BigInteger (long valor) {
		return BigInteger.valueOf(valor);
	}
	
	private static int long_a_int (long valor) {
		if (valor < Integer.MIN_VALUE || valor > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Valor fuera del rango de int");
        }
        return (int) valor;
	}
	
		//----------BigInteger--------------
	
	private static double BigInteger_a_double (BigInteger valor) {
		 return valor.doubleValue();
	}
	
	private static String BigInteger_a_string (BigInteger valor) {
		 return valor.toString();
	}
	
	private static short BigInteger_a_short (BigInteger valor) {
        if (valor.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) > 0 || valor.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) < 0) {
            throw new IllegalArgumentException("Valor fuera del rango de short");
        }
        return valor.shortValue();
	}
	
	private static long BigInteger_a_long (BigInteger valor) {
        if (valor.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || valor.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
            throw new IllegalArgumentException("Valor fuera del rango de long");
        }
        return valor.longValue();
	}
	
	private static int BigInteger_a_int (BigInteger valor) {
        if (valor.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 || valor.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            throw new IllegalArgumentException("Valor fuera del rango de int");
        }
        return valor.intValue();
	}
	
}


