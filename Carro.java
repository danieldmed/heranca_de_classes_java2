package pilarespoo2;

public class Carro extends Veiculo {
    
    String tipoDeCombustivel;
    
    Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano);
        
        this.tipoDeCombustivel = tipoDeCombustivel;
    }       
}
