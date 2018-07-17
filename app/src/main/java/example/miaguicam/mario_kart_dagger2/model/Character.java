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
public class Character implements Serializable {
    private String id;
    private String name;
    private int photo;
    private int cover;
    private String description;
    private Abilities abilities;
}
