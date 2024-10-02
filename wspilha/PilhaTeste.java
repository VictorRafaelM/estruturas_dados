package wspilha;

public class PilhaTeste {
    public static void main(String[] args) {

        Empilhavel pilha = new Empilhamento();
        adicionarElementos(pilha);
        pilha.desempilhar();
        exibirPilha(pilha);
    }

    private static void adicionarElementos(Empilhavel pilha) {
        String[] elementos = {"frodo", "gandalf", "aragorn"};
        for (String elemento : elementos) {
            pilha.empilhar(elemento);
        }
    }

    private static void exibirPilha(Empilhavel pilha) {
        System.out.println("nomes da pilha:");
        pilha.imprimir();
    }
}
