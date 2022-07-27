public class GestaoDePreco {

    // A Classe GestaoDePreco.java arredona pra mais ou pra menos
    // usando a condição (0.50f) para quebrar o valor no meio (50 centavos) ou
    // usando a condição (1) para arrendondar o valor para inteiro.

    public static float GestorDePrecos(float porcentagem, String arredondaMaisMenos, float preco, float casaDecimal) {
        float valorFinal = 0;
        // Por padrao o codigo vai sempre aumentar o valor.
        if (arredondaMaisMenos.equals("praMais") || arredondaMaisMenos.equals("")) {
            if (casaDecimal == 0.50f) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado < 0.5) {
                    valorFinal = (int) valorFinal + 0.5f;
                } else {
                    valorFinal = (int) valorFinal + 1.5f;
                }
            } else if (casaDecimal == 1) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado > 0) {
                    valorFinal = (int) valorFinal + 1;
                }
            } else {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                String verificador = String.valueOf(valorFinal);
                if (verificador.length() > 5){
                    valorFinal = convertDigits(valorFinal);
                }
            }
        } else if (arredondaMaisMenos.equals("praMenos")) {
            if (casaDecimal == 0.50f) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado < 0.5) {
                    valorFinal = (int) valorFinal - 0.5f;
                } else {
                    valorFinal = (int) valorFinal + 0.5f;
                }
            } else if (casaDecimal == 1) {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                float resultado = valorFinal - (int) valorFinal;
                if (resultado > 0) {
                    valorFinal = (int) valorFinal;
                }
            } else {
                valorFinal = (((porcentagem / 100) * preco) + preco);
                String verificador = String.valueOf(valorFinal);
                if (verificador.length() > 5){
                    valorFinal = convertDigits(valorFinal);
                }
            }
        }
        return valorFinal;
    }

    // Converte o float para o seguinte formato: '0.00'
    private static float convertDigits(float valor) {
        String convert = String.valueOf(valor);
        int contChar = 0;
        char[]caracteres = convert.toCharArray();
        for (int i = 0; i < caracteres.length && !".,".contains("" + caracteres[i]); i++) {
            contChar++;
        }
        char[] floatFormat = new char[contChar + 3];
        for (int i = 0; i < (contChar + 3); i++) {
            floatFormat[i] = caracteres[i];
        }
        convert = new String(floatFormat);
        return Float.parseFloat(convert);
    }
}