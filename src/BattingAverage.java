/**
 * Created by Moravia on 11/22/16.
 */
import java.util.Scanner;

class Batter {
    int atBats;
    int[] arrayOfAtBats;
    int numberOfAtBatsWithAtLeastOneBase;
    int totalBases = 0;
    double battingAverage;
    double sluggingPercentage;
}

public class BattingAverage {
    public static void main(String[] args) {

        System.out.println("Play ball!");
        Scanner sc = new Scanner(System.in);

        Batter batter = new Batter();
        System.out.print("Batter up! How many times does this batter go at bat? ");
        batter.atBats = sc.nextInt();

        batter.arrayOfAtBats = new int[batter.atBats];

        for (int i = 0; i < batter.arrayOfAtBats.length; i++) {
            System.out.print("How many bases were earned by the batter for their " + (i + 1) + " time at bat?");
            batter.arrayOfAtBats[i] = sc.nextInt();

            if(batter.arrayOfAtBats[i] > 0) {
                batter.numberOfAtBatsWithAtLeastOneBase++;
            }

            batter.totalBases += batter.arrayOfAtBats[i];
        }

        // Batting average is total number of at-bats for which the player earned at least one base divided by the total number of at-bats.
        batter.battingAverage = batter.numberOfAtBatsWithAtLeastOneBase / batter.arrayOfAtBats.length;

        // Slugging percentage is the total number of bases earned divided by the total number of at-bats.
        batter.sluggingPercentage = batter.totalBases / batter.arrayOfAtBats.length;

        System.out.println("The batter's batting average is " + batter.battingAverage);

        System.out.println("Their slugging percentage is " + batter.sluggingPercentage);

        sc.close();
    }
}
