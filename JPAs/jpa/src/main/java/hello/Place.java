package hello;

import javax.persistence.*;

@Entity
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String geoCode;

    @OneToOne(mappedBy = "place")
    private Library library;


    public  Place(){}
    public Place(String geoCode) {
        this.geoCode = geoCode;
    }

    public Integer getId() {
        return id;
    }

    public String getGeoCode() {
        return geoCode;
    }

    public Library getLibrary() {
        return library;
    }
}
