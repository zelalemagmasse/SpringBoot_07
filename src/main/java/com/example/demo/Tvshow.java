package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Tvshow {
    @NotNull
    @Min(1)
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;

    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @NotNull
    @Size (min=3, max=20)
    private String name;

    @NotNull
    @Size(min=3,max=10)
    private String type;

    @NotNull
    @Size(min=10,max=30)
    private String description;
}
