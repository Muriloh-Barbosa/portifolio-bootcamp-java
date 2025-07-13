package br.com.murilo.javaPuro.singleton;

/**
 * Implementação de Singleton com inicialização preguiçosa (Lazy).
 *
 * Cria a instância apenas quando for solicitada pela primeira vez.
 *
 * @author Murilo
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
        // Construtor privado para evitar instâncias externas
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}