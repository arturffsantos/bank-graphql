package com.bank.graphql.demo.resolver.bank.mutation;

import com.bank.graphql.demo.domain.bank.BankAccount;
import com.bank.graphql.demo.domain.bank.Currency;
import com.bank.graphql.demo.domain.bank.input.CreateBankAccountInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountMutation implements GraphQLMutationResolver {

    public BankAccount createBankAccount(CreateBankAccountInput input){
        log.info("Creating new account for {}", input);

        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.BRL)
                .build();
    }
}