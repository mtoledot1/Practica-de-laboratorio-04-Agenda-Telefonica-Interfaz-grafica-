# Práctica de laboratorio 04 Agenda Telefónica Interfaz gráfica
## Objetivo Alcanzado
 * Crear interfaces gráficas de usuario empleando técnicas de modelado de objetos.
## Actividades Desarrolladas
### 1. Diseñar un prototipo de la aplicación Agenda Telefónica
![Prototipo](https://github.com/mtoledot1/Capturas/blob/master/Practica%204/Prototipo.jpg)

### 2. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 04: Agenda Telefónica (Interfaz gráfica)”
![Repositorio GitHub](https://github.com/mtoledot1/Capturas/blob/master/Practica%204/Repositorio.jpg)

![Link Repositorio](hhttps://github.com/mtoledot1/Practica-de-laboratorio-04-Agenda-Telefonica-Interfaz-grafica-)
### 3. Desarrollar una Interfaz Gráfica de Usuario en Java para gestionar una agenda telefónica según los requerimientos planteados en las instrucciones de la práctica
![Ventana](https://github.com/mtoledot1/Capturas/blob/master/Practica%204/Ventana.jpg)

Esta ventana está desarrollada en la clase VentanaTelefono, en esta clase creamos una instancia de la clase Frame para la ventana, y le añadimos un panel con el layout GridBagLayout, que es igual al layout GridLayout, pero nos da más opciones para el modelado como el posicionamiento manual en la rejilla, la cantidad de celdas que ocupará el componente, el espaciado entre las celdas, etc. 

Creamos los Labels, los TextFields y los Botones que utilizaremos para la interfaz, y luego añadimos todos los componentes al panel, que luego añadimos a la ventana. El label Estado nos servirá para mostrar si se pudo cumplir la función que desea el usuario, o si ocurrió algún error en el proceso.

Añadimos un actionListener al botón salir para poder cerrar la ventana y continuar con la ejecución del programa, sin embargo es el único evento añadido, y la ventana solo queda como un prototipo sin funcionalidad real.

### 4. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación desde principio a fin.
![Commits](https://github.com/mtoledot1/Capturas/blob/master/Practica%204/Commits.jpg)

## Resultado(s) Obtenido(s)
 * Diseñar e implementar un prototipo de una interfaz gráfica.
 
 * Emplear la librería AWT de Java para crear ventanas y llenarla con componentes.
 
 * Entender como funciona una ventana y como funcionan cada uno de los componentes que se van añadiendo.
 
## Conclusiones
 * Para implementar una interfaz se debe tener un prototipo que nos describa como será el diseño final de las ventanas y como estarán posicionados sus componentes.
 
 * La interfaz gráfica nos ayuda a hacer más amigable nuestro programa para el usuario final, y que sea más accesible al momento de utilizarlo.
 
## Recomendaciones

 * Entender el uso de los diferentes layouts que nos provee Java, y como funciona sus posicionamientos de los componentes.
 
 * Aprender las opciones que poseen los componentes de una interfaz, como funcionan cada una de ellas y como utilizarlas para diseñar de forma conveniente nuestra ventana.
