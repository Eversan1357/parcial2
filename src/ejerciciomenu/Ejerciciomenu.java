package ejerciciomenu;


import javax.swing.JOptionPane;

public class Ejerciciomenu {

    public static void main(String[] args) {
       
        int op=0;
        int opcion=0;
        segundo obj = new segundo ();
                
           
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
                    obj.commit();
                   break; 
                case 2:
                    obj.push ();
                    break;
                case 3:
                    obj.pull();
                    break;
                case 4:
                    obj.clase();
                    break;
                case 5:
                    obj.objeto();
                    break;  
                case 6:
                    JOptionPane.showMessageDialog(null, "EVER SANTIAGO BASTO");
                    break;    
                case 7:
                    JOptionPane.showMessageDialog(null, "10 DE OCTUBRE DE 2019");
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Ingresó una opción no valida");
                   break;
            }
            }while(opcion != 8);
    }
    
}


