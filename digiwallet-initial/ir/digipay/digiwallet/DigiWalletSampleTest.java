package ir.digipay.digiwallet;

import ir.digipay.digiwallet.model.*;
import ir.digipay.digiwallet.repository.*;
import java.math.BigDecimal;
import java.util.*;


public class DigiWalletSampleTest {
    public void testTransactionRepositoryAdd() {
        TransactionRepository transactionRepository = new TransactionRepositoryImpl();
        Wallet wallet = new Wallet("a-b-c");
        List<Transaction> transactions = new ArrayList<>();
        Date createdAt = new Date();
        for (int i = 1; i <= 5; i++) {
            transactions.add(
                    new Transaction(i, wallet, TransactionType.DEPOSIT, BigDecimal.valueOf(i * 1000), createdAt)
            );
        }

        for (Transaction transaction : transactions) {
            //assertTrue(transactionRepository.add(transaction));
        }

        for (Transaction transaction : transactions) {
            //assertFalse(transactionRepository.add(transaction));

        }
    }
}
