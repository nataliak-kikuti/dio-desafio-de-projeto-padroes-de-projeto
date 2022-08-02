package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton
        //Singleton
        SingletonLazy lazy = SingletonLazy.getIinstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getIinstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getIinstancia();
        System.out.println(eager);
        eager = SingletonEager.getIinstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getIinstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getIinstancia();
        System.out.println(holder);


        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

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

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Natalia","1212121");


    }
}
