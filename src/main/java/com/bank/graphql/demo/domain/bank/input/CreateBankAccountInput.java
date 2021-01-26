package com.bank.graphql.demo.domain.bank.input;

import lombok.Data;

@Data
public class CreateBankAccountInput {
    String firstName;
    int age;
}
