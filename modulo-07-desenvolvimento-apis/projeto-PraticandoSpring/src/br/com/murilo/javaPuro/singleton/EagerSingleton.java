package br.com.murilo.javaPuro.singleton;

/**
 * Implementação de Singleton com inicialização ansiosa (Eager).
 *
 * instância é criada no momento do carregamento da classe
 *
 * @author Murilo
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        // Construtor privado para evitar instâncias externas
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
