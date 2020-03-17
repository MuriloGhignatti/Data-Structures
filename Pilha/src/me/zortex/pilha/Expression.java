package me.zortex.pilha;

public class Expression{

    String test = "() { [ () ] }";

    // ( { [ (
    // ) ) ] }

    /*
    { - 123
    } - 125
    ( - 40
    ) - 41
    ] - 93
    [ - 91
    */

    public static boolean check(String exp){
        try {
            GenericPile p = new GenericPile(10);

            for (Character c : exp.toCharArray()) {
                if (c.equals('{')) p.stack('{');
                else if (c.equals('[')) p.stack('[');
                else if (c.equals('(')) p.stack('(');
                else if (c.equals('}') && p.getTop().equals('{')) p.unstack();
                else if (c.equals(']') && p.getTop().equals('[')) p.unstack();
                else if (c.equals(')') && p.getTop().equals('(')) p.unstack();
            }

            if (p.isEmpty()) return true;

            return false;
        }
        catch (NullPointerException e){
            return false;
        }
    }

}