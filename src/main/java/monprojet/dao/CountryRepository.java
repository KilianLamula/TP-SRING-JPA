package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import monprojet.entity.Country;
import java.util.List;

// This will be AUTO IMPLEMENTED by Spring 
//

public interface CountryRepository extends JpaRepository<Country, Integer> {
    
    //Première méthode :
    @Query(value = "SELECT SUM(CITY.POPULATION) "
            + "FROM CITY "
            + "WHERE CITY.COUNTRY_ID = :id_country", nativeQuery = true)
    public Integer populationCountry(int id_country);

    //Seconde méthode :
    @Query(value = "SELECT COUNTRY.NAME as nom, SUM(CITY.POPULATION) as population "
    + "FROM COUNTRY INNER JOIN CITY ON COUNTRY.ID = CITY.ID "
    + "GROUP BY COUNRTY.NAME", nativeQuery = true)
    public List<PopulationParCountry> populationParCountry();
}
