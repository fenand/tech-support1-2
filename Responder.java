import java.util.Random;
import java.util.ArrayList;

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
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numeroAleatorio =  respuestaAleatoria.nextInt(5);
        return respuesta.get(numeroAleatorio);
        // alternativa mas eficiente
        //return respuesta.get(respuestaAleatoria.nextInt(5));
    }
}
