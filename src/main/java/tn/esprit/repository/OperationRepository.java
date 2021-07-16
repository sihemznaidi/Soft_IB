package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Operation;

@Repository
public interface OperationRepository extends CrudRepository<Operation, Integer>{

}
