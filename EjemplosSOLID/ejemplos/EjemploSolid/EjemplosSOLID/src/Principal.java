import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import paquete09.APINetflix;
import paquete11.APIDisney;
import paquete11.APIMovie;
import paquete11.

import paquete11.GeneradorPelicula;
public class Principal {
    public static void main(String[] args) {
        Map<String, APIMovie> apiMap = new HashMap<>();
        apiMap.put( "123455");
        apiMap.put("Disney",);
        
        apiMap.put("Amazon",c);
        apiMap.put("Startplus",c);

        try (BufferedReader br = new BufferedReader(new FileReader("datos/usuarios.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                int id = Integer.parseInt(parts[0]);
                String usuario = parts[1];
                String servicio = parts[2];

                GeneradorPelicula generador = new GeneradorPelicula();
                APIMovie api = apiMap.get(servicio);
                generador.establecerLlave(api);
                generador.establecerUrl(servicio + "-" + usuario);

                System.out.println(generador.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}