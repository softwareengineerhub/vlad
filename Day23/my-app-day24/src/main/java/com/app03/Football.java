package com.app03;

public class Football extends Sport{

    @Override
    public void describeRules() {
        System.out.println("Football.rules");
    }

    @Override
    public boolean isTeamSport() {
        return true;
    }
}
