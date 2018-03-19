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
public class Universidad {
    Curso micurso=new Curso();//objeto tipo curso
    ArrayList cursos=new ArrayList();

public Universidad(){
}

public void agregarCurso(Curso curso)throws MyException{
    boolean existe=true;
    if(curso.getCodigo().isEmpty()||Integer.toString(curso.getCreditos()).isEmpty()||curso.getNombre().isEmpty()){
        throw new MyException("Hay Campos que no se han llenado");
    }else{
        for (int i=0; i< cursos.size(); i++){
            Curso cursoA= (Curso) cursos.get(i);
            if(curso.getNombre().equals(cursoA.getNombre())){
                JOptionPane.showMessageDialog(null, "Ya existe un curso con el mismo nombre");
                existe=false;
            }
        }
        if(existe){
            cursos.add(curso);
        }
    }
    
}

public Curso getCurso(String nombre){
    Curso respuesta=new Curso();
    for (int i=0; i< cursos.size(); i++){
            Curso curso= (Curso) cursos.get(i);
            if(curso.getNombre().equals(nombre)){
            cursos.set(i, curso); 
            respuesta=(Curso)cursos.get(i);
            }
        }
    return respuesta;
}

public String listarEstudiantesCurso(Curso curso){
    return curso.listarEstudiantes();
}

public void matricularEstudianteCurso(Curso curso, Estudiante estudiante){
    try{
    curso.matricularEstudiante(estudiante);
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Hay Campos que no se han llenado");
    }
}

public void asignarNotaCurso(String codigo, Curso curso, double nota){
    
            curso.AsignarNota(codigo, nota);
        
}

public String promedioEstudianteCurso(Curso curso){
    return curso.promedioEstudiantes();
}

public String mejorEstudianteCurso(Curso curso){
    return curso.mejorEstudiante();
}

public int numeroCursos(){
    int respuesta=0;
    for (int i=0; i< cursos.size(); i++){
        respuesta+=1;
    }
    return respuesta;
}
public class MyException extends Exception{
        public MyException(){
        }
        public MyException(String mensaje){
            super(mensaje);
        }
    }
}

