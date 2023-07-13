
package paquete11;

/**
 *
 * @author Italo
 */
public class APIDisney implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"DISNEY808080";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
