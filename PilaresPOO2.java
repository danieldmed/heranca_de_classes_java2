package pilarespoo2;

public class PilaresPOO2 {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Hyundai", "HB20", 2007, "Gasolina");
        
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("Tipo de combustível: " + carro1.tipoDeCombustivel);
        
        CarroEletrico carroEletrico1 = new CarroEletrico("Tesla", "Model X Plaid", 2021, "Energia Elétrica", "95kWh");
        
        System.out.println("Nome: " + carroEletrico1.marca);
        System.out.println("Modelo: " + carroEletrico1.modelo);
        System.out.println("Ano: " + carroEletrico1.ano);
        System.out.println("Tipo de combustível: " + carroEletrico1.tipoDeCombustivel);
        System.out.println("Capacidade da bateria: " + carroEletrico1.capacidadeBateria);
    }
    
}
