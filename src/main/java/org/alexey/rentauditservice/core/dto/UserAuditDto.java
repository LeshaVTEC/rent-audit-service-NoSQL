package org.alexey.rentauditservice.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.alexey.rentauditservice.core.entity.UserRole;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class UserAuditDto {

    @JsonProperty("uuid")
    private UUID userId;

    @JsonProperty("mail")
    private String email;

    private String fio;

    @JsonProperty("role")
    private UserRole userRole;
}
