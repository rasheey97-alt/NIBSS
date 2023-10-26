@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        // Implementation for creating a new transaction
        return transactionRepository.save(transaction);
    }

    public List<Transaction> getTransactions(String status, Long userId, LocalDateTime startDate, LocalDateTime endDate) {
        // Implementation for retrieving transactions based on criteria
        // ...
    }

    public void calculateAndSetCommission() {
        // Retrieve a list of successful transactions from the database
        List<Transaction> successfulTransactions = transactionRepository.findByStatus("SUCCESSFUL");

        // I Loop through each successful transaction
        for (Transaction transaction : successfulTransactions) {
            double transactionAmount = transaction.getAmount;

            // I Calculate the transaction fee with a cap of $100 (0.5% of the amount)
            double transactionFee = Math.min(transactionAmount * 0.005, 100);

            // I Calculate the commission, which is 20% of the transaction fee
            double commission = transactionFee * 0.2;

            //I  Update the transaction's properties with the calculated values
            transaction.setTransactionFee(transactionFee);
            transaction.setCommission(commission);
            transaction.setCommissionWorthy(true);

            // I Save the updated transaction in the database
            transactionRepository.save(transaction);
        }
    }
}
