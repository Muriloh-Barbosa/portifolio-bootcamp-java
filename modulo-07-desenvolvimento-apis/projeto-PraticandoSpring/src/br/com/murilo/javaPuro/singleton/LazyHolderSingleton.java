package br.com.murilo.javaPuro.singleton;

/**
 * Implementação do padrão Singleton usando o "Lazy Holder".
 *
 * Este padrão garante inicialização preguiçosa e thread safety, sem a necessidade de sincronização explícita. A instância é criada apenas quando o método getInstance() é chamado pela primeira vez.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência no StackOverflow</a>
 *
 * @author Murilo
 */
public class LazyHolderSingleton {

    private static class InstanceHolder {
        private static final LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        // Construtor privado para evitar instâncias externas
    }

    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
