import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         List<Clube>clubes = new ArrayList<>();
         int quantidade = 0;
         while (quantidade<2){
             System.out.println("Informe uma quantidades de clubes:");
             quantidade = scanner.nextInt();
             scanner.nextLine();

         }
         for (int i=0; i<quantidade; i++){
             System.out.println("Digite um nome para o clube:");
             String nome = scanner.nextLine();
             clubes.add(new Clube(nome));
         }
         Campeonato campeonato = new Campeonato(clubes);
         campeonato.jogarCampeonato();
         String classificacao = campeonato.getClassificacao();
         System.out.println(classificacao);
         Clube campeao = campeonato.getCampeao();
         System.out.println(campeao.nome);
    }
}



