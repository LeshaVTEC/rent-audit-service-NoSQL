package org.alexey.rentauditservice.repository;

import org.alexey.rentauditservice.core.entity.Audit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface AuditRepository extends MongoRepository<Audit, UUID> {

}
