package tpFinal.Services;

import tpFinal.Models.Empleado.PersonalLimpieza;

public interface IPersonalLimpiezaService {
    void listar();
    void agregar(PersonalLimpieza objeto);
    void modificar(PersonalLimpieza objeto);
    void eliminar(String dni);
}