package co.edu.umanizales.interfaces.Modelo;
import co.edu.umanizales.interfaces.Modelo.Interface.NadarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.RespirarAble;
import co.edu.umanizales.interfaces.Modelo.Interface.TerrestreAble;

public class Rana implements RespirarAble, NadarAble, TerrestreAble {

    @Override
    public void respirar() {
        System.out.println("lucas está Respirando...");
    }
    public void nadar(){
        System.out.println("Lucas está Nadando...");
    }
    public void terrestre(){
        System.out.println("Lucas se esta desplazando de manera Terrestre...");
    }
}
