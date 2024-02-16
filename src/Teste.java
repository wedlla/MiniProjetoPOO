import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCampeonato {
    public static void main(String[] args) {
        testeCampeonato();
    }

    public static void testeCampeonato() {
        List<Clube> clubes = new ArrayList<>();
        clubes.add(new Clube("Clube A"));
        clubes.add(new Clube("Clube B"));
        clubes.add(new Clube("Clube C"));
        Campeonato campeonato = new Campeonato(clubes);
        campeonato.jogarCampeonato();
        System.out.println("Classificação final:");
        System.out.println(campeonato.getClassificacao());
        System.out.println("O campeão é: " + campeonato.getCampeao().nome);
    }
}
