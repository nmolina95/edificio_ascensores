# edificio_ascensores

<h1>Enunciado</h1>

Se solicita desarrollar un programa que regule el funcionamiento de los ascensores de un edificio. 

Del <strong>Edificio</strong> conocemos los siguientes atributos: la cantidad de pisos y una lista con sus ascensores.


En cuanto al <strong>Ascensor</strong>, conocemos su número identificador, el piso actual en donde se encuentra parado (inicia en 0) y un funcionamiento (TODOS, PARES, IMPARES). 

<em><b>Aclaración</b></em>: Que un ascensor tenga funcionamiento PARES, implica que sólo frena en los pisos pares.
<br>
<br>
Se nos pide crear lo siguiente en donde corresponda:

<ul>
  <li><b>Constructor</b> de Edificio: Recibe la cantidad de pisos del edificio y la cantidad de ascensores. Setea los atributos correspondientes, instanciando la cantidad de ascensores solicitada.</li>

  <li>Método <b>obtenerMasCercano()</b>: recibe un piso y devuelve el ascensor que más cerca se encuentra de dicho piso. Si un ascensor que saltea pisos puede parar en el piso deseado y está igual de cerca que uno que acude a todos, el que va es el primero (el que saltea).</li>  

  <li>Método <b>llamarAscensor()</b>: recibe un piso por parámetro y llama al ascensor que se encuentra más cerca. Actualiza el número de piso que acudió al llamado y devuelve el número de este ascensor.</li>

  <li>Método <b>setFuncionamientoSegunNumero()</b>: setea el funcionamiento del ascensor en base a su número identificador. Los primeros dos ascensores del edificio siempre llegan a todos los pisos. A partir del tercero, los que tienen identificador par llegan a los pisos pares, los que tienen identificador impar a los impares.</li>

  <li>Método <b>puedoLlegar()</b>: recibe un número de piso y devuelve un booleano indicando si dicho ascensor puede llegar al piso indicado.</li>
</ul>

Recordá: Hay ascensores que pueden llegar a todos los pisos.

<em>Recordá que podés crear todos los métodos que consideres necesarios para mantener el correcto manejo de responsabilidades entre los objetos.</em>


En la clase Test, creá una instancia de Edificio, con 30 pisos y 4 ascensores, y luego ejecutá las instrucciones respetando el siguiente escenario:

<ol>
  <li>Llamar ascensor desde piso 14 → Debe mostrar “ASCENSOR 4”</li>
  <li>Llamar ascensor desde piso 13 → Debe mostrar “ASCENSOR 3”</li>
  <li>Llamar ascensor desde piso 2 → Debe mostrar “ASCENSOR 2”</li>
  <li>Llamar ascensor desde piso 16 → Debe mostrar “ASCENSOR 4”</li>
  <li>Llamar ascensor desde piso 5 → Debe mostrar “ASCENSOR 2”</li>
  <li>Llamar ascensor desde piso 30 → Debe mostrar “ASCENSOR 4”</li>
  <li>Llamar ascensor desde piso 1 → Debe mostrar “ASCENSOR 1”</li>
</ol>