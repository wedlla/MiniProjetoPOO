public class Clube {
    public String nome;
    public int pontos;
    public int saldoGols;

    public Clube(String nome){
        this.nome = nome;
        this.pontos = 0;
        this.saldoGols = 0;

    }

    public void ganhar(int saldoGols){
        pontos +=3;
        this.saldoGols += saldoGols;

    }

    public void empatar(){
        pontos +=1;

    }

    public void perder(int saldoGols){
        this.saldoGols -=saldoGols;

    }
}
