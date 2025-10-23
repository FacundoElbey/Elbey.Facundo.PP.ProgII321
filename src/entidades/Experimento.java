/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Facundo Damian Elbey
 */
public class Experimento extends UnidadOperativa {
    private final int duracionDias;

    public Experimento(String nombre, String modulo, TipoAtmosfera tipoAtmosfera, int duracionDias) {
        super(nombre, modulo, tipoAtmosfera);
        if (duracionDias <= 0) throw new IllegalArgumentException("Duracion debe ser mayor a 0");
        this.duracionDias = duracionDias;
    }

    public int getDuracionDias() { return duracionDias; }

    @Override
    protected String reabastecer() { return getNombre() + " repone reactivos/insumos"; }
    @Override
    protected String mantenerAtm() { return getNombre() + " estabiliza condiciones del entorno"; }
    @Override
    protected String replicarse() { return getNombre() + " crea replica de protocolo experimental"; }

    @Override
    public String toString() {
        return super.toString() + " | duracionDias=" + duracionDias;
    }
}

