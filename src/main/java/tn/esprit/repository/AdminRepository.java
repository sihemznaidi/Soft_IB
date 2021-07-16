package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entity.Admin;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

}
