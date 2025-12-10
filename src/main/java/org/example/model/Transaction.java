package org.example.model;

public class Transaction {
    public String transactionId;
    public String timestamp;
    public String location;
    public String type;
    public String channel;
    public String deviceId;
    public String sender;
    public String receiver;
    public String currency;
    public double amount;
    public String status;

    @Override
    public String toString() {
        return "Transaction Details:\n" +
                "Transaction ID : " + transactionId + "\n" +
                "Timestamp      : " + timestamp + "\n" +
                "Location       : " + location + "\n" +
                "Type           : " + type + "\n" +
                "Channel        : " + channel + "\n" +
                "Device ID      : " + deviceId + "\n" +
                "Sender         : " + sender + "\n" +
                "Receiver       : " + receiver + "\n" +
                "Currency       : " + currency + "\n" +
                "Amount         : " + String.format("%.2f", amount) + "\n" +
                "Status         : " + status + "\n";
    }
}
