package br.com.murilo.javaPuro.strategy;

/**
 * Implementação de comportamento defensivo para o robô.
 *
 * Autor: Murilo
 */
public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma defensiva -> ->");
    }
}
