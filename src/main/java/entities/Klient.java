package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_klient;
    private String imie;
    private String nazwisko;
    private int nrTel;
    private String email;

    //Relations

    @OneToMany(cascade ={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy="klient")
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

    public Klient(Long id_klient, String imie, String nazwisko, int nrTel, String email, List<Auto> autoList, Instalator instalator) {
        this.id_klient = id_klient;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTel = nrTel;
        this.email = email;
        this.autoList = autoList;
        this.instalator = instalator;
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

    public Long getId_klient() {
        return id_klient;
    }

    public void setId_klient(Long id_klient) {
        this.id_klient = id_klient;
    }

    public Instalator getInstalator() {
        return instalator;
    }

    public void setInstalator(Instalator instalator) {
        this.instalator = instalator;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id_klient=" + id_klient +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrTel=" + nrTel +
                ", email='" + email + '\'' +
                ", autoList=" + autoList +
                ", instalator=" + instalator +
                '}';
    }
}
