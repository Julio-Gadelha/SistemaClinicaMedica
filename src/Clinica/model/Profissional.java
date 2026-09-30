package Clinica.model;

public abstract class Profissional {
    private  final String nome;
    private String crm;
    protected Especialidade especialidade;
    private static int profissionaisCadastrados = 0;

    public Profissional(String nome, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        profissionaisCadastrados ++;
    }
  public  abstract double calcularValorConsulta();

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public static int getProfissionaisCadastrados() {
        return profissionaisCadastrados;
    }

    @Override
    public String toString() {
        return (" Profissional : " +getNome()  + "  | CRM "  + getCrm()   + " |  Especialidade : " + getEspecialidade());
    }
}
