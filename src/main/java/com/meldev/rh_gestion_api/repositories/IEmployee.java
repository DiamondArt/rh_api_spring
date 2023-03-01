package com.meldev.rh_gestion_api.repositories;

import com.meldev.rh_gestion_api.models.Employees;
import org.springframework.data.repository.CrudRepository;

public interface IEmployee extends CrudRepository<Employees,String> {

}
