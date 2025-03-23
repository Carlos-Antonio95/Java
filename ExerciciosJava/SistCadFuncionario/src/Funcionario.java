public class Funcionario {

    //Atributos
    private String nome;
    private String cargo;
    protected double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }else{
            throw new IllegalArgumentException("O salário deve ser positivo");
        }
       
    }

    public String exibirDados() {
        return String.format("Dados:\nNome: %s\nCargo: %s\nSalário: %.2f", nome, cargo, salario);
    }

    public void aumentarSalario(double porcentual){
        if (porcentual > 0) {
            this.setSalario(this.getSalario() + (this.getSalario() * porcentual) / 100);
        }else{
            throw new IllegalArgumentException("Percentual deve ser positivo");
        }
        

    }


    
}
