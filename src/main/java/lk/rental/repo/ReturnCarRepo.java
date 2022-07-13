package lk.rental.repo;

import lk.rental.entity.ReturnCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnCarRepo extends JpaRepository<ReturnCar, String> {
}
