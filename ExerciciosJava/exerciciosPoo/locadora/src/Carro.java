public class Carro extends Veiculo{
    //Atributo
    private double adicional;

    public Carro(String modelo, double precoPordia){
        super(modelo, precoPordia);
        this.adicional = 50.0;

    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    //MÃ©todo calcular aluguel de carro com o adicional de 50 reais
    //Polimorfismo de sobreescrita
    @Override
    public double calcularAluguel(int dias){
        return (this.getPrecoPorDia() * dias) + adicional;

    }


    //Método de sobrecarga calcular valor do seguro
    public double calcularAluguel(int dias, boolean seguro){
        if (seguro == true) {
            return (this.getPrecoPorDia() * dias) + adicional + 30.0;
        }else{
            return (this.getPrecoPorDia() * dias) + adicional;
        }
    }


}
