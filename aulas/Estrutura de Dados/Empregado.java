package aulas.encapsulamento;

public class Empregado {
    
    private int EDV;    //não tem como acessar nem alterar no privado
    private String nome;
    private int idade;
    private String cargo;
    private float salario;
    
    public int getEDV(){    //get
        return this.EDV;
    }
    public void setEDV(int idBosch){    //set
        this.EDV = idBosch;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nomeColaborador){
        this.nome = nomeColaborador;
    }
    
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idadeColaborador){
        this.idade = idadeColaborador;
    }
    
    public String getCargo(){
        return this.cargo;
    }
    public void setCargo(String cargoColaborador){
        this.cargo = cargoColaborador;
    }
    
    public float getSalario(){
        return this.salario;
    }
    public void setSalario(float salarioColaborador){
        this.salario = salarioColaborador;
    }
    
    
}
