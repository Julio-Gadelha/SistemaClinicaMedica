package Clinica.model;

public enum Especialidade {
    CLINICO_GERAL(10000),
    PEDIATRA(483.40),
    CARDIOLOGISTA(3464.34);

    private  double valorConsulta ;

    Especialidade(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }
}
