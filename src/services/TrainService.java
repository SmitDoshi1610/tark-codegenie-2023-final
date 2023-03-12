package services;

import utils.Route;

import java.util.HashMap;

public class TrainService {

    private HashMap<String, Route> train = new HashMap<>();
    private String trainNo;

    public void addRoute(String trainNo, Route r){
        train.put(trainNo, r);
    }
}
