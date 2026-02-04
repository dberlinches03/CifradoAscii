



Cifrado ASCII con Suma/Resta Alternada

Introducción


Este proyecto implementa un algoritmo de cifrado propio basado en la manipulación de valores ASCII.
A diferencia del cifrado César, que aplica un desplazamiento fijo a todas las letras, este método utiliza un sistema alternado que modifica cada carácter según su posición dentro del mensaje.

El objetivo es crear un cifrado sencillo de implementar pero más complejo y menos predecible que los cifrados clásicos de sustitución.

Descripción del algoritmo
El algoritmo aplica una suma o resta al valor ASCII de cada carácter dependiendo de si su posición es par o impar.

Reglas del cifrado
Dado un mensaje y una clave numérica:

Si el índice del carácter es par (0, 2, 4…):
Se suma la clave al valor ASCII.

Si el índice del carácter es impar (1, 3, 5…):
Se resta la clave al valor ASCII.

Después, el valor resultante se convierte de nuevo en un carácter.

Reglas del descifrado
El proceso inverso:

Índices pares → restar la clave

Índices impares → sumar la clave

De esta forma, el mensaje vuelve a su estado original.

Ejemplo de funcionamiento
Mensaje original
HELLO
Clave
3
Proceso de cifrado
Índice	Carácter	ASCII	Operación	Resultado ASCII	Nuevo carácter
0 (par)	H	72	+3	75	K
1 (impar)	E	69	-3	66	B
2 (par)	L	76	+3	79	O
3 (impar)	L	76	-3	73	I
4 (par)	O	79	+3	82	R
Resultado cifrado
KBOIR
Descifrado
HELLO
Código fuente
java
package org.example;

public class AlternatingAsciiCipher {

    public static String cifrar(String mensaje, int clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            int ascii = (int) c;

            if (i % 2 == 0) {
                // Posición par → sumar clave
                ascii += clave;
            } else {
                // Posición impar → restar clave
                ascii -= clave;
            }

            resultado.append((char) ascii);
        }

        return resultado.toString();
    }

    public static String descifrar(String mensajeCifrado, int clave) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char c = mensajeCifrado.charAt(i);
            int ascii = (int) c;

            if (i % 2 == 0) {
                // Posición par → restar clave
                ascii -= clave;
            } else {
                // Posición impar → sumar clave
                ascii += clave;
            }

            resultado.append((char) ascii);
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String mensajeOriginal = "HELLO";
        int clave = 3;

        String cifrado = cifrar(mensajeOriginal, clave);
        System.out.println("Mensaje cifrado: " + cifrado);

        String descifrado = descifrar(cifrado, clave);
        System.out.println("Mensaje descifrado: " + descifrado);
    }
}
Resultado de la prueba
Mensaje cifrado: KBOIR
Mensaje descifrado: HELLO
