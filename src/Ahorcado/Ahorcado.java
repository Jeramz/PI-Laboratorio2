/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import javax.swing.*;
public class Ahorcado {
    String temas[]={"Animales","Planetas","Paises","Electrodomesticos","Utiles escolares"};
    String palabrasTema1[]={"Serpiente","Gorila","Águila","Perro","Oso","Vaca","Elefante","Cocodrilo"}, 
           palabrasTema2[]={"Mercurio","Venus","Tierra","Marte","Saturno","Jupiter","Neptuno","Urano"},
           palabrasTema3[]={"Japon","Brasil","Rusia","Colombia","Canada","Alemania","Italia","Peru"},
           palabrasTema4[]={"Lavadora","Televisor","Microondas"," Radio","Plancha","Tostadora","Licuadora","Nevera"},
           palabrasTema5[]={"Colores","Tijeras","Lapicero","Cuaderno","Cartuchera","Lapiz","Compas","Carpeta"};
    int oportunidades=7;
    String palabra="";
    ImageIcon imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado0.jpg"));
    
    public Ahorcado(){
    }
    public void setPalabra(String palabra){
        this.palabra=palabra;
    }
    public String getPalabra(){
        return palabra;
    }
  
    
    public ImageIcon getImagenAhorcado(){
        return imgAhorcado;
    }
    
    public void cambiarEstadoImagen(){
        switch(oportunidades){
            case 0:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado7.jpg"));
                break;
            case 1:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado6.jpg"));
                break;
            case 2:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado5.jpg"));
                break;
            case 3:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado4.jpg"));
                break;
            case 4:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado3.jpg"));
                break;
            case 5:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado2.jpg"));
                break;
            case 6:
                imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado1.jpg"));
                break;
            
        }
    }
    
    public String temaAzar(){
        return temas[(int)(Math.random()*4)+1];
    }
    
    public String palabraAzar(String tema){
        String resultado="";
        if(temas[0].equals(tema)){
            resultado=palabrasTema1[(int)(Math.random()*7)+1];
        }
        if(temas[1].equals(tema)){
            resultado=palabrasTema2[(int)(Math.random()*7)+1];
        }
        if(temas[2].equals(tema)){
            resultado=palabrasTema3[(int)(Math.random()*7)+1];
        }
        if(temas[3].equals(tema)){
            resultado=palabrasTema4[(int)(Math.random()*7)+1];
        }
        if(temas[4].equals(tema)){
            resultado=palabrasTema5[(int)(Math.random()*7)+1];
        }
        return resultado;
    }
    
    public String ocultarPalabra(String palabra){
        String resultado="";
        for(int i=0;i<palabra.length();i++){
            if(!(" ".equals(palabra.substring(i, i+1)))){
                resultado+="_ ";
            }
            else{
                resultado+="  ";
            }
        }
        return resultado;
    }
    
    
    public void ingresarLetra(String letra, String palabra){
        String respuesta="";
        if(palabra.contains(letra)){
            if(palabra.contains("_ ")){
                for(int i=0;i<palabra.length();i++){
                    if(letra.equals(palabra.substring(i,i+1))){
                        respuesta+=letra;
                    }else{
                        respuesta+=palabra.substring(i, i+1);
                    }
                }
            }else{
                for(int i=0;i<palabra.length();i++){
                    if(letra.equals(palabra.substring(i,i+1))){
                        respuesta+=letra;
                        if("_ ".equals(palabra.substring(i,i+1))){
                            respuesta+=palabra.substring(i, i+1);
                        }
                    }else{
                    respuesta+="_ ";
                }
            }
        }
        }else{
            oportunidades-=1;
            respuesta=this.ocultarPalabra(palabra);
            this.cambiarEstadoImagen();
        }
        this.setPalabra(respuesta);
    }
    
    
    
}
