public class PilhaSimples {

    String[] pilha;
    int topo = 0;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
        System.out.println("Pilha simples criada!");
    }
    // Empilhar
    public void empilhar(String elemento) {
        if (estaCheia()) {
            throw new RuntimeException("Pilha cheia!");
        }
        pilha[topo] = elemento;
        topo++;
    }
    // Desempilhar
    public String desempilhar() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        topo--;
        String valor = pilha[topo];
        pilha[topo] = null;
        return valor;
    }
    // Ver topo
    public String verTopo() {
        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return pilha[topo - 1];
    }
    // Está vazia
    public boolean estaVazia() {
        return topo == 0;
    }
    // Está cheia
    public boolean estaCheia() {
        return topo == pilha.length;
    }
    // Tamanho máximo
    public int tamanhoMaximo() {
        return pilha.length;
    }
    // Quantidade atual
    public int quantidade() {
        return topo;
    }
    // Limpar pilha
    public void limpar() {
        for (int i = 0; i < pilha.length; i++) {
            pilha[i] = null;
        }
        topo = 0;
    }
    // Contém elemento
    public boolean contem(String elemento) {

        for (int i = 0; i < topo; i++) {
            if (pilha[i].equals(elemento)) {
                return true;
            }
        }

        return false;
    }
    // Contar ocorrências
    public int contarOcorrencias(String elemento) {

        int cont = 0;

        for (int i = 0; i < topo; i++) {
            if (pilha[i].equals(elemento)) {
                cont++;
            }
        }
        return cont;
    }
    // Empilhar vários
    public void empilharVarios(String[] elementos) {

        for (String e : elementos) {
            empilhar(e);
        }
    }
    // Mostrar pilha
    public String mostrar() {

        String texto = "";

        for (int i = topo - 1; i >= 0; i--) {
            texto += pilha[i] + "\n";
        }
        return texto;
    }
}