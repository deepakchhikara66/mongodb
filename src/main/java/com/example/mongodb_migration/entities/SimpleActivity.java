package com.example.mongodb_migration.entities;

import com.sun.istack.internal.NotNull;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document("simple_activities")
@CompoundIndexes({
        @CompoundIndex(name = "compoundIndex", def = "{'accountId' : 1, 'orgIdentifier': 1, 'projectIdentifier' : 1, monitoredServiceIdentifier: 1, 'eventTime': 1, 'type': 1}")})
public class SimpleActivity {
    @Id
    private String uuid;
    @NotNull
    private String type;
    @NotNull private String accountId;
    String monitoredServiceIdentifier;
    @NotNull private String projectIdentifier;
    @NotNull private String orgIdentifier;
    private Instant eventTime;

    public SimpleActivity(Activity activity){
        accountId = activity.accountId;
        eventTime = activity.eventTime;
        type = activity.type;
        projectIdentifier = activity.projectIdentifier;
        orgIdentifier = activity.orgIdentifier;
        monitoredServiceIdentifier = activity.monitoredServiceIdentifier;
    }
}
