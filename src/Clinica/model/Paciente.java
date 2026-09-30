package Clinica.model;

public class Paciente {
    private  final String cpf;
    private Endereco endereco;

    public Paciente(String cpf, Endereco endereco)  throws  CpfInvalidoException{
        if ( cpf.length() < 11  || cpf == null  ) {
            throw  new CpfInvalidoException("Seu numero de cpf esta errado,tente novamente! ");
        }
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "cpf='" + cpf + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}


