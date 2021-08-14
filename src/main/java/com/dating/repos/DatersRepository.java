package com.dating.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dating.model.Daters;

@Repository
public interface DatersRepository  extends CrudRepository<Daters, Integer>{

}
