Actividad 3 – Implementación de Clases en Java

Descripción: En esta actividad se creó la clase Product aplicando los conceptos básicos de Programación .

La clase tiene los siguientes atributos privados:

id name price stock

Se implementaron: Constructor por defecto Constructor con parámetros Métodos getter y setter con validaciones Método toString() Métodos equals() y hashCode() También se creó la clase Main para probar el funcionamiento de la clase Product.

Estructura del proyecto

El proyecto está organizado en el paquete: com.example

Y contiene los archivos: Main.java Product.java

Cómo ejecutar Desde la carpeta raíz del proyecto:

Compilar: javac -d . src/main/java/com/example/*.java Ejecutar java com.example.Main

Salida esperada

Product 1 Name: Laptop Product 2 Price: 400.0

Complete Information: Product [ID: P001, Name: Laptop, Price: 1200.0, Stock: 28] Product [ID: P002, Name: Teclado, Price: 400.0, Stock: 52]
