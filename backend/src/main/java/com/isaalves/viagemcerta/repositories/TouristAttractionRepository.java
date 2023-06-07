package com.isaalves.viagemcerta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaalves.viagemcerta.entities.TouristAttraction;

@Repository
public interface TouristAttractionRepository extends JpaRepository<TouristAttraction, Long> {

}
