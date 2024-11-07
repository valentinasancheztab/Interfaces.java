package co.edu.umanizales.interfaces.Modelo;


import co.edu.umanizales.interfaces.Modelo.Interface.NadarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.RespirarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.TerrestreAble;

public class Nutria  implements RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void respirar() {
        System.out.println("Pepe está Respirando");
    }
    public void nadar() {
        System.out.println("Pepe está Nadando");
    }
    public void terrestre() {
        System.out.println("Pepe está caminando");
    }
}
