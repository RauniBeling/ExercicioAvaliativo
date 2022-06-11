package model;



public class Funcionario {
    private String nome;
    private double salario;
    private double idade;
    private String cargo;
    private Bonus bonus;
    private double artefato;
    private double faltas;
    private String graduacao;
    private double tempoDeEmpresa;
    private String tipoDeBonus;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorBonus() {
        return bonus.getValor();
    }

    public void setValorBonus(double valor) {
        this.bonus.setValor(valor);
    }
    
    public void setTipoBonus(String tipo){
        this.bonus.setTipo(tipo);
    }
    
    public String getTipoBonus(){
        return bonus.getTipo();
    }

    public double getArtefato() {
        return artefato;
    }

    public void setArtefato(double artefato) {
        this.artefato = artefato;
    }

    public double getFaltas() {
        return faltas;
    }

    public void setFaltas(double faltas) {
        this.faltas = faltas;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public double getTempoDeEmpresa() {
        return tempoDeEmpresa;
    }

    public void setTempoDeEmpresa(double tempoDeEmpresa) {
        this.tempoDeEmpresa = tempoDeEmpresa;
    }

    public String getTipoDeBonus() {
        return tipoDeBonus;
    }

    public void setTipoDeBonus(String tipoDeBonus) {
        this.tipoDeBonus = tipoDeBonus;
    }
    
    
    

    public Funcionario(String nome, double salario, double idade, String cargo, double artefato, double faltas, String graduacao, double tempoDeEmpresa, String tipoDeBonus) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.cargo = cargo;
        this.artefato = artefato;
        this.faltas = faltas;
        this.graduacao = graduacao;
        this.tempoDeEmpresa = tempoDeEmpresa;
        Bonus b = new Bonus();
        this.bonus = b;
        this.tipoDeBonus = tipoDeBonus;
        if(tipoDeBonus.equals("Generoso")){
            b.setValor(b.getValor()+200);
        }
        else if(tipoDeBonus.equals("Padrão")){
            b.setValor(b.getValor());
        }
    }

    
    
    
    
    
    
}
