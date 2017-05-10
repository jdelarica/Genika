import android.graphics.Point;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by christian on 30/3/17.
 */

public class landmarkextraction{

    public void landmarkextract(ArrayList<Point> landmarks) throws IOException {
        String ruta = "/sdcard/landmarks.txt"; //DEFINIMOS LA RUTA DONDE GUARDAR EL ARCHIVO
        File archivo = new File(ruta); //CREAMOS UN ARCHIVO EN LA RUTA DESEADA
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo)); //PARA PODER ESCRIBIR EL ARCHIVO
        for(int i=0; i<landmarks.size(); i++){ //RECORREMOS TODOS LOS LANDMARKS
            bw.write(String.valueOf(landmarks.get(i))+"\n"); //GUARDAMOS EL VALOR DE LOS LANDMARKS
        }
        bw.close();
    }
}

