
package herencia;


public class Estudiante extends Persona{
    
    String carrera;
    
    public Estudiante(String nombre, String apellido, String carrera) {
        super(nombre, apellido);
        this.carrera = carrera;
    }
    
    
    

    @Override
    public String toString() {
        
        return getApellido()+" "+getNombre();
    }
    
    
    
}
