package Proyecto;
/**
 *
 * @author CESAR
 */
public class Cliente extends Persona{
    String direccion;//Dirrecion de residencia del usuario
    
    int num_contacto;//Numero telefonico o de movil

    public Cliente(String direccion,String nombre,int num_contacto) {
        super(nombre);
        this.direccion = direccion;
        this.num_contacto = num_contacto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNum_contacto() {
        return num_contacto;
    }

    public void setNum_contacto(int num_contacto) {
        this.num_contacto = num_contacto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "direccion=" + direccion + ", num_contacto=" + num_contacto + '}';
    } 
    
}
