package wspilha;

public interface Empilhavel {
    boolean cheia();
    boolean vazia();
    void empilhar(Object dado); 
    Object desempilhar();
    Object topo();
    void imprimir();
}