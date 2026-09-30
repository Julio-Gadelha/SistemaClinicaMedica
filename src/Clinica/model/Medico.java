package Clinica.model;

public class Medico extends  Profissional implements Emergencia {

    public Medico(String nome, String crm, Especialidade especialidade) {
        super(nome, crm, especialidade);
    }

    @Override
    public void atendeEmergencia() {
        System.out.println("Atendendo o chamado urgente ");
    }
}
