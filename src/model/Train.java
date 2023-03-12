package model;

import services.TrainService;
import utils.Route;

public class Train{

    private String trainNo;
    private String sourceName;
    private String destinationName;
    private int sourceCost;
    private int destinationCost;

    public Train(String trainNo, String source, String destination) {
        this.trainNo = trainNo;
        String[] sourceDetail = source.split("-");
        this.sourceName = sourceDetail[0];

        String[] destinationDetail = destination.split("-");
        this.destinationName = destinationDetail[0];
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }


}
