package br.com.murilo.javaPuro;

import br.com.murilo.javaPuro.facade.Facade;
import br.com.murilo.javaPuro.singleton.EagerSingleton;
import br.com.murilo.javaPuro.singleton.LazySingleton;
import br.com.murilo.javaPuro.singleton.LazyHolderSingleton;
import br.com.murilo.javaPuro.strategy.Comportamento;
import br.com.murilo.javaPuro.strategy.ComportamentoNormal;
import br.com.murilo.javaPuro.strategy.ComportamentoDefensivo;
import br.com.murilo.javaPuro.strategy.ComportamentoAgressivo;
import br.com.murilo.javaPuro.strategy.Robo;

/**
 * Classe de execução para testes dos padrões Singleton, Facade e Strategy no módulo javaPuro.
 *
 * Autor: Murilo
 */
public class ExecJavaPuro {

    public static void main(String[] args) {

        // ===========================
        // Teste Singleton Lazy
        // ===========================
        System.out.println("=== Teste LazySingleton ===");
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);
        lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        // ===========================
        // Teste Singleton Eager
        // ===========================
        System.out.println("\n=== Teste EagerSingleton ===");
        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);
        eager = EagerSingleton.getInstance();
        System.out.println(eager);

        // ===========================
        // Teste Singleton Lazy Holder
        // ===========================
        System.out.println("\n=== Teste LazyHolderSingleton ===");
        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);

        // ===========================
        // Teste Facade
        // ===========================
        System.out.println("\n=== Teste Facade ===");
        Facade facade = new Facade();
        facade.migrarCliente("Murilo", "01599-999", "11");

        // ===========================
        // Teste Strategy
        // ===========================
        System.out.println("\n=== Teste Strategy ===");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        System.out.println("\n-- Movimento Normal --");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("\n-- Movimento Defensivo --");
        robo.setComportamento(defensivo);
        robo.mover();

        System.out.println("\n-- Movimento Agressivo --");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
