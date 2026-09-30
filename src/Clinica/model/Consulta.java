package Clinica.model;

import java.time.LocalDate;

public class Consulta {
    private final Paciente paciente;
    private final Profissional profissional;
    private final LocalDate dataAgendamento;
    public static final double TAXA_AGENDAMENTO = 5.0;
    private static int consultasRealizadas = 0;

    public Consulta(Paciente paciente, Profissional profissional) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.dataAgendamento = LocalDate.now();
        consultasRealizadas++;
    }

    public double calcularValorTotal() {
        return profissional.calcularValorConsulta() + TAXA_AGENDAMENTO;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public static int getConsultasRealizadas() {
        return consultasRealizadas;
    }

    @Override
    public String toString() {
        return " Consulta na data  : " + getDataAgendamento() + "  | Paciente:   " + paciente.getNome() + "| Profissional:  " + profissional.getNome()  + "|  Valor: R$ %.2f" + calcularValorTotal();
    }
}
