package boletin4_b;
/**
 *
 * @author Jano
 */
public class Consumo {
    //ATRIBUTOS
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    //CONSTRUCTORES
    public Consumo(){
    }
    public Consumo (float kilo, float li,float velo, float gas){
        km=kilo;
        litros=li;
        vMed=velo;
        pGas=gas;
    }
    
    //SETTERS
    public void setKm(float kilo){
        km=kilo;
    }
    public void setLitros(float li){
        litros=li;
    }
    public void setvMed(float velo){
        vMed=velo;
    }
    public void setpGas(float gas){
        pGas=gas;
    }
    
    //GETTERS
    public float getvMed(){
        return vMed;
    }
    
    //MÉTODOS
    public float getTiempo(){
        return km/vMed;
    }
    public float consumoMedio(){
        return litros*(100/km);
    }
    public float consumoEuros(){
        return (consumoMedio()*pGas);
    }
    
    
}
