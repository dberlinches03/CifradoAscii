



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

Para cifrar el mensaje, el algoritmo recorre cada carácter uno por uno y aplica una operación distinta dependiendo de la posición en la que se encuentre dentro del texto.

Se toma el primer carácter del mensaje (posición 0).
Como es una posición par, se convierte el carácter a su valor ASCII y se le suma la clave.
El número resultante se vuelve a convertir en un carácter, que será el primer carácter cifrado.

Se toma el segundo carácter (posición 1).
Esta vez la posición es impar, así que se convierte a ASCII y se le resta la clave.
El resultado se convierte de nuevo en un carácter cifrado.

Se continúa con el tercer carácter (posición 2).
Al ser una posición par, se repite el proceso de sumar la clave al valor ASCII.

El cuarto carácter (posición 3) vuelve a ser impar, por lo que se resta la clave.

El proceso continúa alternando entre sumar y restar la clave según la posición del carácter hasta completar todo el mensaje.

Al final, todos los caracteres transformados se unen para formar el mensaje cifrado.

Resultado cifrado

KBOIR

Descifrado

HELLO

Resultado de la prueba

Mensaje cifrado: KBOIR

Mensaje descifrado: HELLO
