package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Credit;

@Repository
public interface CreditRepository extends CrudRepository<Credit, Integer> {

}
