package esprit.canditature.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Candidature {
    @Id
    @GeneratedValue
    int id;
    int idJob;
    int idCandidate;
    @Enumerated
    Statut statut ;
    String motivation ;

}
