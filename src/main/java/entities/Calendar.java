package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Calendar {
    @Id
    @Column(name="id_calendar")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date;

    //Relations
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "Calendar")
    private List<Calendar> listdate;

}
