package com.bank.graphql.demo.domain;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class BankAccount {
    UUID id;
    Currency currency;
}
