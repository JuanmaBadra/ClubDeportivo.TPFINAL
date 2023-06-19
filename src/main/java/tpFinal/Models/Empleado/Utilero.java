package tpFinal.Models.Empleado;

import tpFinal.Models.Usuario;

public class Utilero extends Usuario {

    private boolean estadoContable;
    private String deporte;

    public Utilero(){}

    public Utilero(String nombre, String apellido, String dni, String contrasenia, String telefono, String direccion, boolean estadoContable, String deporte) {
        super(nombre, apellido, dni, contrasenia, telefono, direccion);
        this.estadoContable = estadoContable;
        this.deporte = deporte;
    }

    public boolean isEstadoContable() {
        return estadoContable;
    }

    public void setEstadoContable(boolean estadoContable) {
        this.estadoContable = estadoContable;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }


    @Override
    public String toString() {
        return  super.toString() +
                "Estado contable: " + estadoContable + "\n" +
                "        Deporte: " + deporte + "\n" +
                "------------------------------------";
    }
}
