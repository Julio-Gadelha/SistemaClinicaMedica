package Clinica.model;

public class Enfermeiro  extends  Profissional
{
    public Enfermeiro(String nome, String crm, Especialidade especialidade) {
        super(nome, crm, especialidade);
    }


    @Override
    public double calcularValorConsulta() {
        return especialidade.getValorConsulta() * 0.05;
    }
}
