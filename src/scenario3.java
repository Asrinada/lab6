import java.util.Random;
public class scenario3 {
    public static void main(String[] args) {
        int days = 1000000;
        int sunnyCount = 0, cloudyCount = 0, rainyCount = 0, stormyCount = 0;
        Random random = new Random();
        for (int i = 0; i < days; i++) {
            int weather = random.nextInt(100);
            if (weather < 40) {
                sunnyCount++;
            } else if (weather < 70) {
                cloudyCount++;
            } else if (weather < 90) {
                rainyCount++;
            } else {
                stormyCount++;
            }
        }
        double sunnyPct = (sunnyCount * 100.0) / days;
        double cloudyPct = (cloudyCount * 100.0) / days;
        double rainyPct = (rainyCount * 100.0) / days;
        double stormyPct = (stormyCount * 100.0) / days;
        System.out.println("Weather Simulation Results (1,000,000 days):");
        System.out.println("Sunny: " + sunnyCount + " (" + sunnyPct + "%)");
        System.out.println("Cloudy: " + cloudyCount + " (" + cloudyPct + "%)");
        System.out.println("Rainy: " + rainyCount + " (" + rainyPct + "%)");
        System.out.println("Stormy: " + stormyCount + " (" + stormyPct + "%)");
    }
}