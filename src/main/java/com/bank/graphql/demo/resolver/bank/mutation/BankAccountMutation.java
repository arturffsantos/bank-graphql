package com.bank.graphql.demo.resolver.bank.mutation;

import com.bank.graphql.demo.domain.bank.BankAccount;
import com.bank.graphql.demo.domain.bank.Currency;
import com.bank.graphql.demo.domain.bank.input.CreateBankAccountInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class BankAccountMutation implements GraphQLMutationResolver {

    private final Clock clock;

    public BankAccount createBankAccount(CreateBankAccountInput input){
        log.info("Creating new account for {}", input);

        return BankAccount.builder()
                .id(UUID.randomUUID())
                .currency(Currency.BRL)
                .createdAt(ZonedDateTime.now(clock))
                .createdOn(LocalDate.now(clock))
                .build();
    }
}
