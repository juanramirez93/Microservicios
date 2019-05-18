package com.ramper.multiplier.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ramper.multiplier.domain.MultiplicationResultAttempt;

public interface MultiplicationResultAttemptRepository extends CrudRepository<MultiplicationResultAttempt, Long> {

    List<MultiplicationResultAttempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);
}
