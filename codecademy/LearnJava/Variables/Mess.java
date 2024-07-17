public class Mess {
	public static void main(String[] args) {   
		int year = 2001;
        String title = "Shrek";
        char genre = 'C';
        double runtime = 1.58;
        boolean isPG = true;

        int numCookies = 17;
        numCookies -= 3;
        numCookies /= 2;
        System.out.println(numCookies);

        double androidShare = 81.7;
        System.out.println(androidShare);

        int students = 26;
        int leftOut = students % 3;
        System.out.println(students);

        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;
        boolean sameNumberOfSongs = songsA == songsB;
        boolean differentLength = albumLengthA != albumLengthB;

        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw;
        double amountForEachFriend = updatedBalance / 3;
        boolean canPurchaseTicket = amountForEachFriend >= 250;
        System.out.println(canPurchaseTicket);
        System.out.println("I gave each friend" + " " + amountForEachFriend);

        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + subtotal * tax;
        System.out.println(total);
        
        double perPerson = total / 4;
        System.out.println(perPerson);

        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo);
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade);

        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        System.out.println(line1.equals(line2));
        System.out.println(line2.equals(line3));

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);
        double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
        System.out.println(creditsToGraduate < creditsAfterSeminar);

        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
        double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println(isChallengeComplete);

        int mystery1 = 8 + 6;
        int mystery2 = 8 - 6;
        System.out.println(mystery2);
	}
}