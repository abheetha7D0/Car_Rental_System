package lk.rental.repo;

import lk.rental.entity.ReturnDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnDetailsRepo extends JpaRepository<ReturnDetails, String> {
}
