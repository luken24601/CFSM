package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Klient")
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_klient")
    private Long id;
    @Column(name="imie")
    private String imie;
    @Column(name="nazwisko")
    private String nazwisko;
    @Column(name="nrTel")
    private int nrTel;
    @Column(name="email")
    private String email;

    //Relations

    @OneToMany(cascade ={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy="Klient")
    private List<Auto> autoList;

    @ManyToOne
    @JoinColumn(name = "id_instalator")
    private Instalator instalator;

    public List<Auto> getAutoList() {
        return autoList;
    }


    public void setAutoList(List<Auto> autoList) {
        this.autoList = autoList;
    }

    public Klient(){}

    public void addauto(Auto auto){
        if(null==autoList){
            autoList=new ArrayList<Auto>();
        }autoList.add(auto);
    }
    public Klient(String imie, String nazwisko, int nrTel, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTel = nrTel;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNrTel() {
        return nrTel;
    }

    public void setNrTel(int nrTel) {
        this.nrTel = nrTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrTel=" + nrTel +
                ", email='" + email + '\'' +
                ", autoList=" + autoList +
                ", instalator=" + instalator +
                '}';
    }
}
