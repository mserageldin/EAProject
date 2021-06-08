package cs.miu.cs544.team2.Repository;

import cs.miu.cs544.team2.Model.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface PersonnelRepo extends JpaRepository<Personnel,Integer> {
    Personnel findByEmailAddress(String email);
    boolean existsByEmailAddress(String email);
}
