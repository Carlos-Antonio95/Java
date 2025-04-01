public class Veiculo {
    //Atributs da classe Veiculo
    private  String modelo;
    private double precoPorDia;


    //Contrutor
    public Veiculo(String modelo, double precoPorDia){
        this.modelo = modelo;
        this.precoPorDia = precoPorDia;
    }


    //Métodos acessores getters e setters 
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public double getPrecoPorDia(){
        return precoPorDia;
    }

    public void setPrecoModelo(double precoPorDia){
        this.precoPorDia = precoPorDia;
    }

    //MÃ©todo de calcular alugel do carro, multiplica os dias alugados pelo o preçoo da diaria(preçoo POr dia)
    public double calcularAluguel(int dias){
        return this.precoPorDia * dias;

    }

}