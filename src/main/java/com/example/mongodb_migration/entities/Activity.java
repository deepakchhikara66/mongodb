package com.example.mongodb_migration.entities;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("activities")
@Builder
@CompoundIndexes({
        @CompoundIndex(name = "compoundIndex", def = "{'accountId' : 1, 'orgIdentifier': 1, 'projectIdentifier' : 1, monitoredServiceIdentifier: 1, 'eventTime': 1, 'type': 1}")})
public class Activity {
    @Id String uuid;
    @NotNull
    String type;
    @NotNull String accountId;
    String monitoredServiceIdentifier;
    @NotNull  String projectIdentifier;
    @NotNull String orgIdentifier;
    Instant eventTime;
    String newYaml;
    String oldYaml;

}