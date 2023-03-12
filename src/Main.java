import model.Coach;
import model.Train;
import utils.Route;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> mapTrain_Coach = new HashMap<>();
        HashMap<String, String> mapTrainDetails = new HashMap<>();
        HashMap<String,String>
        int noOfTrains;

        noOfTrains = scanner.nextInt();
        scanner.nextLine();
        for(int i=1; i<=noOfTrains; i++)
        {
            String train;
            train = scanner.nextLine();
            String[] trainDetails = train.split(" ");

            Train t = new Train(trainDetails[0], trainDetails[1], trainDetails[2]);

            String coachDetail;
            coachDetail = scanner.nextLine();

            String[] coach = coachDetail.split(" ");



        }
    }
}
