package model;

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
public class Character implements Serializable{
    private String name;
    private String photo;
    private String cover;
    private String description;
    private Abilities abilities;
}
