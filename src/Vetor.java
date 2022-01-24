import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    
    }

    /*public void adiciona(String elementos){
        for (int i=0; i<this.elementos.length; i++){ //vai da posição 0 até a última posição
            if (this.elementos[i] == null){ //se a posição estiver vazia
                this.elementos[i] = elementos;//pode atribuir o vetor
                break;// necessário para o código parar na 1° posição nula e não ir direto até a última
            }
        }

    }*/
    public void adiciona(String elementos) throws Exception{
        if(this.tamanho< this.elementos.length){ //verifica se o tamanho é menos que a capacidade do vetor no caso 5
        this.elementos[this.tamanho] = elementos;//adiciona elementos
        this.tamanho++;//guardar na memória qual a última posição adicionada
        } else {
            throw new Exception("Vetor cheio");
        }
    }

    public int tamanho(){
        return this.tamanho;

    }

    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(" , ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }
}
