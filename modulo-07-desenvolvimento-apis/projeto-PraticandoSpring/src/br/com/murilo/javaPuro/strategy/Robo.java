package br.com.murilo.javaPuro.strategy;

/**
 * Classe que representa um robô com comportamento configurável.
 *
 * Autor: Murilo
 */
public class Robo {

    private Comportamento comportamento;

    /**
     * Define o comportamento do robô.
     *
     * @param comportamento implementação da estratégia de movimento
     */
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    /**
     * Executa o movimento do robô conforme o comportamento definido.
     * Exibe aviso se nenhum comportamento estiver configurado.
     */
    public void mover() {
        if (comportamento != null) {
            comportamento.mover();
        } else {
            System.out.println("Nenhum comportamento definido para o robô.");
        }
    }
}
