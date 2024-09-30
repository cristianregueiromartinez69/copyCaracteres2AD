package copycaracters2;

import java.io.*;

/**
 * Clase para leer y escribir en un fichero utilizando las clases BufferedReader
 * y PrintWriter
 *
 * @author cristian
 * @version 1.0
 */
public class Ficheros {
/**
 * Metodo para leer y escribir en un fichero dada su ruta origen y ruta destino
 * @param pathOrigin la tura de origen
 * @param pathDestiny la ruta del destino
 */
    public void readWriteFile(String pathOrigin, String pathDestiny) {

        try {

            File file = new File(pathOrigin);
            File file2 = new File(pathDestiny);

            //comprobamos que existe el fichero
            if (file.exists() && file.isFile()) {

                //instanciamos los objetos y metemos el path
                BufferedReader br = new BufferedReader(new FileReader(file));
                PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter((file2))));

                String finish;

                //mientras la lectura sea diferente de null, tiene que escribir en el nuevo fichero
                while ((finish = br.readLine()) != null) {

                    pw.println(finish);

                }

                br.close();
                pw.close();
            } else {

                System.out.println("No se pudo acceder al fichero");

            }

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }

    }

}
