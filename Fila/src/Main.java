public class Main {

    public static void main(String[] args) {
        Fila<Integer> fila1 = new Fila<>(Integer.class,4);
        Fila<Integer> fila2 = new Fila<>(Integer.class,5);
        Fila<Integer> fila3 = new Fila<>(Integer.class, 5);

        fila1.add(12);
        fila1.add(35);
        fila1.add(52);
        fila1.add(64);

        fila2.add(5);
        fila2.add(15);
        fila2.add(23);
        fila2.add(55);
        fila2.add(75);

        fila3.add(15);
        fila3.add(2);
        fila3.add(5);
        fila3.add(6);
        fila3.add(1);

        Fila<Integer> resultado = Ordenar.crescente(fila1,fila2,9);

       // Fila<Integer> resultado2 = Ordenar.crescente(fila3,5);

        while(!resultado.isEmpty()) System.out.println(resultado.remove());
    }

}