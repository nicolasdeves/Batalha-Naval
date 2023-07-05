// Nícolas Deves

public class Main{
    public static void main(String args[]){

        Jogo tabuleiro = new Jogo();

        BoasVindas.inicio();

        tabuleiro.fazTabuleiro();

        tabuleiro.teste(); //ver resultados

        tabuleiro.atirar();
    }
}
