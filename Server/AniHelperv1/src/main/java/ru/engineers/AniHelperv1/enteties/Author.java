package ru.engineers.AniHelperv1.enteties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    private int Id;

    @Column(name="name")
    public String name;

    @OneToMany(mappedBy="authorid")
    public List<AuthorRole> roles;

//    @ManyToMany(mappedBy="authors")
//    public List<Anime> animes;
}