package entities;

import javax.persistence.*;

@Entity
@Table(name = "Auto")
public class Auto {
    @Id
    @Column(name="id_auto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long klientId;
    @Column(name="marka")
    private String marka;
    @Column(name="model")
    private String model;
    @Column(name="typ")
    private String typ;
    @Column(name="rocznik")
    private int rocznik;
    @Column(name="nrRejstracyjny")
    private String nrRejstracyjny;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_klient")

    @OneToOne

    private Klient klient;

    public Auto(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public String getNrRejstracyjny() {
        return nrRejstracyjny;
    }

    public void setNrRejstracyjny(String nrRejstracyjny) {
        this.nrRejstracyjny = nrRejstracyjny;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Long getKlientId() {
        return klientId;
    }

    public void setKlientId(Long klientId) {
        this.klientId = klientId;
    }

    public Auto(String marka, String model, String typ, int rocznik, String nrRejstracyjny) {
        this.marka = marka;
        this.model = model;
        this.typ = typ;
        this.rocznik = rocznik;
        this.nrRejstracyjny = nrRejstracyjny;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "klientId=" + klientId +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", typ='" + typ + '\'' +
                ", rocznik=" + rocznik +
                ", nrRejstracyjny='" + nrRejstracyjny + '\'' +
                ", klient=" + klient +
                '}';
    }
}
