import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    public List<String> departamento = new ArrayList<>();

    public Gerente(String nome,String cargo, double salario, String departamento){
        super(nome, cargo, salario);
        this.departamento.add(departamento);
    }

    public String getDepartamento() {
        return String.join(", ", departamento);
    }

    public void setDepartamento(String departamento) {
        if (!this.departamento.contains(departamento)) {
            this.departamento.add(departamento);
        }else{
            throw new IllegalArgumentException ("Departamento "+departamento+" ja existente");
        }
    }

    public void removerDepartamento(String departamento){
        if (this.departamento.contains(departamento)) {
            this.departamento.remove(departamento);
        }else{
            throw new IllegalArgumentException("Departamento nao foi encontrado");
        }
    }


    //Um gerente geencia varios departamentos
    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        dados += "\nDepartamentos: "+getDepartamento();
        return dados;
    }

    
    public void aumentoPorDepartamento(){
        this.salario += (salario * departamento.size()) / 100;
    }
}