package Clinica.model;

public abstract class Profissional {
    private String nome;
    private String crm;
    private Especialidade especialidade;

    public Profissional(String nome, String crm, Especialidade especialidade) {
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
}
