package model;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@Accessors(fluent = true)
public class Abilities  implements Serializable {
    private String accelerate;
    private String steer;
    private String brake;
    private String reverse;
    private String lookBehind;
    private  String drift;
}
