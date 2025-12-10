package org.example.service;

import org.example.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private JdbcTemplate jdbc;

    public void saveTransaction(Transaction t) {
        String sql = "INSERT INTO transactions " +
                "(transaction_id, timestamp, location, type, channel, device_id, sender, receiver, currency, amount, status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbc.update(sql,
                t.transactionId,
                t.timestamp,
                t.location,
                t.type,
                t.channel,
                t.deviceId,
                t.sender,
                t.receiver,
                t.currency,
                t.amount,
                t.status
        );
    }

    // New method to get all transactions
    public List<Transaction> getAllTransactions() {
        String sql = "SELECT * FROM transactions";

        return jdbc.query(sql, new RowMapper<Transaction>() {
            @Override
            public Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
                Transaction t = new Transaction();
                t.transactionId = rs.getString("transaction_id");
                t.timestamp = rs.getString("timestamp");
                t.location = rs.getString("location");
                t.type = rs.getString("type");
                t.channel = rs.getString("channel");
                t.deviceId = rs.getString("device_id");
                t.sender = rs.getString("sender");
                t.receiver = rs.getString("receiver");
                t.currency = rs.getString("currency");
                t.amount = rs.getDouble("amount");
                t.status = rs.getString("status");
                return t;
            }
        });
    }
}
