@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        // I create a new transaction and save it to the database
        return transactionService.createTransaction(transaction);
    }

    @GetMapping
    public List<Transaction> getTransactions(@RequestParam(required = false) String status,
                                             @RequestParam(required = false) Long userId,
                                             @RequestParam(required = false) LocalDateTime startDate,
                                             @RequestParam(required = false) LocalDateTime endDate) {
        // I retrieve a list of transactions based on optional criteria
        // If 'status' is provided, I filter by status
        // If 'userId' is provided, I filter by user ID
        // If 'startDate' and 'endDate' are provided, I filter by date range
        // If no criteria are provided, I return all transactions
        return transactionService.getTransactions(status, userId, startDate, endDate);
    }
}
