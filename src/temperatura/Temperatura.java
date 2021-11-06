/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import javax.swing.JOptionPane;
/**
 *
 * @author familia
 */
public class Temperatura {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String inputValue=null;
        int opcion=0;
        
      
      
        do{
            
        opcion=opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Selecciona una opción: \n "
                + "1.-Convertir farenheit a celsius. \n"
                + "2.-Convertir pesos a Dolares. \n"
                + "3.-Convertir pulgadas a centímetros. \n"
                + "4.- Salir \n",JOptionPane.QUESTION_MESSAGE));
        
        switch(opcion){
            case 1: 
                do{
                inputValue = JOptionPane.showInputDialog("Introduce los grados en Farenheit: " );
                }while( inputValue == null || inputValue.equals("")  );
                float valor =Float.parseFloat(inputValue);
                
                
                 valor = (valor - 32)*5/9;
     
                JOptionPane.showMessageDialog(null, "Los grados en celcius son: " +valor);
                break;
            case 2:
                do{
                inputValue = JOptionPane.showInputDialog("Introduce el dinero en pesos: " );
                }while( inputValue == null || inputValue.equals("")  );
                float dolares =Float.parseFloat(inputValue);
               
                
                 dolares = (dolares)*493/10000;
     
                JOptionPane.showMessageDialog(null, "El dinero en dolares es: " +dolares);
                break;
            case 3:
               do{
                inputValue = JOptionPane.showInputDialog("Introduce las pulgadas; " );
                }while( inputValue == null || inputValue.equals("")  );
                float tamaño =Float.parseFloat(inputValue);
                
                
                 tamaño = (tamaño) * 127/50;
     
                JOptionPane.showMessageDialog(null, "Los centimetros son: " +tamaño);
                break;
       
            case 4:
                JOptionPane.showMessageDialog (null, "Que tenga buen dia, hasta luego (: ");
                System.exit(0);
                break;
            default:JOptionPane.showMessageDialog(null, "Elija una opcion valida");
        }}while(opcion!=4);
        
    }

    
}
