package Clinica.model;


public class Paciente {
    private final String nome;
    private final String cpf;
    private Endereco endereco;

    public Paciente(String nome, String cpf, Endereco endereco) throws CpfInvalidoException {
        if (cpf == null || cpf.trim().isEmpty() || cpf.trim().length() < 11) {
            throw new CpfInvalidoException("CPF inválido: não pode ser vazio e deve ter pelo menos 11 caracteres");
        }

        this.nome = nome;
        this.cpf = cpf.trim();
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return (" Paciente: " +getNome()  + "  | CPF: %s  "  + getCpf()  + " |  Endereço: " + getEndereco());
    }
}
