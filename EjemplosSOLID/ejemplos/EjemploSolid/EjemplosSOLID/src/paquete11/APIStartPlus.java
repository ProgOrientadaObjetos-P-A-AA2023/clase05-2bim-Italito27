/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author Italo
 */
public class APIStartPlus implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"STAR+707070";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
