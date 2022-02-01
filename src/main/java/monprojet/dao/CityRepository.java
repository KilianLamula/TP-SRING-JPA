/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monprojet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import monprojet.entity.City;

public interface CityRepository extends JpaRepository<City, Integer> {

    /**
     * Trouve une ville par son nom.
     * Cette méthode sera automatiquement implémentée par Spring Data JPA.
     * @param cityName
     * @return La ville correspondant au nom fourni, ou null si pas trouvé.
     */
    public City findByName(String cityName);

}
