package study.pattern.strategy;

public class Teste {

    public static void main(String[] args){
        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento normal = new ComportamentoNormal();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }

}
