import java.util.List;
import java.util.Random;
import java.util.Comparator;


public class Campeonato{
    public List<Clube>clubes;
    public Campeonato(List<Clube>clubes){
        this.clubes = clubes;
    }

    public void jogarCampeonato(){
        for (int i = 0; i < clubes.size(); i++){
            Clube clubeM = clubes.get(i);
            for (Clube clubeV:clubes){
                boolean diferentes = !clubeM.nome.equals(clubeV.nome);
                if (diferentes){
                    jogarPartida(clubeM, clubeV);
                }
            }
        }
    }

    private void jogarPartida(Clube m, Clube v){
        int placarM = new Random().nextInt(6);
        int placarV = new Random().nextInt(6);

        if (placarM > placarV){
            m.ganhar(placarM);
            v.perder(placarV);
        } else if (placarM < placarV){
            m.perder(placarM);
            v.ganhar(placarV);

        } else {
            m.empatar();
            v.empatar();
        }
    }

    public String getClassificacao(){
        clubes.sort(Comparator.comparingInt((Clube clube) ->clube.pontos)
                .thenComparingInt(clube ->clube.saldoGols)
                .reversed()
        );
        StringBuilder classificacao = new StringBuilder();
        for (Clube clube:clubes){
            classificacao.append(clube.nome)
                    .append("\npontos "+ clube.pontos)
                    .append("\ngols "+ clube.saldoGols);
        }
        return classificacao.toString();
    }

    public Clube getCampeao(){

        return clubes.get(0);
    }

}