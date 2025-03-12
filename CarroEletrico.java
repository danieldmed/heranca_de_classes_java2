package pilarespoo2;

public class CarroEletrico extends Carro{
    
    String capacidadeBateria;
    
    CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, String capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel);
        
        this.capacidadeBateria = capacidadeBateria;
    }
}
