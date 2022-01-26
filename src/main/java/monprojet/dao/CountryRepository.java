package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import monprojet.entity.Country;

// This will be AUTO IMPLEMENTED by Spring 
//

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
