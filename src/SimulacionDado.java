import java.util.Random;

public class SimulacionDado {
    public static void main(String[] args) {
        int numLanzamientos = 500;
        int numReplicas = 5;
        
        for (int replica = 1; replica <= numReplicas; replica++) {
            System.out.println("Réplica " + replica);
            simularLanzamientos(numLanzamientos);
            System.out.println();
        }
    }
    
    public static void simularLanzamientos(int numLanzamientos) {
        Random random = new Random();
        int[] frecuencias = new int[6];
        
        // Realizar lanzamientos
        for (int i = 0; i < numLanzamientos; i++) {
            int resultado = random.nextInt(6) + 1;
            frecuencias[resultado - 1]++;
        }
        
        // Mostrar resultados
        System.out.println("Cara\tFrecuencia\tFrecuencia Relativa");
        for (int i = 0; i < 6; i++) {
            int cara = i + 1;
            int frecuencia = frecuencias[i];
            double frecuenciaRelativa = (double) frecuencia / numLanzamientos;
            System.out.printf("%d\t%d\t\t%.4f%n", cara, frecuencia, frecuenciaRelativa);
        }
    }
}