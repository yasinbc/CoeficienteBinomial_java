public class CoeficienteBinomial {
    // Método para calcular el coeficiente binomial de forma dinámica
    public static int CoeficienteBinomial(int n, int k) {
        // Se crea una matriz que almacene los resultados intermedios
        int[][] matrizCB = new int[n + 1][k + 1];

        // Iteramos sobre la matriz
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                // Caso base: si j=0 o j=i, entonces el coeficiente binomial es 1
                if (j == 0 || j == i) {
                    matrizCB[i][j] = 1;
                } else {
                    // Fórmula recursiva pasada a lineal: C(n,k) = C(n-1, k-1) + C(n-1, k)
                    matrizCB[i][j] = matrizCB[i-1][j-1] + matrizCB[i-1][j];
                }
            }
        }
        return matrizCB[n][k];
    }
}