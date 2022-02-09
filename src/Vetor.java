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
        //0 1 2 3 4 5 6....10 o tamanho do vetor é 5
        //B C E F G + +
    public boolean adiciona(int posicao, String elemento){
        if (!(posicao >= 0 && posicao < tamanho)){//informando que se a posição informada não for maior que 0 e menor que posição
            throw new IllegalArgumentException("Posição inválida");
        }

        //Mover todos os elementos
        for (int i=this.tamanho-1; i>=posicao; i--){//colocando o vetor uma casa atrás - 4
            this.elementos[i+1] = this.elementos[i];// dizendo que o "4+1 = 5 vai receber o valor que estava no 4"
        }

        this.elementos[posicao] = elemento;
        this.tamanho ++;

        return true;
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){//informando que se a posição informada não for maior que 0 e menor que posição
            throw new IllegalArgumentException("Posição inválida");
        }
        return elementos[posicao];
    }

    public int busca(String elemento){
        for (int i=0; i<tamanho; i++){// i é o elemento informado pelo user para busca no vetor
            if (elementos[i].equals(elemento)){//se a posição informada i for igual ao elemento que está no vetor
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){
        return this.tamanho;

    }

    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){//iteração dos elementos
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
