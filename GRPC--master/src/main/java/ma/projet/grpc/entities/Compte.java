package ma.projet.grpc.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;

@Getter
@Entity
public class Compte {
    @Id
    @GeneratedValue  (strategy = GenerationType.AUTO)
    private String id;
    private float solde;
    private String dateCreation;
    private String type;

    public void setId(String id) {this.id = id;}

    public void setSolde (float solde) {this.solde=solde; }

    public void setDateCreation (String dateCreation) {this.dateCreation = dateCreation; }

    public void setType (String type) {this.type=type; }
}