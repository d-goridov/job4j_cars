package ru.job4j.cars.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "auto_post")
public class Post {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "created")
    private LocalDateTime created;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "auto_post_id")
    private List<PriceHistory> priceHistories = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "auto_user_id")
    private User user;
}
