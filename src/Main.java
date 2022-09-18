public class Main {
    public static void main(String[] args) {
//        int score1 = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your final score was: " + score1);
//
//        int score2 = calculateScore(true, 5000, 10, 100);
//        System.out.println("Your final score was: " + score2);

//        printConversion(1.5);
//        printConversion(10.25);
//        printConversion(-5.6);

//        printMegaBytesAndKiloBytes(2500);
//        printMegaBytesAndKiloBytes(-1024);
//        printMegaBytesAndKiloBytes(5000);

//        int newScore1 = calculateScore("Tim", 500);
//        System.out.println("Score calculation overload 1 = " + newScore1);
//
//        int newScore2 = calculateScore(300);
//        System.out.println("Score calculation overload 2 = " + newScore2);

//        System.out.println( convertStandardToMetric(1, 2) );
//        System.out.println( convertStandardToMetric(14 ) );
//        System.out.println( convertStandardToMetric(-1, 2) );

//        System.out.println( area(5.0) );
//        System.out.println( area(-1.0) );
//        System.out.println( area(5.0, 4.0) );
//        System.out.println( area(-1.0, 4.0 ) );


        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

//    public static int calculateScore(boolean gameEnded, int score, int levels, int bonus) {
//        if (gameEnded) {
//            int finalScore = score + (levels * bonus);
//            return finalScore;
//        }
//        return -1; // -1 is a not found or error convention
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            return -1;
//        }
//        double conversionFactor = 1.609;
//        return Math.round(kilometersPerHour/conversionFactor);
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//        long milesPerHour = toMilesPerHour(kilometersPerHour);
//
//        if (milesPerHour != -1) {
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h" );
//        } else {
//            System.out.println("Invalid Value");
//        }
//    }
//
//    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
//        if (kiloBytes < 0) {
//            System.out.println("Invalid Value");
//            return;
//        }
//
//        int megaBytes = kiloBytes / 1024;
//        int kiloBytesRemainder = kiloBytes % 1024;
//
//        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemainder + " KB");
//    }


    // OVERLOADING

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name or Score Provided");
        return 0;
    }


    public static double convertStandardToMetric(double feet, double inches) {
        if ( (feet < 0) || (inches < 0) || (inches > 12) ) {
            return -1;
        }

        double conversionInchToCM = 2.54d;

        return (feet * conversionInchToCM * 12) + (inches * conversionInchToCM);
    }

    public static double convertStandardToMetric(double inches) {
        if (inches < 0) {
            return -1;
        }

        return convertStandardToMetric(Math.floor(inches/12), inches % 12);
    }


    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double length, double width) {
        if ( (length < 0) || (width < 0) ) {
            return -1.0d;
        }
        return length * width;
    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }


        long years = (long) Math.floor(minutes / (365 * 24 * 60) );
        long days = (long) Math.floor ( ( minutes - (years * 365 * 24 * 60) ) / (60 * 24) );

        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}