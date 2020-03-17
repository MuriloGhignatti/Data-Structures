package me.zortex.pilha;

public class BinaryConverter{

    public static Object[] intToBinarySave(int integer){
        GenericPile pilha = new GenericPile(checkPilhaNecessarySize(integer));
        double resultado = integer;
        while(resultado != 0){
            pilha.stack((byte) (resultado % 2));
            resultado /= 2;
        }
        return pilha.getData();
    }

    public static void intToBinary(int integer){
        GenericPile pilha = new GenericPile(5);
        int resultado = integer;
        String print = "";
        while(resultado != 0){
            pilha.stack((byte) (resultado % 2));
            resultado /= 2;
        }
        while(!pilha.isEmpty()){
            print += pilha.unstack() + " ";
        }
        System.out.println(print);
    }

    public static int checkPilhaNecessarySize(int integer){
        double resultado = integer;
        int size = 0;
        while(resultado > 1){
            resultado /= 2;
            size++;
        }
        return size;
    }
}