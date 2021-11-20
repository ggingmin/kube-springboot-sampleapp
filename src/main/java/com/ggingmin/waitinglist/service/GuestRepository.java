package com.ggingmin.waitinglist.service;

import com.ggingmin.waitinglist.domain.Guest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends MongoRepository<Guest, String> {


}
