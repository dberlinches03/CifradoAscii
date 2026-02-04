package javaFX;

public class AlternatingAsciiCipher {
    public String cifrar(String mensaje, int clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            int ascii = (int) c;

            if (i % 2 == 0) {
                // Posición par -> sumar clave
                ascii += clave;
            } else {
                // Posicion impar -> restar clave
                ascii -= clave;
            }
            resultado.append((char) ascii);
        }
        return resultado.toString();
    }

    public String descrifrar(String mensajeCifrado, int clave) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char c = mensajeCifrado.charAt(i);
            int ascii = (int) c;

            if (i % 2 == 0) {
                // Posición par -> restar clave
                ascii -= clave;
            } else {
                // Posición impar -> sumar clave
                ascii += clave;
            }
            resultado.append((char) ascii);
        }
        return resultado.toString();
    }
}
