package com.ramper.multiplier.service;

import java.util.List;

import com.ramper.multiplier.domain.Multiplication;
import com.ramper.multiplier.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();

    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

    List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);

}
