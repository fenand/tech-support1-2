import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

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
    HashMap<String, String> respuestasHashMap;

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
        // llenamos el hashmap

        respuestasHashMap.put("estudiar","deberias estudiar un poco mas");
        respuestasHashMap.put("adios","te vas ya?");
        respuestasHashMap.put("no"," no me dejes asi");
        respuestasHashMap.put("casa","vete de casa pesao");

    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse( String userInput)
    {

        String respuestaHash = null;
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
