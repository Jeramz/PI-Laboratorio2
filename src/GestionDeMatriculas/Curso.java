/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeMatriculas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Jesús Ramírez
 */
public class Curso {
    
    String codigo;
    String nombre;
    int numeroCreditos;
    Estudiante miEstudiante = new Estudiante();//objeto tipo estudiante
    ArrayList estudiantesCurso = new ArrayList();
    
    
    public Curso(){
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getCreditos(){
        return numeroCreditos;
    }
    
    public void setCreditos(int creditos){
        this.numeroCreditos=creditos;
    }
    
    public void matricularEstudiante(Estudiante estudiante)throws MyException1{
        boolean existe=true;
        if(estudiante.getCodigo().isEmpty()||Double.toString(estudiante.getNotasEstudiante()).isEmpty()||estudiante.getNombre().isEmpty()){
        throw new MyException1("Hay Campos que no se han llenado");
    }else{
        for (int i=0; i< estudiantesCurso.size(); i++){
            Estudiante cursoA= (Estudiante) estudiantesCurso.get(i);
            if(estudiante.getCodigo().equals(cursoA.getCodigo())){
                javax.swing.JOptionPane.showMessageDialog(null, "                         EROR"
                                                              + "\n\nEl estudiante ya está matriculado en este curso");
                existe=false;
            }
        }
        if(existe){
            estudiantesCurso.add(estudiante);
        }
    }
    }
    
    public void AsignarNota(String codigoEstudiante, double nota){
        if(codigoEstudiante.isEmpty()||Double.toString(nota).isEmpty()){
                JOptionPane.showMessageDialog(null, "Hay campos que no se han llenado");
            }
        else{
            for(int i=0;i<estudiantesCurso.size();i++){
                Estudiante estudiante= (Estudiante) estudiantesCurso.get(i);
            
                if(estudiante.getCodigo().equals(codigoEstudiante)){
                
                    estudiante.setNotasEstudiante(nota);  
                    estudiantesCurso.set(i, estudiante);
                    JOptionPane.showMessageDialog(null, "La nota ha sido registrada con exito");
                    }
                }
            }
    }
    
    public String listarEstudiantes(){
        String respuesta="";
        if(estudiantesCurso.isEmpty()){
            respuesta="No hay estudiantes matriculados";
        }else{
            for(int i=0; i<estudiantesCurso.size();i++){
                Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
                respuesta+=estudiante.getCodigo() + " " + 
                           estudiante.getNombre() + " " +
                           estudiante.getPlanEstudio() + " " + 
                           estudiante.getNotasEstudiante() + "\n";
            }
        }
        return respuesta;
    }
    
    public String promedioEstudiantes(){
        double nota=0;
        String respuesta="";
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            nota+=estudiante.getNotasEstudiante() / estudiantesCurso.size();
        }
        if(nota==0){
            respuesta="No hay estudiantes matriculados en este curso";
        }else{
            respuesta="El promedio de los estudiantes en el curso es de: " +Double.toString(nota);
        }
        return respuesta;
    }
    
    public String mejorEstudiante(){
        String respuesta="";
        double mejorNota=0;
        for(int i=0;i<estudiantesCurso.size();i++){
            Estudiante estudiante=(Estudiante) estudiantesCurso.get(i);
            if(estudiante.getNotasEstudiante() > mejorNota){
                mejorNota=estudiante.getNotasEstudiante();
                respuesta="El mejor estudiante fue \n" + estudiante.getCodigo() + " " + estudiante.getNombre() + " con una nota de: " + mejorNota;
            }
        }
        if(respuesta.equals("")){
            respuesta="No hay estudiantes matriculados en este curso";
        }
        return respuesta;
    }
    public class MyException1 extends Exception{
        public MyException1(){
        }
        public MyException1(String mensaje){
            super(mensaje);
        }
    }
}

