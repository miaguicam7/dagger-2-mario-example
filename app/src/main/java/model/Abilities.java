package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@Accessors(fluent = true)
public class Abilities {
    private String accelerate;
    private String steer;
    private String brake;
    private String reverse;
    private String lookBehind;
    private  String drift;
}
