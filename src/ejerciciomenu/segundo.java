package ejerciciomenu;

import javax.swing.JOptionPane;


public class segundo {
   private int id;
    private String fecha;
    private String nombre;

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void commit(){
        JOptionPane.showMessageDialog(null, "un Commit identifica los cambios hechos en dicho ambiente de trabajo.");
    }
    
    public void push(){
        JOptionPane.showMessageDialog(null, " un git push sube los cambios al repositorio central, comúnmente llamado origin, para que otros desarrolladores puedan bajarse tus cambios");
    }
    
    public void pull(){
        JOptionPane.showMessageDialog(null, "");
    }
    
    public void clase(){
        JOptionPane.showMessageDialog(null, "");
    }
    
    public void objeto(){
        JOptionPane.showMessageDialog(null, "");
    }
}

