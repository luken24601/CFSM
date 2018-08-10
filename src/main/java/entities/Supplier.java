package entities;

import javax.persistence.*;

@Entity
public class Supplier {

    @Id
    @Column(name="id_supplier")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_supplier;
    @Column(name="nazwa")
    private String nazwa;
    @Column(name="sup_adres1")
    private String sup_adres1;
    @Column(name="sup_adres2")
    private String sup_adres2;
    @Column(name="sup_postalcode")
    private String sup_postalcode;

    public Supplier() {
    }

    @OneToOne(mappedBy = "Folia") //folia
    private Folia folia;


    @ManyToOne //instalator może mieć kilku dostawców folii
    @JoinColumn(name = "id_instalator")
    private Instalator instalator;


    public Supplier(Long id_supplier, String nazwa, String sup_adres1, String sup_adres2, String sup_postalcode) {
        this.id_supplier = id_supplier;
        this.nazwa = nazwa;
        this.sup_adres1 = sup_adres1;
        this.sup_adres2 = sup_adres2;
        this.sup_postalcode = sup_postalcode;
    }

    public Long getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Long id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getSup_adres1() {
        return sup_adres1;
    }

    public void setSup_adres1(String sup_adres1) {
        this.sup_adres1 = sup_adres1;
    }

    public String getSup_adres2() {
        return sup_adres2;
    }

    public void setSup_adres2(String sup_adres2) {
        this.sup_adres2 = sup_adres2;
    }

    public String getSup_postalcode() {
        return sup_postalcode;
    }

    public void setSup_postalcode(String sup_postalcode) {
        this.sup_postalcode = sup_postalcode;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id_supplier=" + id_supplier +
                ", nazwa='" + nazwa + '\'' +
                ", sup_adres1='" + sup_adres1 + '\'' +
                ", sup_adres2='" + sup_adres2 + '\'' +
                ", sup_postalcode='" + sup_postalcode + '\'' +
                '}';
    }
}
