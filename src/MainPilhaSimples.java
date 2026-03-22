public class MainPilhaSimples {
    public static void main(String[] args) {

        PilhaSimples pilha = new PilhaSimples(5);

        pilha.empilhar("Ana");
        pilha.empilhar("Carlos");
        pilha.empilhar("Pedro");

        System.out.println(pilha.mostrar());

        System.out.println("Topo: " + pilha.verTopo());

        pilha.desempilhar();

        System.out.println("Depois de desempilhar:");
        System.out.println(pilha.mostrar());

        pilha.limpar();

        System.out.println("Depois de limpar:");
        System.out.println(pilha.mostrar());
    }
}
