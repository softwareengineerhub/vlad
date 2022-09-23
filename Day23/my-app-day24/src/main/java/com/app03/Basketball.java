package com.app03;

public class Basketball extends Sport {

    @Override
    public void describeRules() {
        System.out.println("Basketball.rules");
    }

    @Override
    public boolean isTeamSport() {
        return true;
    }
}
