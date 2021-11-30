package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max = 140)
    private String description;

    public Skill() {};

    public String getDescription() {
        return description;
    }
}