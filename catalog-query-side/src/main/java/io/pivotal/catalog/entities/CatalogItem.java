package io.pivotal.catalog.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Entity;


@Entity
@Table(name = "CatalogItem")
public class CatalogItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    
    @Column(length=60)
    private String name;

    @Column
    private int type;
    
    @Column(length=100)
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
