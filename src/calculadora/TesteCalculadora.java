package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, "Soma", 2, 3, "+", 5);
        testar(calc, "Subtração", 10, 4, "-", 6);
        testar(calc, "Multiplicação", 3, 5, "*", 15);
        testar(calc, "Divisão", 8, 2, "/", 4);
        testar(calc, "Divisão por zero", 8, 0, "/", 0);
        testar(calc, "Operação inválida", 5, 5, "x", 0);
    }

    static void testar(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        int obtido = calc.calc(a, b, op);
        String status = (obtido == esperado) ? "PASSOU" : "FALHOU";
        System.out.println(nome + " | entradas: " + a + " " + op + " " + b
                + " | esperado: " + esperado + " | obtido: " + obtido + " | " + status);
        System.out.println("-----");
    }
}