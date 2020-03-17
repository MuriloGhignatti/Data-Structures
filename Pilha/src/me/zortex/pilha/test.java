package me.zortex.pilha;

public class test {

    static String expressao;
    static char[] delimitador = null;

    static void separar(){
        delimitador = expressao.toCharArray();
    }

    static int verifica(){
        tad_Pilhas Pilha = new tad_Pilhas(10);
        try {
            for (char i : delimitador){
                if (i == '(') Pilha.empilha('(');
                else if (i == '[') Pilha.empilha('[');
                else if (i == '{') Pilha.empilha('{');
                else if (i == ')' && Pilha.topo() == (Object) '(') Pilha.desempilha();
                else if (i == ']' && Pilha.topo() == (Object) '[') Pilha.desempilha();
                else if (i == '}' && Pilha.topo() == (Object) '{') Pilha.desempilha();
            }

            int k;
            if (Pilha.vazia() == 1) k = 1; //valida
            else k = 0;                    // invalida
            return k;
        } catch (ArrayIndexOutOfBoundsException exception){
            return 0;
        }
    }

    public static void main(String[] args) {

//        expressao = "(1+5)*(56+12)";        //valido    1
//        expressao = "(1+5)*)56+12)";      //invalido  0
//        expressao = "(1+5)*[56+12)";      //invalido  0
//        expressao = "(((1+2) - 3 )* 6)";  //valido    1
        expressao = "())}]{10 + 5} * {12 / [3 * (4 + 5)]}";

        separar();
        System.out.println(verifica());

    }
}

class tad_Pilhas {

    private int max;
    private int topo = -1;
    private Object[] pilha;

    public tad_Pilhas(int max){
        this.max = max;
        pilha = new Object[max];
    }

    public Object topo(){
        return pilha[topo];
    }

    public int vazia(){
        int k;
        if (topo == -1) k = 1;
        else k = 0;
        return k;
    }

    public int cheia(){
        int k;
        if (topo == max) k = 1;
        else k = 0;
        return k;
    }

    public void empilha(Object elemento){
        if (cheia() != 1){
            topo++;
            pilha[topo] = elemento;
        } else cheia();
    }

    public Object desempilha(){
        Object k = vazia();
        if (vazia() != 1){
            topo--;
            k = pilha[topo+1];
        }
        return k;
    }
}

