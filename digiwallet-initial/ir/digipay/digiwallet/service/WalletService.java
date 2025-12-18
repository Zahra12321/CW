package ir.digipay.digiwallet.service;

import ir.digipay.digiwallet.model.*;
import ir.digipay.digiwallet.repository.TransactionRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class WalletService {
    protected final TransactionRepository transactionRepository;

    public WalletService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public boolean addTransaction(Transaction transaction) throws IllegalArgumentException {
        // TODO: Implement

        return transactionRepository.add(transaction);
    }

    public List<Transaction> getTransactions(Wallet wallet) {
        // TODO: Implement
        return transactionRepository.get(t -> Objects.equals(t.wallet.id, wallet.id));
    }

    public List<Transaction> getTransactions(Wallet wallet, Predicate<Transaction> predicate) {
        // TODO: Implement
        return getTransactions(wallet).stream().filter(predicate).toList();
    }

    public BigDecimal getBalance(Wallet wallet) {
        // TODO: Implement
        //BigDecimal balance = BigDecimal.valueOf(0);

        return getTransactions(wallet).stream()
                .map(t -> t.type == TransactionType.DEPOSIT ? t.amount : t.amount.negate())
                .reduce(BigDecimal.ZERO, BigDecimal::add);


        //.reduce(BigDecimal.ZERO,(b1, b2) -> b1.add(b2));

        //ravesh 1
        /* .reduce(
                        BigDecimal::add
                       // a1.add(a2)
                ).get();*/

        // my thought
        /*return getTransactions(wallet).stream().reduce((t1,t2) -> {
                    if (t.type.equals(TransactionType.DEPOSIT)) {
                        balance.add(t.amount);
                    }else {
                        balance.subtract(t.amount);
                    }

                    return t;
                }
        );*/
    }

    public boolean setTransactionStatus(Transaction transaction, TransactionStatus status) {
        // TODO: Implement

        if (transaction.getStatus() != TransactionStatus.PENDING || status == TransactionStatus.PENDING)
            return false;
        if (transaction.type == TransactionType.WITHDRAWAL && transaction.amount.compareTo(getBalance(transaction.wallet)) > 0) {
            throw new  IllegalArgumentException("Insufficient balance!");
        }
        transaction.setStatus(status);
        return true;
    }
}
