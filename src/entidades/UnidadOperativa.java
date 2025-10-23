/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
/**
 *
 * @author Facundo Damian Elbey
 */
public abstract class UnidadOperativa {
    private final String nombre;
    private String modulo;
    private final TipoAtmosfera tipoAtmosfera;

    protected UnidadOperativa(String nombre, String modulo, TipoAtmosfera tipoAtmosfera) {
        if (nombre == null || nombre.trim().isEmpty())throw new IllegalArgumentException("Nombre invalido");
        if (modulo == null || modulo.isBlank()) throw new IllegalArgumentException("Modulo invalido");
        if (tipoAtmosfera == null) throw new IllegalArgumentException("Tipo de atmosfera obligatorio");
        this.nombre = nombre;
        this.modulo = modulo;
        this.tipoAtmosfera = tipoAtmosfera;
    }

    public String getNombre() { return nombre; }
    public String getModulo() { return modulo; }
    protected void setModulo(String modulo) { this.modulo = modulo; }
    public TipoAtmosfera getTipoAtmosfera() { return tipoAtmosfera; }

    protected abstract String reabastecer();
    protected abstract String mantenerAtm();
    protected abstract String replicarse();

    public String realizarFuncionesBase() {
        StringBuilder sb = new StringBuilder();
        sb.append(reabastecer()).append(" | ")
          .append(mantenerAtm()).append(" | ")
          .append(replicarse());
        return sb.toString();
    }

    @Override
    public String toString() {
        return "%s [nombre='%s', modulo='%s', atmosfera=%s]"
                .formatted(getClass().getSimpleName(), nombre, modulo, tipoAtmosfera);
    }
}

