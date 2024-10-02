package wspilha;

public class Empilhamento implements Empilhavel {
    private int ponteiroTopo;
        private Object[] dados;
    
        public Empilhamento(int tamanho) {
            ponteiroTopo = -1;
            dados = new Object[tamanho];
        }
    
        public Empilhamento() {
            this(10);
        }
    
        @Override
        public boolean cheia() {
            return (ponteiroTopo == dados.length - 1);
        }
    
        @Override
        public boolean vazia() {
            return (ponteiroTopo == -1);
        }
    
        @Override
        public void empilhar(Object dado) {
            if (!cheia()) {
                ponteiroTopo++;
                dados[ponteiroTopo] = dado;
            } else {
                System.out.println("pilha cheia " + dado);
            }
        }
    
        @Override
        public Object desempilhar() {
            if (!vazia()) {
                Object dadoTopo = dados[ponteiroTopo]; 
                ponteiroTopo--;
                return dadoTopo;
            } else {
                System.out.println("pilha vazia");
                return null;
            }
        }
    
        @Override
        public Object topo() {
            if (!vazia()) {
                return dados[ponteiroTopo];
            } else {
                System.out.println("pilha vazia sem elemento no topo.");
                return null;
            }
        }
    
        @Override
        public void imprimir() {
            if (vazia()) {
                System.out.println("pilha vazia");
            } else {
                System.out.print("elementos da pilha: ");
                for (int i = 0; i <= ponteiroTopo; i++) {
                    System.out.print("[" + dados[i] + "] ");
                }
                System.out.println();
            }
        }
    }
    

