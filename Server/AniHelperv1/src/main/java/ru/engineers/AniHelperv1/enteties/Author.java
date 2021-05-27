package ru.engineers.AniHelperv1.enteties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    private int Id;

    public int getId() {
        return this.Id;
    }

    @Column(name="name")
    private String name;

    public String getName() {
        return this.name;
    }

    @ManyToMany
    @JoinTable(
            name = "authorroles",
            joinColumns = @JoinColumn(name = "authorid"),
            inverseJoinColumns = @JoinColumn(name = "roleid"))
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
