/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import javax.swing.*;
public class Ahorcado {
    String temas[]={"Animales","Planetas","Paises","Electrodomesticos","Utiles escolares"};
    String palabrasTema1[]={"serpiente","gorila","aguila","perro","oso","vaca","elefante","cocodrilo"}, 
           palabrasTema2[]={"mercurio","venus","tierra","marte","saturno","jupiter","neptuno","urano"},
           palabrasTema3[]={"japon","brasil","rusia","colombia","canada","alemania","italia","peru"},
           palabrasTema4[]={"lavadora","televisor","microondas"," radio","plancha","tostadora","licuadora","nevera"},
           palabrasTema5[]={"colores","tijeras","lapicero","cuaderno","cartuchera","lapiz","Compas","carpeta"};
    int oportunidades=7;
    String palabra="";
    boolean heGanado=false;
    ImageIcon imgAhorcado=new ImageIcon(getClass().getResource("Ahorcado0.jpg"));
    
    public Ahorcado(){
    }
    public void setPalabra(String palabra){
        this.palabra=palabra;
    }
    public String getPalabra(){
        return palabra;
    }
    
    public boolean getHeGanado(){
        return this.heGanado;
    }
    
    public void setHeganado(boolean heGanado){
    this.heGanado=heGanado;
    }
    
    public boolean Victoria(){
        boolean respuesta=false;
        if(!(this.palabra.contains("-"))&& this.oportunidades>0){
            this.heGanado=true;
            respuesta=true;
        }
        return respuesta;
    }
    public int getOportunidades(){
        return oportunidades;
    }
  
    
    public ImageIcon getImagenAhorcado(){
        return imgAhorcado;
    }
    
    public void cambiarEstadoImagen(){
        ImageIcon respuesta=new ImageIcon();
        if(oportunidades==0){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado7.jpg"));
        }
        if(oportunidades==1){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado6.jpg"));
        }
        if(oportunidades==2){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado5.jpg"));
        }
        if(oportunidades==3){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado4.jpg"));
        }
        if(oportunidades==4){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado3.jpg"));
        }
        if(oportunidades==5){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado2.jpg"));
        }
        if(oportunidades==6){
                respuesta=new ImageIcon(getClass().getResource("Ahorcado1.jpg"));
        }
         this.imgAhorcado=respuesta;   
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
                resultado+="-";
            }
        return resultado;
    }
    
    
    public String ingresarLetra(String letra, String palabra){
        String respuesta="";
        if(palabra.contains(letra)){
            if(this.palabra.contains("-")){
                for(int i=0;i<this.palabra.length();i++){
                    if((letra.toLowerCase().equals(palabra.toLowerCase().substring(i,i+1)))){
                        respuesta+=palabra.subSequence(i, i+1);
                    }else{
                        respuesta+="-";
                    }
                }
            }else{
                for(int i=0;i<this.palabra.length();i++){
                    if((letra.toLowerCase().equals(palabra.toLowerCase().substring(i,i+1)))){
                        respuesta+=palabra.subSequence(i, i+1);
                    }else{
                    respuesta+="-";
                }
            }
                this.palabra=respuesta;
        }
        }else{
            respuesta=this.ocultarPalabra(this.palabra);
            this.oportunidades-=1;
            this.cambiarEstadoImagen();
        }
        return respuesta;
    }
    
    public void actualizarPalabra(String ocultarRespuesta){
        String respuesta="";
        if(ocultarRespuesta.length()==this.palabra.length()){
        for(int i=0;i<this.palabra.length();i++){
            if(!(this.palabra.toLowerCase().substring(i,i+1).equals(ocultarRespuesta.toLowerCase().substring(i,i+1)))&&"-".equals(this.palabra.substring(i, i+1))){
                respuesta+=ocultarRespuesta.substring(i,i+1);
            }
            if(!(this.palabra.toLowerCase().substring(i,i+1).equals(ocultarRespuesta.toLowerCase().substring(i,i+1)))&&"-".equals(ocultarRespuesta.substring(i, i+1))){
                respuesta+=this.palabra.substring(i,i+1);
            }
            if(this.palabra.toLowerCase().substring(i,i+1).equals(ocultarRespuesta.toLowerCase().substring(i,i+1))){
                respuesta+=ocultarRespuesta.substring(i, i+1);
            }
        }
        this.setPalabra(respuesta);
        
        }else{
            JOptionPane.showMessageDialog(null, "El mayor es: " + " " + this.cualMayor(this.palabra, ocultarRespuesta));
        }
    }
    
    public String cualMayor(String a, String b){
        String respuesta="";
        if(a.length()<b.length()){
            respuesta="OcultarRespuesta";
        }
        if (a.length()>b.length()){
            respuesta="This.palabra";
        }
        return respuesta;
    }
    
    
    
}
