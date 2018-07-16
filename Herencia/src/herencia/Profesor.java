
package herencia;


public class Profesor extends Persona{
    String facultad;
    private String materia;

    public Profesor(String nombre, String apellido, String facultad, String materia) {
        super(nombre, apellido);
        this.facultad = facultad;
        this.materia = materia;
    }

    //Getters y Setters
    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return getNombre();
    }

    public void setNombre(String nombre) {
        this.setNombre(nombre);
    }

    public String getApellido() {
        return getApellido();
    }

    public void setApellido(String apellido) {
        this.setApellido(apellido);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    


    @Override
    public String toString() {
        return materia;
    }
    
    
    
}
