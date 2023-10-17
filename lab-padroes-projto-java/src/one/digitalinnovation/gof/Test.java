package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Singleton.SingletonLazy;
import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.SingletonEager;
import one.digitalinnovation.gof.Singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.Strategy.ComportamentoNormal;
import one.digitalinnovation.gof.Strategy.Robo;
import one.digitalinnovation.gof.Strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.Strategy.Comportamento;
import one.digitalinnovation.gof.Strategy.ComportamentoAgressivo;

public class Test {
    
    public static void main(String[] args) {

        //Teste relacionado ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Teste relacionado ao Design Pattern Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setcomportamento(normal);
        robo.mover();
        robo.mover();
        robo.setcomportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setcomportamento(agressivo);
        robo.mover();
        robo.mover();

        //Teste relacionado ao Desgin Pattern Facade:
        Facade facade = new Facade();
        facade.migrarCliente("Raquel", "20756070");


    }

}
