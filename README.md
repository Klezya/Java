Proyecto hecho en Java (JDK 21) con NetBeans 21

/////////////////////////////////////////////////////////////////
///                 Compilacion del Programa                 ////
/////////////////////////////////////////////////////////////////

            @@@ El programa ya viene compilado @@@

1. Abrir el proyecto desde NetBeans 21 y utilizar la funcion "Clean and Build"

2. El archivo "JAR" se encontrara en la carpeta "dist/testVocacional.jar" de este proyecto


///////////////////////////////////////////////////////////////
///                 Ejecucion del Programa                 ////
///////////////////////////////////////////////////////////////

1. Ejecute el archivo "Ejecutar.bat" y el programa iniciara automaticamente
//Tener en consideracion que se debe ejecutar desde la carpeta raiz "JAVA", para la correcta lectura del archivo de configuraciones


///////////////////////////////////////////////////////////
///                 Manejo del Archivo                 ////
///////////////////////////////////////////////////////////

//El archivo de configuraciones y manejo del test vocacional se encuentra en la carpeta src/resource/config.txt
//El archivo esta diseñado de la siguiente manera
//
//(Numero de areas)
//(Nombre del area) ; (Carrera relacionada) ; (Carrera relacionada) ; ...
//(Nombre del area) ; (Carrera relacionada) ; (Carrera relacionada) ; ...
//(Nombre del area) ; (Carrera relacionada) ; (Carrera relacionada) ; ...
//(Nombre del area) ; (Carrera relacionada) ; (Carrera relacionada) ; ...
//...
//
//(Numero de la pregunta) ; (Pregunta) ; (Area correspondiente)
//(Numero de la pregunta) ; (Pregunta) ; (Area correspondiente)
//(Numero de la pregunta) ; (Pregunta) ; (Area correspondiente)
//(Numero de la pregunta) ; (Pregunta) ; (Area correspondiente)
//(Numero de la pregunta) ; (Pregunta) ; (Area correspondiente)
//...
//


//El programa deberia ser capaz de leer e interpretar una cantidad variable tanto de areas como de preguntas
//en cuyo caso al finalizar el test mostrara solamente las 5 areas con mayor puntaje, tener en cuenta que deben ser minimo 5 areas

