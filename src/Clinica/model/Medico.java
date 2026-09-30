package Clinica.model;


public class Medico extends Profissional implements AtendeEmergencia {

    public Medico(String nome, String crm, Especialidade especialidade) {
        super(nome, crm, especialidade);
    }

    @Override
    public double calcularValorConsulta() {
        return especialidade.getValorConsulta();
    }

    @Override
    public void atenderEmergencia(String descricao) {
        System.out.println("Médico " + getNome() + " atendendo emergência: " + descricao);
    }
}
