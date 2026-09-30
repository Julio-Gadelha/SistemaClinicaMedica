package Clinica.model;

public enum Especialidade {
    CLINICO_GERAL(1000),
    PEDIATRA(483.40),
    CARDIOLOGISTA(344.34);

    private   final double valorConsulta ;

    Especialidade(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }
}
