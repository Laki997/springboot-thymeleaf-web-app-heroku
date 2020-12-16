package sport.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import sport.entity.Footballer;

public interface FootballerDAO extends JpaRepository<Footballer, Integer> {

}
