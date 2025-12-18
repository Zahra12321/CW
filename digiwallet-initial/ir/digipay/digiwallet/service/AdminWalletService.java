package ir.digipay.digiwallet.service;

import ir.digipay.digiwallet.model.Transaction;
import ir.digipay.digiwallet.repository.TransactionRepository;

import java.util.List;
import java.util.function.Predicate;

public class AdminWalletService extends WalletService {

    public AdminWalletService(TransactionRepository transactionRepository) {
        super(transactionRepository);
    }

    public List<Transaction> getTransactions(Predicate<Transaction> predicate) {
        // TODO: Implement
        return transactionRepository.get(predicate);
    }

    public List<Transaction> getAllTransactions() {
        // TODO: Implement
        return transactionRepository.getAll();
    }
}
