/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Facundo Damian Elbey
 */
public class BaseEspacial {
    private final List<UnidadOperativa> unidades = new ArrayList<>();

    public void agregarUnidadOperativa(UnidadOperativa e) {
        for (UnidadOperativa u : unidades) {
            if (u.getNombre().equalsIgnoreCase(e.getNombre())
                && u.getModulo().equalsIgnoreCase(e.getModulo())) {
                throw new EntidadDuplicadaException(
                    "Ya existe una unidad con nombre '" + e.getNombre() +
                    "' en el modulo '" + e.getModulo() + "'."
                );
            }
        }
        unidades.add(e);
    }

    public void mostrarUnidades() {
        if (unidades.isEmpty()) {
            System.out.println("No hay unidades registradas.");
            return;
        }
        unidades.forEach(u -> System.out.println(u));
    }

    public void moverUnidades() {
        final String DESTINO = "TRANSITO";
        for (UnidadOperativa u : unidades) {
            if (u instanceof IMovible m) {
                String anterior = u.getModulo();
                m.moverA(DESTINO);
                System.out.println(u.getNombre() + " movido de '" + anterior + "' a '" + DESTINO + "'");
            } else {
                System.out.println(u.getNombre() + " NO puede moverse (experimento fijo).");
            }
        }
    }

    public void realizarFuncionesBase() {
        for (UnidadOperativa u : unidades) {
            String tareas = u.realizarFuncionesBase();
            System.out.println(u.getNombre() + " -> " + tareas);
        }
    }

    public void filtrarPorTipoAtmosfera(TipoAtmosfera tipo) {
        boolean alguno = false;
        for (UnidadOperativa u : unidades) {
            if (u.getTipoAtmosfera() == tipo) {
                System.out.println(u);
                alguno = true;
            }
        }
        if (!alguno) {
            System.out.println("No hay unidades para la atmosfera: " + tipo);
        }
    }
}

