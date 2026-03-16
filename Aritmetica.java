import java.lang.Math;

public class Aritmetica {
    
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

    public static double porcentaje_Cardenas_Lia(double valor, double porcentaje) {
        return valor * porcentaje / 100;
    }

    public static double cosenoGrados_FigueroaRodrigo(double grados){
        double radianes = Math.toRadians(grados);
        return Math.cos(radianes);
    }
	
	public static long factorial_Alcocer_Ninel(int n) {
    long resultado = 1;

		for(int i = 1; i <= n; i++) {
        resultado *= i;
		}

    return resultado;
	}

    public static void main(String[] args) {
 
        // === Jorge Paniagua ===
        // 1. Llamada para un hombre (s = 5)
        // Datos: 80kg, 180cm, 30 años
        double tmbHombre = Aritmetica.calcularTMB_Paniagua_Jorge(80.0, 180.0, 30, 5);
        System.out.println("TMB para hombre: " + tmbHombre + " calorías/día");
        
        // === Lia Cardenas ===
        double valor = 200;
        double porcentaje = 20;
        double resultado = porcentaje_Cardenas_Lia(valor, porcentaje);
        System.out.println("El " + porcentaje + "% de " + valor + " es: " + resultado);
   
        
        // === Rodrigo Figueroa ===
        double angulo = 60.0;
        System.out.println("El coseno de " + angulo + " grado es: " +  cosenoGrados_FigueroaRodrigo(angulo));


		// === Ninel Alcocer ===
		int num = 5;
		System.out.println("Factorial de " + num + " es: " + factorial_Alcocer_Ninel(num));
    }

}
