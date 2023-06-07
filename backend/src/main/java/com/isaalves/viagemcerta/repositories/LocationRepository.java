package com.isaalves.viagemcerta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaalves.viagemcerta.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
