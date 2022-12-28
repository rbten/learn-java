public class GreaterThanEqual {
  public static void main(String[] args) {
    // Input
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;

    // Calculate total of recommended water
    double totalRecommendedWater = recommendedWaterIntake*daysInChallenge;

    // Check my challenge
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedWater;

    System.out.println("Challenge is completed: "+isChallengeComplete);
  }
}