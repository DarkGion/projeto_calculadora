package calculadora;

/**
 * Testes da classe Calculadora.
 *
 * Para cada teste mostra os números usados, o resultado que esperamos
 * e o resultado que a calculadora deu, e diz se passou ou falhou.
 *
 * @author Giovanni Leandro Lati
 * @version 2.0
 */
public class TesteCalculadora {

    /**
     * Roda todos os testes.
     *
     * @param args não é usado
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, "Soma", 2, 3, "+", 5);
        testar(calc, "Subtração", 10, 4, "-", 6);
        testar(calc, "Multiplicação", 3, 5, "*", 15);
        testar(calc, "Divisão", 8, 2, "/", 4);

        testarErro(calc, "Divisão por zero", 8, 0, "/");
        testarErro(calc, "Operação inválida", 5, 5, "x");
    }

    /**
     * Testa uma conta que deve dar um resultado.
     *
     * @param calc a calculadora
     * @param nome nome do teste
     * @param a primeiro número
     * @param b segundo número
     * @param operador sinal da conta
     * @param esperado resultado que esperamos
     */
    static void testar(Calculadora calc, String nome, int a, int b, String operador, int esperado) {
        int obtido = calc.calcular(a, b, operador);
        String status = (obtido == esperado) ? "PASSOU" : "FALHOU";
        System.out.println(nome + " | entradas: " + a + " " + operador + " " + b
                + " | esperado: " + esperado + " | obtido: " + obtido + " | " + status);
        System.out.println("-----");
    }

    /**
     * Testa uma conta que deve dar erro (IllegalArgumentException).
     *
     * @param calc a calculadora
     * @param nome nome do teste
     * @param a primeiro número
     * @param b segundo número
     * @param operador sinal da conta
     */
    static void testarErro(Calculadora calc, String nome, int a, int b, String operador) {
        String esperado = "IllegalArgumentException";
        String obtido;
        try {
            calc.calcular(a, b, operador);
            obtido = "nenhuma exceção";
        } catch (IllegalArgumentException e) {
            obtido = "IllegalArgumentException (" + e.getMessage() + ")";
        }
        String status = obtido.startsWith(esperado) ? "PASSOU" : "FALHOU";
        System.out.println(nome + " | entradas: " + a + " " + operador + " " + b
                + " | esperado: " + esperado + " | obtido: " + obtido + " | " + status);
        System.out.println("-----");
    }
}