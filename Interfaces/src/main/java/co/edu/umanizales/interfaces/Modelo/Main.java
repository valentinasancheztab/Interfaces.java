package co.edu.umanizales.interfaces.Modelo;

import co.edu.umanizales.interfaces.Modelo.Interface.NadarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.RespirarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.TerrestreAble;
import co.edu.umanizales.interfaces.Modelo.Interface.VolarAble;

public class Main {
    public static void main(String[] args) {
        Nutria pepe = new Nutria();
        Rana lucas = new Rana();
        Buho milton = new Buho();
        volar(milton);
        respirar(milton);
        nadar(lucas);
        respirar(lucas);
        terrestre(lucas);
        nadar(pepe);
        respirar(pepe);
        terrestre(pepe);
    }

    public static void volar(VolarAble volar) {
        volar.volar();
    }
    public static void respirar(RespirarAble respirar) {
        respirar.respirar();
    }
    public static void nadar(NadarAble nadar) {
        nadar.nadar();
    }
    public  static void terrestre(TerrestreAble terrestre) {
        terrestre.terrestre();
    }
    NadarAble lucas = new Rana();
    RespirarAble lucasRespirar = new Rana();
    TerrestreAble lucasTerrestre= new Rana();
    NadarAble pepe = new Nutria();
    RespirarAble pepeRespirar=new Nutria();
    TerrestreAble pepeTerrestre=new Nutria();
    VolarAble milton = new Buho();
    RespirarAble miltonRespirar=new Buho();


}



