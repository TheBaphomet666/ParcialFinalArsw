# Parcial Final
En el Readme.md describa la arquitectura implementada, demuestre conocimiento de lo que está sucediendo, utilice código y gráficas para explicar. hable de atributos de calidad y limitaciones de su arquitectura. Escriba de manera clara y ordenada.

Se implementó una Arquitectura de un API REST SPRING al que se le inyectaba un servicio  que convertía las unidades, de esta manera tenía extensibilidad para diferentes implementaciónes o recibir los datos de otro API, se hizo desde las anotaciones que spring ofrece, luego se mostraba a través de axios en html a través de los verbos HTTP que ofrecía el controlador, que por el momento solo ofrecía dos GET en los siguientes endpoints /Converter/fahrenheit/{value} y /Converter/celsius/{value} , manejandolo desde JS con dos modulos, uno que se encargaba del Front-End y otro del Back-End que se conectaba con el API y recibía las respuestas.

Posee calidad de extensibilidad ya que la forma de calcular los datos permite inyección lo cual hace que sea posible que se usen diferentes implementaciones o pedir desde otro API

También el uso de los Verbos HTTP sube el nivel de madurez del API

Además el Manejo para mostrar las cosas en el JS es asíncrono apoyandose en Axios y las promesas.