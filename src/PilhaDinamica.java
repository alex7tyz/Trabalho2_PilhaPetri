public class PilhaDinamica {

    No topo;
    int quantidade = 0;

    public PilhaDinamica() {
        this.topo = null;
        System.out.println("Pilha dinâmica criada!");
    }
    // Empilhar
    public void empilhar(String elemento) {

        No novo = new No(elemento);
        novo.setProx(topo);
        topo = novo;
        quantidade++;
    }
    // Desempilhar
    public String desempilhar() {

        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        String valor = topo.getConteudo();
        topo = topo.getProx();
        quantidade--;
        return valor;
    }
    // Ver topo
    public String verTopo() {

        if (estaVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.getConteudo();
    }
    // Está vazia
    public boolean estaVazia() {
        return topo == null;
    }
    // Quantidade atual
    public int quantidade() {
        return quantidade;
    }
    // Limpar pilha
    public void limpar() {
        topo = null;
        quantidade = 0;
    }
    // Contém elemento
    public boolean contem(String elemento) {
        No aux = topo;
        while (aux != null) {
            if (aux.getConteudo().equals(elemento)) {
                return true;
            }
            aux = aux.getProx();
        }
        return false;
    }
    // Contar ocorrências
    public int contarOcorrencias(String elemento) {
        int cont = 0;
        No aux = topo;
        while (aux != null) {
            if (aux.getConteudo().equals(elemento)) {
                cont++;
            }
            aux = aux.getProx();
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
        No aux = topo;
        while (aux != null) {
            texto += aux.getConteudo() + "\n";
            aux = aux.getProx();
        }
        return texto;
    }
}