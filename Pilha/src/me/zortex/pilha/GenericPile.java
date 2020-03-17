package me.zortex.pilha;

public class GenericPile {
    private int max;
    private int top;
    private Object[] data;

    public GenericPile(int max){
        this.max = max;
        this.top = -1;
        this. data = new Object[max];
    }

    public GenericPile(){
        this.max = 100;
        this.top = -1;
        this. data = new Object[max];
    }

    public boolean isFull(){
        if(this.top == this.max) return true;
        return false;
    }

    public boolean isEmpty(){
        if(this.top == -1) return true;
        return false;
    }

    public void stack(Object data){
        if(!isFull()) this.data[++top] = data;
    }

    public Object unstack(){
       if(!isEmpty()) return this.data[top--];
       return null;
    }

    public Object getTop(){
        if(!isEmpty()) return this.data[top];
        return null;
    }

    public Object[] getData(){
        return this.data;
    }
}
