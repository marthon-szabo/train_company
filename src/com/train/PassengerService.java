package com.train;

public class PassengerService extends Train {

    protected int minimumPassengersNumber;
    protected int maximumPassengersNumber;
    protected double ticketPrice;
    protected double onTrainTicketSurcharge;
    protected int chancePunishTravelers;

    protected double punishTravelers() {
        return 0.0;
    }

    protected double buyTicketsOnTrain() {
        return 0.0;
    }

    protected int simulateDailyPassengerNumber() {
        return 0;
    }
}
