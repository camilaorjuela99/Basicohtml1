/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.util.List;
import model.Aprendiz;



public interface MeAprendiz {
    
    public Aprendiz list (int id);
    public List listados();
    public boolean registrar(Aprendiz ap);
    public boolean actualizar(Aprendiz ap);
    public boolean eliminar(Aprendiz ap);
    
}
