
package ma.projet.grpc.repo;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, Long> {
    @Query("SELECT c FROM Compte c WHERE c.type = :type")
    List<Compte> findByType(TypeCompte type);
}
