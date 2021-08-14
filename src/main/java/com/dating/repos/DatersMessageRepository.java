package com.dating.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dating.model.DatersMessage;

@Repository
public interface DatersMessageRepository extends CrudRepository<DatersMessage, Integer> {

}
