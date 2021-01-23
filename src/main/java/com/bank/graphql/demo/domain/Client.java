package com.bank.graphql.demo.domain;

import lombok.Builder;
import lombok.Value;

import java.util.List;
import java.util.UUID;

@Builder
@Value
public class Client {
    UUID id;
    String firstName;
    List<String> middleNames;
    String lastName;
}
