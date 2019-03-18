/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciounitarias;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Steven
 */
public class Generacion {
    Map<Integer,Persona> generacionMap = new HashMap();
    String resul;
    
    /**
     * este metodo recorrer el arbol agregando el resultado a un string
     * @param genMap mapa recibido de la clase test
     * @param cedu cedula de la persona a buscar
     * @return retorna un string con el resultado de la busqueda
     */
    public String recorrer(Map genMap,Integer cedu){
            boolean busquedaH;
            boolean busquedaP;
            boolean busquedaA;
            busquedaH= false;
            busquedaP= false;
            busquedaA= false;
            resul="";
            generacionMap=genMap;
                    for (Integer k : generacionMap.keySet()){
                         Persona tempAbue = generacionMap.get(k);
                         if(tempAbue.getIdentificacionA()==cedu){
                              busquedaA=true;
                         }
                         if(busquedaA==true){
                         //System.out.println(tempAbue.getIdentificacionA()+" "+tempAbue.getNombre()+" "+tempAbue.getApellido());
                         resul=resul+" "+tempAbue.getNombre();
                         }
                          //System.out.println(tempAbue.getNombre());
                         for(Integer k2 : tempAbue.getPersonaMap().keySet()){
                         Persona tempPadre = tempAbue.getPersonaMap().get(k2);
                            if(tempPadre.getIdentificacionA()==cedu){
                               busquedaP=true;
                            }
                            
                            if(busquedaA==true){
                           // System.out.println(tempPadre.getIdentificacionA()+" "+tempPadre.getNombre()+" "+tempPadre.getApellido());
                            resul=resul+" "+tempPadre.getNombre();
                            }
                            if(busquedaP==true){
                            //System.out.println(tempAbue.getIdentificacionA()+" "+tempAbue.getNombre()+" "+tempAbue.getApellido());    
                            //System.out.println(tempPadre.getIdentificacionA()+" "+tempPadre.getNombre()+" "+tempPadre.getApellido());
                            resul=resul+" "+tempAbue.getNombre()+" "+tempPadre.getNombre();
                            }
                         
                            
                            for (Integer k3 : tempPadre.getPersonaMap().keySet()){
                            Persona tempHijo = tempPadre.getPersonaMap().get(k3);
                            if(tempHijo.getIdentificacionA()==cedu){
                               busquedaH=true;
                            }
                            if(busquedaA==true || busquedaP==true){
                            
                            //System.out.println(tempHijo.getIdentificacionA()+" "+tempHijo.getNombre()+" "+tempHijo.getApellido());
                            resul=resul+" "+tempHijo.getNombre();
                            }
                            if(busquedaH==true){
                            //System.out.println(tempAbue.getIdentificacionA()+" "+tempAbue.getNombre()+" "+tempAbue.getApellido());
                            //System.out.println(tempPadre.getIdentificacionA()+" "+tempPadre.getNombre()+" "+tempPadre.getApellido());
                            //System.out.println(tempHijo.getIdentificacionA()+" "+tempHijo.getNombre()+" "+tempHijo.getApellido());
                            resul=resul+" "+tempAbue.getNombre()+" "+tempPadre.getNombre()+" "+tempHijo.getNombre();
                            break;
                            }
                            
                            
                         }//for hijo
                    if(busquedaP==true){
                          break;
                     } 
                    if(busquedaH==true){
                          break;  
                   }
                    
                    }//for padre
                   
                   if(busquedaA==true){
                          break;  
                   }
                   if(busquedaP==true){
                          break;  
                   }
                    if(busquedaH==true){
                          break;  
                   }
                   
                }//for abuelo
   
    return resul;
    }
}

