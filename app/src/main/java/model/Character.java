package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Getter
@Setter
@Accessors(fluent = true)
public class Character {

    private String name;
    private String photo;
    private String cover;
    private String description;
    private Abilities abilities;
}
