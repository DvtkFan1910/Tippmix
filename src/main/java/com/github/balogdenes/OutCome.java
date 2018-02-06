package com.github.balogdenes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OutCome {
    @JsonProperty("fixedOdds")
    private double odds;

    public double getOdds() { return odds; }

    public void setOdds(double odds) {
        this.odds = odds;
    }

    public String toString() {
        return "OutCome [ odds: "+ odds + "]";
    }

}

