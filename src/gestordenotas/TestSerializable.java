/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;
import java.io.*;

/**
 *
 * @author Johan Zambrano
 */
public class TestSerializable {
    public static void main(String[] args){
        serializable a1 = new serializable("Ana", "Martínez", "Fernández");
        serializable a2 = new serializable("Ernesto", "García", "Pérez");
        //output
        try{
          FileOutputStream fs = new FileOutputStream("archivo.ser");//Creamos el archivo
          ObjectOutputStream os = new ObjectOutputStream(fs);//Esta clase tiene el método writeObject() que necesitamos
          os.writeObject(a1);//El método writeObject() serializa el objeto y lo escribe en el archivo
          os.writeObject(a2);
          os.close();//Hay que cerrar siempre el archivo
        }
        catch(FileNotFoundException e){
          e.printStackTrace();
        }
        catch(IOException e){
          e.printStackTrace();
        }
        //Input
        try{
            FileInputStream fis = new FileInputStream("archivo.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            a1 = (serializable) ois.readObject();//El método readObject() recupera el objeto
            a2 = (serializable) ois.readObject();
            ois.close(); fis.close();
          }
        catch(FileNotFoundException e){
           e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        /*
        Socket
        Main socket = new Main(direccion, puerto);
	OutputStream os = socket.getOutputStream();
	InputStream is = socket.getInputStream();
	ObjectOutputStream out = new ObjectOutputStream(os);
	ObjectInputStream in = new ObjectInputStream(is);
	PeticionSerializable ps = new PeticionSerializable();
	RespuestaSerializable rs = new RespuestaSerializable();
        // Escribir una petición en el socket
    	out.writeObject(ps);
        // Recibir del socket la respuesta
	rs = (RespuestaSerializable)in.readObject();
        **/
    }
}