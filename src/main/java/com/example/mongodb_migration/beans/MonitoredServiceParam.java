package com.example.mongodb_migration.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MonitoredServiceParam {
     String accountId;
     String monitoredServiceIdentifier;
     String projectIdentifier;
     String orgIdentifier;
}
