package ejerciciomenu;


import javax.swing.JOptionPane;

public class Ejerciciomenu {

    public static void main(String[] args) {
       
        int op=0;
        int opcion=0;
        double numero1=0;
        double numero2=0;
        double division,suma, resta, resultadoSuma,resultadoResta;
        
          suma= numero1 + numero2;
          resta= numero1 - numero2;
          resultadoSuma= suma;
          resultadoResta= resta;
          

    
        do{
          try{  
            
   opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1. QUE ES UN COMMIT?"
                    + "\n 2. QUE ES UN PUSH?"
                    + "\n 3. QUE ES UN PULL?"
                    + "\n 4. QUE ES UNA CLASE"
                    + "\n 5. QUE ES UN OBJETO"
                    + "\n 6. NOMBRE DEL ESTUDIANTE"
                    + "\n 7. FECHA"
                    + "\n 8. SALIR"));
       
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Debe ingresar solo  valores numericos");
          }
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, " Hacer un commit se refiere,\n en el contexto de la ciencia de la computación y la gestión de datos,\n a la idea de confirmar un conjunto de cambios provisionales de forma permanente. \n Un uso popular es al final de una transacción de base de datos.");
                   break;
                   
                case 2:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 3:
                    
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "");
                    break;  
                case 6:
                    JOptionPane.showMessageDialog(null, "INGRESE SU NOMBRE");
                    break;    
                case 7:
                    JOptionPane.showMessageDialog(null, "");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                   break;
            }
            }while(opcion != 8);
    }
    
}


