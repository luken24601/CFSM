package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Magazyn {
    @Id
    @Column(name="id_magazyn")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_magazyn;
    @Column(name = "stan")
    private int stan;
    @Column(name = "folia_nazwa")
    private String folia_nazwa;

    public Magazyn() {
    }

    //Relations
    @OneToOne (mappedBy = "Instalator")//one mag, one inst
    private Instalator instalator;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "Auto")//one mag, many windowfilms
    private List<Folia> listFolia;



    public Magazyn(Long id_magazyn, int stan, String folia_nazwa) {
        this.id_magazyn = id_magazyn;
        this.stan = stan;
        this.folia_nazwa = folia_nazwa;
    }

    public Long getId_magazyn() {
        return id_magazyn;
    }

    public void setId_magazyn(Long id_magazyn) {
        this.id_magazyn = id_magazyn;
    }

    public int getStan() {
        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public String getFolia_nazwa() {
        return folia_nazwa;
    }

    public void setFolia_nazwa(String folia_nazwa) {
        this.folia_nazwa = folia_nazwa;
    }

    @Override
    public String toString() {
        return "Magazyn{" +
                "id_magazyn=" + id_magazyn +
                ", stan=" + stan +
                ", folia_nazwa='" + folia_nazwa + '\'' +
                '}';
    }
}
