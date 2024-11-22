package metodos;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class Metodos {

    /*public void CrearUsuario(JTextField name, JTextField pass, JTextField ps, String root) {
        String archivo = name.getText() + ".txt";
        File crearUbicacion = new File(root);
        File crearArchivo = new File(root + archivo);

        if (name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " El campo esta vacio");
        } else {
            try {

                if (crearArchivo.exists()) {
                    JOptionPane.showMessageDialog(null, "El registro ya esiste");
                } else {

                    crearUbicacion.mkdirs();
                    Formatter crea = new Formatter(root+archivo);
                    crea.format("%s\r\n%s\r\n%s\r\n", "Nombre= "+name.getText(),
                        "Contraseña= "+pass.getText(), "Palabra de seguridad= "+ps.getText());
                    crea.close();
                    JOptionPane.showMessageDialog(null, "Archivo creado");
                    
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se creo el archivo ");
            }
        }

    }*/
}
