package com.bank.graphql.demo.resolver;

import com.bank.graphql.demo.domain.BankAccount;
import com.bank.graphql.demo.domain.Client;
import graphql.kickstart.tools.GraphQLResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Slf4j
@Component
public class ClientResolver implements GraphQLResolver<BankAccount> {

    public Client client(BankAccount account){
        log.info("Retrieving client info");

        return Client.builder()
                .id(UUID.randomUUID())
                .firstName("John")
                .middleNames(List.of("Smith"))
                .lastName("Doe")
                .build();
    }
}
