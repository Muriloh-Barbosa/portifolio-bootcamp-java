package br.com.murilo.javaPuro.strategy;

/**
 * Implementação de comportamento agressivo para o robô.
 *
 * Autor: Murilo
 */
public class ComportamentoAgressivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se de forma agressiva -> -> -> -> -> -> -> ->");
    }
}
