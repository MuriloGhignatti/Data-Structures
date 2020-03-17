public class Ordenar {
    public static Fila<Integer> crescente(Fila<Integer> fila1, Fila<Integer> fila2, int filaSizeSum){
        Fila<Integer> resultado = new Fila<>(Integer.class,filaSizeSum);
        int a = fila1.checkFirst();
        int b = fila2.checkFirst();
        while(!fila1.isEmpty() || !fila2.isEmpty()){
            if(!fila1.isEmpty()) a = fila1.checkFirst();
            if(!fila2.isEmpty()) b = fila2.checkFirst();
            if(fila1.isEmpty()) resultado.add(fila2.remove());
            if(fila2.isEmpty()) resultado.add(fila1.remove());
            if(a >= b && !fila2.isEmpty()) resultado.add(fila2.remove());
            else if(!fila1.isEmpty()) resultado.add(fila1.remove());
        }
        return resultado;
    }

    public static Fila<Integer> crescente(Fila<Integer> fila,int filaSize){
       Fila<Integer> hold = new Fila<>(Integer.class,filaSize);
        Fila<Integer> result = new Fila<>(Integer.class,filaSize);

       while(!fila.isEmpty()){
           if(result.isEmpty()) result.add(fila.remove());
           if(!hold.isEmpty()){
               if(hold.checkFirst() <= fila.checkFirst()) result.add(hold.remove());
               else result.add(fila.remove());
           }
            if(fila.checkFirst() <= result.checkFirst()){
                hold.add(result.remove());
                result.add(fila.remove());
            }
            if(fila.checkFirst() >= result.checkFirst()) {
                hold.add(fila.remove());
            };
       }
       return result;
    }
}