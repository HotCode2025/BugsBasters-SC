import java.util.Date;

public class Cliente extends Persona {

    // Atributos específicos de Cliente
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;

    // Constructor
    public Cliente(String nombre, char genero, int edad, String direccion,
                   int idCliente, Date fechaRegistro, boolean vip) {
        super(nombre, genero, edad, direccion); // Llama al constructor de Persona
        this.idCliente = idCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    // Métodos getters y setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    // Método toString para mostrar la información del cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + getNombre() + '\'' +
                ", genero=" + getGenero() +
                ", edad=" + getEdad() +
                ", direccion='" + getDireccion() + '\'' +
                ", idCliente=" + idCliente +
                ", fechaRegistro=" + fechaRegistro +
                ", vip=" + vip +
                '}';
    }
}

