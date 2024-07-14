package enums;

public enum EstadosBrasileiros {
    PI("Piaui"),
    SP("Sao Paulo"),
    MG("Minas Gerais"),
    CE("Ceara");

    private String nome;
    EstadosBrasileiros(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

}
