package esprit.canditature.Repository;

import esprit.canditature.entity.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatureRepository extends JpaRepository<Candidature, Integer> {
}
