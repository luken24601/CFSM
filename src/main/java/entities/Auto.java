package entities;

import javax.persistence.*;

@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_auto;
    private String marka;
    private String model;
    private String typ;
    private int rocznik;
    private String nrRejstracyjny;


    @ManyToOne
    @JoinColumn(name = "id_klient")
    private Klient klient;



    @OneToOne(mappedBy = "folia")
    private Folia folia;

    public Auto(){}

    public Long getId_auto() {
        return id_auto;
    }

    public void setId_auto(Long id_auto) {
        this.id_auto = id_auto;
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

    public Folia getFolia() {
        return folia;
    }

    public void setFolia(Folia folia) {
        this.folia = folia;
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
                "klientId=" +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", typ='" + typ + '\'' +
                ", rocznik=" + rocznik +
                ", nrRejstracyjny='" + nrRejstracyjny + '\'' +
                ", klient=" + klient +
                '}';
    }
}
