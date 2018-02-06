package com.github.balogdenes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties({"eventId","eventVersion","bettingStatus","betradarId","competitionGroupId","isLive","isOutright","bettingPhase","hasVisiblePrematchMarket","remainingPrematchMarketCount","hasVisibleLiveMarket","remainingLiveMarketCount","eventParticipants","competitionClosedCombinations","eventClosedCombinations","liveStreamAvailable","liveStreamEventId"})
public class Event {
    private String eventName;
    private String eventDate;
    private int sportId;
    private String sportName;
    private int competitionId;
    private String competitionName;
    private String competitionGroupName;
    private List<Market> markets = new ArrayList<>();

    public Event() {
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(int competitionId) {
        this.competitionId = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCompetitionGroupName() {
        return competitionGroupName;
    }

    public void setCompetitionGroupName(String competitionGroupName) {
        this.competitionGroupName = competitionGroupName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", sportId=" + sportId +
                ", sportName='" + sportName + '\'' +
                ", competitionId=" + competitionId +
                ", competitionName='" + competitionName + '\'' +
                ", competitionGroupName='" + competitionGroupName + '\'' +
                ", markets=" + markets +
                '}';
    }
}
