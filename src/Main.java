import enums.EstadosBrasileiros;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        EstadosBrasileiros estado = EstadosBrasileiros.SP;
        String meuEstado = estado.getNome();

        System.out.println(estado);
        System.out.println(meuEstado);



    }
}