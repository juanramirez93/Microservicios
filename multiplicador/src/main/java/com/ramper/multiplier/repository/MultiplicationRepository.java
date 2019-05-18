package com.ramper.multiplier.repository;

import org.springframework.data.repository.CrudRepository;

import com.ramper.multiplier.domain.Multiplication;

public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {

}
