package ir.digipay.digiwallet.repository;

import ir.digipay.digiwallet.model.Transaction;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;

public class TransactionRepositoryImpl implements TransactionRepository {
    Map<Long, Transaction> transactions = new HashMap<>();

    @Override
    public boolean add(Transaction transaction) throws IllegalArgumentException {
        // TODO: Implement
        if (transactions.containsKey(transaction.id)) {
            return false;
        }

        if (transaction.amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("illegal amount!");
        }

        transactions.put(transaction.id, transaction);
        return true;
    }

    @Override
    public List<Transaction> getAll() {
        // TODO: Implement
        return transactions.values().stream()

                //.sorted(Comparator.comparing(t-> t.createdAt))

                .sorted((t1, t2) -> {

                    if (t1.createdAt.after(t2.createdAt))
                        return 1;
                    if (t1.createdAt.before(t2.createdAt)) {
                        return -1;
                    }
                    return 0;

                })
                .toList();

    }

    @Override
    public Transaction get(Long id) {
        // TODO: Implement
        if (transactions.containsKey(id)) {
            return transactions.get(id);
        }
        return null;
    }

    @Override
    public List<Transaction> get(Predicate<Transaction> predicate) {
        // TODO: Implement
        return getAll().stream().filter(predicate).toList();
    }
}
