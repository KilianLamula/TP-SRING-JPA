package monprojet.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.Proxy;

import lombok.*;

// Un exemple d'entit�
// On utilise Lombok pour auto-g�n�rer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Proxy(lazy = false)
@Entity // Une entit� JPA
public class Country {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String code;
    
    @Column(unique=true)
    @NonNull
    private String name;
    
    @OneToMany(mappedBy="country")
    // Lombok https://www.projectlombok.org/features/ToString
    @ToString.Exclude // On ne veut pas inclure la liste des villes dans le toString
    // Sinon r�cursivit� infinie 
    private List<City> cities = new LinkedList<>();
}
