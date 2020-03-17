import java.lang.reflect.Array;

public class Fila<T> {

    private int head;
    private int max;
    private int tail;
    private int size;
    private T[] dado;

    public Fila(Class<T> type,int max){
        this.head = 0;
        this.tail = -1;
        this.size = 0;
        this.max = max;
        this.dado = (T[]) Array.newInstance(type,max);
    }

    public Fila(Class<T> type){
        this.head = 0;
        this.tail = -1;
        this.size = 0;
        this.max = 20;
        this.dado = (T[]) Array.newInstance(type,max);
    }

    public boolean isFull(){
        return this.size == max;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void add(T data) {
        if (!isFull()) {
            if (this.tail == this.max - 1) {
                this.tail = 0;
            } else {
                this.tail++;
            }
            this.dado[tail] = data;
            this.size++;
        }
        else System.out.println("A Fila Está Cheia! Seu Dado Não Será Salvo. Caso Deseje Aumente o Valor Maximo da Fila");
    }

    public T remove(){
        if(!isEmpty()){
            this.tail--;
            this.size--;
            return this.dado[head++];
        }
        System.out.println("A Fila Está Vazia... Retornando Nulo");
        return null;
    }

    public T checkFirst(){
        if(!isEmpty()) return this.dado[head];
        System.out.println("A Fila Está Vazia... Retornando Nullo");
        return null;
    }
}