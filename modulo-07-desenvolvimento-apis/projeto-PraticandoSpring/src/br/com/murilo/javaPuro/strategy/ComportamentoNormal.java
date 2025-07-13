package br.com.murilo.javaPuro.strategy;

/**
 * Implementação de comportamento normal para o robô.
 *
 * Autor: Murilo
 */
public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente ->");
    }
}
