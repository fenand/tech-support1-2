import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{

    Random respuestaAleatoria;
    ArrayList<String>respuesta;
    HashMap<HashSet<String>, String> respuestasHashMap;

    //crearemos un hashmap para incluir clave y cadenas k son las palabras que va a reconocer string y y v las respuestas
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        //iniciamos el random y el arraylist
        respuestaAleatoria = new Random();
        respuesta = new ArrayList<>();

        //añadimos 5 respuestas
        respuesta.add("¿Estas seguro de esa pregunta?");
        respuesta.add("¿Escribe bien?");
        respuesta.add("No es correcto");
        respuesta.add("Cierra todo y largate");
        respuesta.add("Estudia mas Zoquete!!");

        //iniciamos el objeto
        respuestasHashMap = new HashMap<>();

        //conjunto de String 
        HashSet<String> set01 = new HashSet<>();
        set01.add("adios");
        set01.add("chao");

        HashSet<String> set02 = new HashSet<>();
        set02.add("estudiar");
        set02.add("freak");
        set02.add("estudiar");
        set02.add("chao");

        HashSet<String> set03 = new HashSet<>();
        set03.add("no");
        set03.add("negativo");
        set03.add("nulo");
        set03.add("chao");

        HashSet<String> set04 = new HashSet<>();
        set04.add("casa");
        set04.add("home");
        set04.add("hogar");

        // llenamos el hashmap
        respuestasHashMap.put(set02,"deberias estudiar un poco mas");
        respuestasHashMap.put(set01,"te vas ya?");
        respuestasHashMap.put(set03," no me dejes asi");
        respuestasHashMap.put(set04,"vete de casa pesao");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String>userInput)
    {

        String respuestaHash = null;
        // Iterator<String> iterator = userInput.iterator();
        // boolean buscador = true;
        // while(iterator.hasNext() && buscador){
        // respuestaHash = respuestasHashMap.get(iterator.next());
        // if(respuestaHash != null){
        // buscador= false;
        // }
        // }

        // for(String elementos : userInput){
        // //por cada elemto del hasset decir que la respuesta es el valor del hashset que tiene como clave el elemnto que estamos mirando en el for
        // if(respuestaHash== null){
        // respuestaHash = respuestasHashMap.get(elementos);
        // }
        // }

        // //altenativa con un for
        // String userinputString =  iterator.next();

        // respuestaHash = respuestasHashMap.get(userInput);
        respuestaHash = respuestasHashMap.get(userInput);
        int numeroAleatorio =  respuestaAleatoria.nextInt(5);
        if(respuestaHash == null){
            respuestaHash = respuesta.get(numeroAleatorio);
        }

        return respuestaHash;
        // alternativa mas eficiente
        //return respuesta.get(respuestaAleatoria.nextInt(5));

    }
}
