/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 *
 * @author Facundo Damian Elbey
 */
public class Astronauta extends UnidadOperativa implements IMovible {
    private final int maxHorasEVA;

    public Astronauta(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int maxHorasEVA) {
        super(nombre, modulo, tipoAtmosfera);
        if (maxHorasEVA <= 0) throw new IllegalArgumentException("Horas EVA debe ser mayor a 0");
        this.maxHorasEVA = maxHorasEVA;
    }

    public int getMaxHorasEVA() { return maxHorasEVA; }

    @Override
    public void moverA(String nuevoModulo) {
        setModulo(nuevoModulo);
    }

    @Override
    protected String reabastecer() { return getNombre() + " repone suministros personales"; }
    @Override
    protected String mantenerAtm() { return getNombre() + " verifica presion y mezcla de gases"; }
    @Override
    protected String replicarse() { return getNombre() + " entrena a un cadete (replicacion formativa)"; }

    @Override
    public String toString() {
        return super.toString() + " | maxHorasEVA=" + maxHorasEVA;
    }
}

