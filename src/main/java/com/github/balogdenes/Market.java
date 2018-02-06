package com.github.balogdenes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties({"outcomeCount","marketId","marketName","marketType","marketStatus","channelWeb","channelRetailer","marketVersion","marketSubType","minCombiCount","maxCombiCount","marketTypePriority","marketTypeCCGroups","mainMarket","specialOddsValue","winnerOutcomeName","marketClosedCombinations"})
public class Market {
    private int marketRealNo;
    @JsonIgnoreProperties({ "outcomeNo", "outcomeName","outcomeRealNo","outcomeResult"})
    private List<OutCome> outcomes = new ArrayList<>();

    public int getMarketRealNo() {
        return marketRealNo;
    }

    public void setMarketRealNo(int marketRealNo) {
        this.marketRealNo = marketRealNo;
    }

    public List<OutCome> getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(List<OutCome> outcomes) {
        this.outcomes = outcomes;
    }

    @Override
    public String toString() {
        return "Market{" +
                "marketRealNo=" + marketRealNo +
                ", outcomes=" + outcomes +
                '}';
    }
}
