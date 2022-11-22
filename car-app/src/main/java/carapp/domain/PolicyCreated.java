package carapp.domain;

import carapp.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class PolicyCreated extends AbstractEvent {

    private Long id;
    private String policyId;
    private String carId;
}
