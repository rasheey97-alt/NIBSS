import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transactionReference;
    private double amount;
    private double transactionFee;
    private double billedAmount;
    private String description;
    private LocalDateTime dateCreated;
    private String status;
    private boolean commissionWorthy;
    private double commission;

    // Constructors
    public Transaction() {
        // Default constructor - used for JPA
    }

    public Transaction(String transactionReference, double amount, double transactionFee, double billedAmount,
                       String description, LocalDateTime dateCreated, String status, boolean commissionWorthy, double commission) {
        this.transactionReference = transactionReference;
        this.amount = amount;
        this.transactionFee = transactionFee;
        this.billedAmount = billedAmount;
        this.description = description;
        this.dateCreated = dateCreated;
        this.status = status;
        this.commissionWorthy = commissionWorthy;
        this.commission = commission;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getBilledAmount() {
        return billedAmount;
    }

    public void setBilledAmount(double billedAmount) {
        this.billedAmount = billedAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCommissionWorthy() {
        return commissionWorthy;
    }

    public void setCommissionWorthy(boolean commissionWorthy) {
        this.commissionWorthy = commissionWorthy;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
