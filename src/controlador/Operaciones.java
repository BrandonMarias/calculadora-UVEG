package controlador;

import vista.Caja;

public class Operaciones {

    private static Caja caja;
    private static int anterior = 0;
    private static String signo = "";
    private static boolean signoActivo = true;
    private static boolean divisionError = false;

    public Operaciones(Caja caja) {
        Operaciones.caja = caja;
    }

    public static void concatenarNumero(String numero) {
        if (divisionError) {
            return;
        }
        if (!signoActivo) {
            caja.setText("");
            signoActivo = true;
        }
        String numeroAnterior = caja.getText();
        String numeroSumado = numeroAnterior + numero;
        caja.setText(numeroSumado);
    }

    public static void realizarOperacion(String operador) {

        switch (operador) {
            case "=":
                mostrarResultado();
                break;
            case "C":
                resetear();
                break;
            default:
                ejecutarOperador(operador);

        }
    }

    public static void ejecutarOperador(String operador) {
        if (caja.getText().isEmpty()) return;
        if (divisionError) return;
        anterior = Integer.parseInt(caja.getText());
        caja.setText(operador);
        signo = operador;
        signoActivo = false;
    }

    public static void mostrarResultado() {
        if (!signoActivo) {
            return;
        }
        if (divisionError) {
            return;
        }
        int numeroActual = Integer.parseInt(caja.getText());

        switch (signo) {
            case "+":
                int resultadoSuma = numeroActual + anterior;
                caja.setText(Integer.toString(resultadoSuma));
                break;
            case "-":
                caja.setText(Integer.toString(anterior - numeroActual));
                break;
            case "*":
                caja.setText(Integer.toString(numeroActual * anterior));
                break;
            case "/":
                if (numeroActual == 0) {
                    resetear();
                    caja.setText("Error Division Entre 0");
                    divisionError = true;
                    break;
                }
                caja.setText(Integer.toString(anterior / numeroActual));
                break;
        }
        signo = "";

    }

    private static void resetear() {
        divisionError = false;
        caja.setText("");
        anterior = 0;
        signo = "";
        signoActivo = true;
    }

    

}
