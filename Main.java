
package copycaracters2;

import javax.swing.JOptionPane;

/**
 * Clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

    
    public static void main(String[] args) {
        
        Ficheros ficha1 = new Ficheros();
        
        //pedimos al usuario que introduzca una ruta
        String pathOrigin = JOptionPane.showInputDialog("Introduce el path de origen: ");
        String pathDestiny = JOptionPane.showInputDialog("Introduce el path de destino: ");
        
        //llamamos al metodo
        ficha1.readWriteFile(pathOrigin, pathDestiny);
        
    }
    
}
