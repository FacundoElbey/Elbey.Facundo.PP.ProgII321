/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 *
 * @author Facundo Damian Elbey
 */
public class Robot extends UnidadOperativa implements IMovible {
    private final int autonomiaHoras;

    public Robot(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int autonomiaHoras) {
        super(nombre, modulo, tipoAtmosfera);
        if (autonomiaHoras <= 0) throw new IllegalArgumentException("Autonomía debe ser mayor a 0");
        this.autonomiaHoras = autonomiaHoras;
    }

    public int getAutonomiaHoras() { return autonomiaHoras; }

    @Override
    public void moverA(String nuevoModulo) {
        setModulo(nuevoModulo);
    }

    @Override
    protected String reabastecer() { return getNombre() + " recarga baterias"; }
    @Override
    protected String mantenerAtm() { return getNombre() + " sella compuertas y regula valvulas"; }
    @Override
    protected String replicarse() { return getNombre() + " duplica firmware (clonacion de protocolo)"; }

    @Override
    public String toString() {
        return super.toString() + " | autonomiaHoras=" + autonomiaHoras;
    }
}

