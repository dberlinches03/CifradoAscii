package javaFX;

public class Main {
    public static void main(String[] args) {
        AlternatingAsciiCipher cipher = new AlternatingAsciiCipher();

        String mensajeOriginal = "HELLO";
        int clave = 3;
        String cifrado = cipher.cifrar(mensajeOriginal, clave);
        System.out.println("Mensaje cifrado: " + cifrado);

        String descifrado = cipher.descrifrar(cifrado, clave);
        System.out.println("Mensaje descifrado: " + descifrado);
    }
}