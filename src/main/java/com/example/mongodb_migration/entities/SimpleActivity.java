package com.example.mongodb_migration.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
@Data
@Document(collection = "simple_activities")
@CompoundIndex(name = "compoundIndex", def = "{'accountId' : 1, 'orgIdentifier': 1, 'projectIdentifier' : 1, monitoredServiceIdentifier: 1, 'eventTime': 1, 'type': 1}")
public class SimpleActivity {
    @Id
    private String uuid;
    private String type;
    private String accountId;
    String monitoredServiceIdentifier;
    private String projectIdentifier;
    private String orgIdentifier;
    private Instant eventTime;

    public SimpleActivity(Activity activity){
        this.accountId = activity.accountId;
        eventTime = activity.eventTime;
        this.type = activity.type;
        this.projectIdentifier = activity.projectIdentifier;
        this.orgIdentifier = activity.orgIdentifier;
        this.monitoredServiceIdentifier = activity.monitoredServiceIdentifier;
    }
}
