public class FuncionesAritmeticas {
    
    /**
     * Calcula la Tasa Metabólica Basal (TMB)
     * @param peso   Peso en kilogramos
     * @param altura Altura en centímetros 
     * @param edad   Edad
     * @param s      Ajuste por género (Hombre: +5, Mujer: -161)
     * @return       Calorías base necesarias 
     */
    public static double calcularTMB_Paniagua_Jorge(double peso, double altura, int edad, int s) {
        return (10 * peso) + (6.25 * altura) - (5 * edad) + s;
    }

    public static void main(String[] args) {
        
        // === Jorge Paniagua ===
        // 1. Llamada para un hombre (s = 5)
        // Datos: 80kg, 180cm, 30 años
        double tmbHombre = FuncionesAritmeticas.calcularTMB_Paniagua_Jorge(80.0, 180.0, 30, 5);
        System.out.println("TMB para hombre: " + tmbHombre + " calorías/día");
    }

}
