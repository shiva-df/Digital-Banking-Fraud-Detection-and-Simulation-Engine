package org.example.service;

import org.example.model.Transaction;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

public class SimpleTransactionGenerator {

    private static final Random random = new Random();
    private static final String[] types = {"UPI", "CARD", "ATM"};
    private static final String[] channels = {"MOBILE", "WEB", "ATM"};
    private static final String[] statusList = {"SUCCESS", "FAILED"};
    private static final String[] currencies = {"INR", "USD", "EUR"};
    private static final String[] locations = {"Delhi", "New York", "London", "Tokyo"};

    public static Transaction generateTransaction() {
        Transaction t = new Transaction();
        t.transactionId = UUID.randomUUID().toString();
        t.timestamp = LocalDateTime.now().toString();
        t.location = locations[random.nextInt(locations.length)];
        t.type = types[random.nextInt(types.length)];
        t.channel = channels[random.nextInt(channels.length)];
        t.deviceId = "DEV" + (1000 + random.nextInt(9000));
        t.sender = "ACC" + (1000 + random.nextInt(9000));
        t.receiver = "ACC" + (1000 + random.nextInt(9000));
        t.currency = currencies[random.nextInt(currencies.length)];
        t.amount = 50 + (5000 * random.nextDouble());
        t.status = statusList[random.nextInt(statusList.length)];
        return t;
    }
}
