public class ObjPersonas {

    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;

    public ObjPersonas(){
        
    }

    public ObjPersonas(String nombre, String apellido, String direccion, int telefono) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getApellido() {

        return apellido;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public String getDireccion() {

        return direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public int getTelefono() {

        return telefono;

    }

    public void setTelefono(int telefono) {

        this.telefono = telefono;

    }

}
