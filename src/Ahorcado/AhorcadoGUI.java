/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.UIManager.LookAndFeelInfo;
import java.lang.*;
import java.io.FileNotFoundException;


public class AhorcadoGUI extends JFrame{
    
    Container contenedor;
    JLabel lbTema,lbTeclado,lbIngresarLetra,lbImagen,lbOportunidades;
    JButton btA,btB,btC,btD,btE,btF,btG,btH,btI,btJ,btK,btL,btM,btN,btO,btP,btQ,btR,btS,btT,btU,btV,btW,btX,btY,btZ,btReiniciar,btIngresarLetra;
    JTextField tfIngresarLetra;
    JPanel panelTeclado,panelTemaPalabra,panelImagenOportunidad;
    ManejadorDeEventos manejador;
    JTextArea area,areaPalabra;
    
    Ahorcado miJuego=new Ahorcado();
    String tema=miJuego.temaAzar();
    String palabraOculta;
    String palabraAux;
    
    public AhorcadoGUI(){
        miJuego.setPalabra(miJuego.palabraAzar(tema));
        palabraOculta=miJuego.ocultarPalabra(miJuego.getPalabra());
        palabraAux=miJuego.getPalabra();
        
        area=new JTextArea(5,10);
        areaPalabra=new JTextArea(0,10);
        areaPalabra.setText(palabraOculta);
        areaPalabra.setEditable(false);
        lbTema=new JLabel("Tema: " + tema);
        
        lbTeclado=new JLabel("Teclado");
        lbIngresarLetra=new JLabel("Ingrese una letra");
        lbImagen=new JLabel(miJuego.getImagenAhorcado());
        lbOportunidades=new JLabel("Te quedan "+ Integer.toString(miJuego.getOportunidades()) + " oportunidades");
        
        btA=new JButton("A");btA.setBackground(Color.cyan);btB=new JButton("B");btB.setBackground(Color.cyan);
        btC=new JButton("C");btC.setBackground(Color.cyan);btD=new JButton("D");btD.setBackground(Color.cyan);
        btE=new JButton("E");btE.setBackground(Color.cyan);btF=new JButton("F");btF.setBackground(Color.cyan);
        btG=new JButton("G");btG.setBackground(Color.cyan);btH=new JButton("H");btH.setBackground(Color.cyan);
        btI=new JButton("I");btI.setBackground(Color.cyan);btJ=new JButton("J");btJ.setBackground(Color.cyan);
        btK=new JButton("K");btK.setBackground(Color.cyan);btL=new JButton("L");btL.setBackground(Color.cyan);
        btM=new JButton("M");btM.setBackground(Color.cyan);btN=new JButton("N");btN.setBackground(Color.cyan);
        btO=new JButton("O");btO.setBackground(Color.cyan);btP=new JButton("P");btP.setBackground(Color.cyan);
        btQ=new JButton("Q");btQ.setBackground(Color.cyan);btR=new JButton("R");btR.setBackground(Color.cyan);
        btS=new JButton("S");btS.setBackground(Color.cyan);btT=new JButton("T");btT.setBackground(Color.cyan);
        btU=new JButton("U");btU.setBackground(Color.cyan);btV=new JButton("V");btV.setBackground(Color.cyan);
        btW=new JButton("W");btW.setBackground(Color.cyan);btX=new JButton("X");btX.setBackground(Color.cyan);
        btY=new JButton("Y");btY.setBackground(Color.cyan);btZ=new JButton("Z");btZ.setBackground(Color.cyan);
        btIngresarLetra=new JButton("Ingresar");btReiniciar=new JButton("Reiniciar");
        
        tfIngresarLetra=new JTextField("");
        
        manejador = new ManejadorDeEventos();
        
        btA.addActionListener(manejador);btG.addActionListener(manejador);btM.addActionListener(manejador);btR.addActionListener(manejador);btW.addActionListener(manejador);
        btB.addActionListener(manejador);btH.addActionListener(manejador);btN.addActionListener(manejador);btS.addActionListener(manejador);btX.addActionListener(manejador);
        btC.addActionListener(manejador);btI.addActionListener(manejador);btO.addActionListener(manejador);btT.addActionListener(manejador);btY.addActionListener(manejador);
        btD.addActionListener(manejador);btJ.addActionListener(manejador);btP.addActionListener(manejador);btU.addActionListener(manejador);btZ.addActionListener(manejador);
        btE.addActionListener(manejador);btK.addActionListener(manejador);btQ.addActionListener(manejador);btV.addActionListener(manejador);btF.addActionListener(manejador);
        btL.addActionListener(manejador);btIngresarLetra.addActionListener(manejador);
        btReiniciar.addActionListener(manejador);
        
        btA.addMouseListener(manejador);btG.addMouseListener(manejador);btM.addMouseListener(manejador);btR.addMouseListener(manejador);btW.addMouseListener(manejador);
        btB.addMouseListener(manejador);btH.addMouseListener(manejador);btN.addMouseListener(manejador);btS.addMouseListener(manejador);btX.addMouseListener(manejador);
        btC.addMouseListener(manejador);btI.addMouseListener(manejador);btO.addMouseListener(manejador);btT.addMouseListener(manejador);btY.addMouseListener(manejador);
        btD.addMouseListener(manejador);btJ.addMouseListener(manejador);btP.addMouseListener(manejador);btU.addMouseListener(manejador);btZ.addMouseListener(manejador);
        btE.addMouseListener(manejador);btK.addMouseListener(manejador);btQ.addMouseListener(manejador);btV.addMouseListener(manejador);btF.addMouseListener(manejador);
        btL.addMouseListener(manejador);
        
        tfIngresarLetra.addKeyListener(manejador);
        
        panelTeclado=new JPanel();
        panelTeclado.setLayout(new GridLayout(4,7));
        
        panelTemaPalabra=new JPanel();
        panelTemaPalabra.setLayout(new GridLayout(4,1));
        
        panelTeclado.add(btA);panelTeclado.add(btB);panelTeclado.add(btC);panelTeclado.add(btD);panelTeclado.add(btE);
        panelTeclado.add(btF);panelTeclado.add(btG);panelTeclado.add(btH);panelTeclado.add(btI);panelTeclado.add(btJ);
        panelTeclado.add(btK);panelTeclado.add(btL);panelTeclado.add(btM);panelTeclado.add(btN);panelTeclado.add(btO);
        panelTeclado.add(btP);panelTeclado.add(btQ);panelTeclado.add(btR);panelTeclado.add(btS);panelTeclado.add(btT);
        panelTeclado.add(btU);panelTeclado.add(btV);panelTeclado.add(btW);panelTeclado.add(btX);panelTeclado.add(btY);
        panelTeclado.add(btZ);
        
        panelTemaPalabra.add(lbTema);
        panelTemaPalabra.add(areaPalabra);
        panelTemaPalabra.add(lbIngresarLetra);
        panelTemaPalabra.add(tfIngresarLetra);
        panelTemaPalabra.add(btIngresarLetra);
        
        contenedor = getContentPane(); //Crea el contenedor 
        contenedor.setLayout(new FlowLayout()); //Establece el administrador para el contenedor
        
        contenedor.add(panelTemaPalabra);
        contenedor.add(lbImagen);
        contenedor.add(lbOportunidades);
        contenedor.add(panelTeclado);
        contenedor.add(area);
        
    }
    
     private class ManejadorDeEventos implements ActionListener, MouseListener, KeyListener{
         public void disabledButtons(){
            btA.setEnabled(false);btB.setEnabled(false);btC.setEnabled(false);btD.setEnabled(false);btE.setEnabled(false);btF.setEnabled(false);
            btG.setEnabled(false);btH.setEnabled(false);btI.setEnabled(false);btJ.setEnabled(false);btK.setEnabled(false);btL.setEnabled(false);
            btM.setEnabled(false);btN.setEnabled(false);btO.setEnabled(false);btP.setEnabled(false);btQ.setEnabled(false);btR.setEnabled(false);
            btS.setEnabled(false);btT.setEnabled(false);btU.setEnabled(false);btV.setEnabled(false);btW.setEnabled(false);btX.setEnabled(false);
            btY.setEnabled(false);btZ.setEnabled(false);btIngresarLetra.setEnabled(false);tfIngresarLetra.setEnabled(true);
            
         }
         
//ActionListener
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource().equals(btIngresarLetra)){
            palabraOculta=miJuego.ingresarLetra(tfIngresarLetra.getText(), palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                tfIngresarLetra.setText("");
        }
        
        if(ae.getSource().equals(btA)){
                palabraOculta=miJuego.ingresarLetra("a", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btA.setEnabled(false);
        }
        if(ae.getSource().equals(btB)){
                palabraOculta=miJuego.ingresarLetra("b", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btB.setEnabled(false);
        }
        if(ae.getSource().equals(btC)){
                palabraOculta=miJuego.ingresarLetra("c", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btC.setEnabled(false);
         }
        if(ae.getSource().equals(btD)){
                palabraOculta=miJuego.ingresarLetra("d", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btD.setEnabled(false);
         }
        if(ae.getSource().equals(btE)){
                palabraOculta=miJuego.ingresarLetra("e", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btE.setEnabled(false);
         }
        if(ae.getSource().equals(btF)){
                palabraOculta=miJuego.ingresarLetra("f", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btF.setEnabled(false);
         }
        if(ae.getSource().equals(btG)){
                palabraOculta=miJuego.ingresarLetra("g", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btG.setEnabled(false);
         }
        if(ae.getSource().equals(btH)){
                palabraOculta=miJuego.ingresarLetra("h", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btH.setEnabled(false);
         }
        if(ae.getSource().equals(btI)){
                palabraOculta=miJuego.ingresarLetra("i", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btI.setEnabled(false);
         }
        if(ae.getSource().equals(btJ)){
                palabraOculta=miJuego.ingresarLetra("j", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btJ.setEnabled(false);
         }
        if(ae.getSource().equals(btK)){
                palabraOculta=miJuego.ingresarLetra("k", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btK.setEnabled(false);
         }
        if(ae.getSource().equals(btL)){
                palabraOculta=miJuego.ingresarLetra("l", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btL.setEnabled(false);
         }
        if(ae.getSource().equals(btM)){
                palabraOculta=miJuego.ingresarLetra("m", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btM.setEnabled(false);
         }
        if(ae.getSource().equals(btN)){
                palabraOculta=miJuego.ingresarLetra("n", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btN.setEnabled(false);
         }
        if(ae.getSource().equals(btO)){
                palabraOculta=miJuego.ingresarLetra("o", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btO.setEnabled(false);
         }
        if(ae.getSource().equals(btP)){
                palabraOculta=miJuego.ingresarLetra("p", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btP.setEnabled(false);
         }
        if(ae.getSource().equals(btQ)){
                palabraOculta=miJuego.ingresarLetra("q", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btQ.setEnabled(false);
         }
        if(ae.getSource().equals(btR)){
                palabraOculta=miJuego.ingresarLetra("r", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btR.setEnabled(false);
         }
        if(ae.getSource().equals(btS)){
                palabraOculta=miJuego.ingresarLetra("s", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btS.setEnabled(false);
         }
        if(ae.getSource().equals(btT)){
                palabraOculta=miJuego.ingresarLetra("t", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btT.setEnabled(false);
         }
        if(ae.getSource().equals(btU)){
                palabraOculta=miJuego.ingresarLetra("u", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btU.setEnabled(false);
         }
        if(ae.getSource().equals(btV)){
                palabraOculta=miJuego.ingresarLetra("v", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btV.setEnabled(false);
         }
        if(ae.getSource().equals(btW)){
                palabraOculta=miJuego.ingresarLetra("w", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btW.setEnabled(false);
         }
        if(ae.getSource().equals(btX)){
                palabraOculta=miJuego.ingresarLetra("x", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btX.setEnabled(false);
         }
        if(ae.getSource().equals(btY)){
                palabraOculta=miJuego.ingresarLetra("y", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btY.setEnabled(false);
         }
        if(ae.getSource().equals(btZ)){
                palabraOculta=miJuego.ingresarLetra("z", palabraAux);
                if(!(miJuego.getPalabra().contains("-"))){
                    miJuego.setPalabra(miJuego.ocultarPalabra(miJuego.getPalabra()));
                }
                miJuego.actualizarPalabra(palabraOculta);
                areaPalabra.setText(miJuego.getPalabra());
                btZ.setEnabled(false);
         }
        lbImagen.setIcon(miJuego.getImagenAhorcado());
        
        lbOportunidades.setText("Te quedan "+Integer.toString(miJuego.getOportunidades())+ " oportunidades");
        if(miJuego.Victoria()){
            JOptionPane.showMessageDialog(null, "¡Has Ganado!");
            this.disabledButtons();
        }
        if(miJuego.getOportunidades()==0){
            JOptionPane.showMessageDialog(null, "Derrota :("+ "\n La palabra era: " + palabraAux);
            this.disabledButtons();
        }
       }
       
    //Mouse Listener

    @Override
    public void mouseExited(MouseEvent me) {
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource().equals(btA)){
        if(!miJuego.getHeGanado()){
        btA.setBackground(Color.red);
        }
        }
        if(me.getSource().equals(btB)){
        if(!miJuego.getHeGanado()){
        btB.setBackground(Color.red);
        }
        }
        if(me.getSource().equals(btC)){
            if(!miJuego.getHeGanado()){
        btC.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btD)){
            if(!miJuego.getHeGanado()){
        btD.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btE)){
            if(!miJuego.getHeGanado()){
        btE.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btF)){
            if(!miJuego.getHeGanado()){
        btF.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btG)){
            if(!miJuego.getHeGanado()){
        btG.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btH)){
            if(!miJuego.getHeGanado()){
        btH.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btI)){
            if(!miJuego.getHeGanado()){
        btI.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btJ)){
            if(!miJuego.getHeGanado()){
        btJ.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btK)){
            if(!miJuego.getHeGanado()){
        btK.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btL)){
            if(!miJuego.getHeGanado()){
        btL.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btM)){
            if(!miJuego.getHeGanado()){
        btM.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btN)){
            if(!miJuego.getHeGanado()){
        btN.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btO)){
            if(!miJuego.getHeGanado()){
        btO.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btP)){
            if(!miJuego.getHeGanado()){
        btP.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btQ)){
            if(!miJuego.getHeGanado()){
        btQ.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btR)){
            if(!miJuego.getHeGanado()){
        btR.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btS)){
            if(!miJuego.getHeGanado()){
        btS.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btT)){
            if(!miJuego.getHeGanado()){
        btT.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btU)){
            if(!miJuego.getHeGanado()){
        btU.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btV)){
            if(!miJuego.getHeGanado()){
        btV.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btW)){
            if(!miJuego.getHeGanado()){
        btW.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btX)){
            if(!miJuego.getHeGanado()){
        btX.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btY)){
            if(!miJuego.getHeGanado()){
        btY.setBackground(Color.red);
            }
        }
        if(me.getSource().equals(btZ)){
            if(!miJuego.getHeGanado()){
        btZ.setBackground(Color.red);
            }
        }
    }
    @Override
    public void mouseEntered(MouseEvent me) {
    }
    @Override
    public void mousePressed(MouseEvent me) {
    }
    @Override
    public void mouseReleased(MouseEvent me){
    }
    
//---------------------------------------------------------------------------------------------------------------    
    //KeyListener

    @Override
    public void keyTyped(KeyEvent ke) {
        area.setText("KeyType "+ke.getKeyChar());
        if(tfIngresarLetra.getText().length()==1){
            ke.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }        
}

    
    public static void main(String[] args) {
        
        AhorcadoGUI miapp=new AhorcadoGUI();
        miapp.setSize(800, 530);
        miapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miapp.setVisible(true);
        
        
    }
   
}
