public class Aula9 {
    public static void main(String[]args) throws Exception{

        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");


        System.out.print(vetor);

        vetor.remove(1);

       System.out.println(vetor);
    }
}
