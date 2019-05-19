package hello;

import javax.persistence.*;

@Entity
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public    Library(){}

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Place place;

    public Library(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    @Override
    public  String toString(){
        return String.format("Library id=%d, name=%n", id,name);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }
}
