package com.dating.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dating.model.Dater;

@Repository
public interface DaterRepository extends CrudRepository<Dater, Integer> {

}
