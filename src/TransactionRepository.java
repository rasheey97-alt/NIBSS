public class TransactionRepository {
    import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface TransactionRepository extends JpaRepository<Transaction, Long> {
        List<Transaction> findByStatus(String status);
        List<Transaction> findByUserId(Long userId);
        List<Transaction> findByDateCreatedBetween(LocalDateTime startDate, LocalDateTime endDate);
        // Additional query methods for specific criteria
    }

}
