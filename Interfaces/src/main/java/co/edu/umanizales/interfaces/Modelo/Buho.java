package co.edu.umanizales.interfaces.Modelo;

import co.edu.umanizales.interfaces.Modelo.Interface.RespirarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.VolarAble;

public class Buho implements RespirarAble, VolarAble {
    @Override
    public void respirar() {
        System.out.println("milton respira");
    }
    public void volar() {
        System.out.println("milton vuela");
    }
}
