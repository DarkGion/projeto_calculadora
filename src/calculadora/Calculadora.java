package calculadora;

/**
 * Calculadora básica do FinançApp.
 *
 * Faz soma, subtração, multiplicação e divisão de números inteiros.
 * Cada conta tem o seu método, e o método calcular escolhe qual conta
 * fazer de acordo com o sinal recebido (+, -, * ou /).
 *
 * @author Giovanni Leandro Lati
 * @version 2.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da soma
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da subtração
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro número
     * @param b segundo número
     * @return o resultado da multiplicação
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo (divisão de inteiros).
     *
     * @param a número que será dividido
     * @param b número que divide
     * @return o resultado da divisão
     * @throws IllegalArgumentException se b for zero
     */
    public int dividir(int a, int b) {
        // Não existe divisão por zero, então paramos aqui e avisamos o erro
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Faz a conta escolhida pelo sinal.
     *
     * Sinais aceitos: "+", "-", "*" e "/".
     *
     * @param a primeiro número
     * @param b segundo número
     * @param operador sinal da conta (+, -, * ou /)
     * @return o resultado da conta
     * @throws IllegalArgumentException se o sinal não existir
     *         ou se tentar dividir por zero
     */
    public int calcular(int a, int b, String operador) {
        // Cada sinal chama o método da sua conta
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}