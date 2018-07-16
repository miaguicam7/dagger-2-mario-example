package example.miaguicam.mario_kart_dagger2.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Builder
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
