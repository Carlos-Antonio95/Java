public class Moto extends Veiculo {

    private double desconto;

    
    public Moto(String modelo, double precoPorDia) {
        super(modelo, precoPorDia);
        this.desconto = 0.10;//desconto de 10% fixo
    
    }
    public double getDesconto() {
        return desconto;
    }



    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }





        @Override
        public double calcularAluguel(int dias) {
            if (dias > 5) {
            double total = super.calcularAluguel(dias)  * desconto;
            return super.calcularAluguel(dias) * desconto  - total;
            }
            return super.calcularAluguel(dias);
        }
    
   

}
