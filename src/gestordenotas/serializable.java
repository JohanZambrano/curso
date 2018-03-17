/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordenotas;
import java.io.Serializable;
/**
 *
 * @author Johan Zambrano
 */
public class serializable implements Serializable{
//De esta forma, declaramos que todos los objetos instanciados de "unaClase" serán serializados.
//Ahora veamos un ejemplo sencillo. Crearemos una clase llamada Agenda, la cual será serializable:
  private String nombre;
  private String p_Apellido;
  private transient String s_Apellido;
  public serializable(String nombre, String p_Apellido, String s_Apellido){
    this.nombre = nombre;
    this.p_Apellido = p_Apellido;
    this.s_Apellido = s_Apellido;
  }
}