/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elbey.facundo.pp.progii321;
import entidades.*;
/**
 *
 * @author Facundo Damian Elbey
 */
public class ElbeyFacundoPPProgII321 {
    public static void main(String[] args) {
        BaseEspacial base = new BaseEspacial();

        base.agregarUnidadOperativa(new Astronauta("Cmdr. Vega", "M1", TipoAtmosfera.PRESURIZADA, 8));
        base.agregarUnidadOperativa(new Robot("R2-Log", "M2", TipoAtmosfera.VACIO, 12));
        base.agregarUnidadOperativa(new Experimento("BioLab-7", "M1", TipoAtmosfera.PRESURIZADA, 21));

        try {
            base.agregarUnidadOperativa(new Astronauta("Cmdr. Vega", "M1", TipoAtmosfera.PRESURIZADA, 6));
        } catch (EntidadDuplicadaException ex) {
            System.out.println("[ERROR] " + ex.getMessage());
        }

        System.out.println("\n-- MOSTRAR UNIDADES --");
        base.mostrarUnidades();

        System.out.println("\n-- MOVER UNIDADES --");
        base.moverUnidades();

        System.out.println("\n-- FUNCIONES BASE --");
        base.realizarFuncionesBase();

        System.out.println("\n-- FILTRAR: PRESURIZADA --");
        base.filtrarPorTipoAtmosfera(TipoAtmosfera.PRESURIZADA);

        System.out.println("\n-- FILTRAR: VACIO --");
        base.filtrarPorTipoAtmosfera(TipoAtmosfera.VACIO);
    }
    
}
