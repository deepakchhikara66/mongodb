package com.example.mongodb_migration.entities;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("activities")
@Builder
@CompoundIndex(name = "compoundIndexActivity", def = "{'accountId' : 1, 'orgIdentifier': 1, 'projectIdentifier' : 1, monitoredServiceIdentifier: 1, 'eventTime': 1, 'type': 1}")
public class Activity {
    @Id String uuid;
    String type;
    String accountId;
    String monitoredServiceIdentifier;
    String projectIdentifier;
    String orgIdentifier;
    Instant eventTime;
    String newYaml;
    String oldYaml;

}