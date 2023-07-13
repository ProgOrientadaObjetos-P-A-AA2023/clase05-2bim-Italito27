/*
 * 
 * D - Dependency inversion principle (Principio de inversiÃ³n de dependencias)
 */
package paquete11;

public class Principal {
    public static void main(String[] args) {
        
        // Grupo 7
        
        /*
        Usar el txt llamado usuarios.txt; por cada lÃ­nea del archivo
        crer un API en funciÃ³n de su servicio; ademÃ¡s el API ahora genera
        informaciÃ³n estÃ¡tica (no cambia el API), se debe buscar la forma que el 
        API sea dinÃ¡mico totalmente (usar alguna librerÃ­a propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la informaciÃ³n 
        a travÃ©s de un toString
        */
        
        // Variable con el nombre del archivo
        String nombreArchivo = "usuarios.txt";
        
        /* Objeto de tipo LecturaArchivo, que recive como parÃ¡metro el nombre
        del archivo */
        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        lectura.establecerLista();
        // Se establece la lista con los datos del archivo
        
        System.out.println(lectura); // Se imprime el toString de LecturaArchivo
        lectura.cerrarArchivo(); // Se cierra el archivo
    }
}
