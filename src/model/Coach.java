package model;

import utils.coachType;

import java.util.ArrayList;

public class Coach {

    private String coachNo;
    private ArrayList<String> detail = new ArrayList<>();

    public Coach(String coachNo, ArrayList<String> detail) {
        this.coachNo = coachNo;
        this.detail = detail;
    }
}
