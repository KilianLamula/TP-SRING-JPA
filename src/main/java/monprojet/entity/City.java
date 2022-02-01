/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monprojet.entity;
import javax.persistence.*;
import lombok.*;
import monprojet.entity.Country;

// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
/**
 *
 * @author lamul
 */
public class City {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String name;
    
    @Column(unique=true)
    @NonNull
    private int population;
    
    @NonNull
    @ManyToOne(optional = false) //obligatoire car clé étrangère non nulle
    private Country country;
}
