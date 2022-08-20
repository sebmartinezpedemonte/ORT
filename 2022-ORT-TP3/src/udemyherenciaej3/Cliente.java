package udemyherenciaej3;

public class Cliente extends Persona {
    private int clienteId;


    public Cliente(String nombre, String apellido, String direccion, int clienteId) {
        super(nombre, apellido,  direccion);
        this.clienteId = clienteId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente{" +
                "clienteId=" + clienteId +
                '}';
    }
}
