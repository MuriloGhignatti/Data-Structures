package me.zortex.pilha;

public class Main{

    public static void main(String args[]){
        //BinaryConverter.intToBinary(10);

        //System.out.println(Expression.check("(10 + 5) * {12 / [3 * (4 + 5)]}"));

        GenericPile pile = new GenericPile(2);

        pile.stack(1);
        pile.stack(2);

        System.out.println(pile.unstack());

    }

}