package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Instalator")
public class Instalator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_instalator")
    private Long id_instalator;
    @Column(name="inst_opinie")
    private String inst_opinie;
    @Column(name="inst_ocena")
    private String inst_ocena;
    @Column(name="inst_nazwa")
    private String inst_nazwa;
    @Column(name="inst_adres1")
    private String inst_adres1;
    @Column(name="inst_adres2")
    private String inst_adres2;
    @Column(name="inst_postalcode")
    private String inst_postalcode;

    //Relations
    @OneToOne
    @JoinColumn(name = "id_magazyn")
    private Magazyn magazyn;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "Instalator")
    private List<Klient> listaKlientow;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "Instalator")
    private List<Order> listOrder;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "Instalator")
    private List<Supplier> listSupplier;

    public Instalator() {
    }

    public Instalator(Long id_instalator, String inst_opinie, String inst_ocena, String inst_nazwa, String inst_adres1, String inst_adres2, String inst_postalcode) {
        this.id_instalator = id_instalator;
        this.inst_opinie = inst_opinie;
        this.inst_ocena = inst_ocena;
        this.inst_nazwa = inst_nazwa;
        this.inst_adres1 = inst_adres1;
        this.inst_adres2 = inst_adres2;
        this.inst_postalcode = inst_postalcode;
    }

    public Long getId_instalator() {
        return id_instalator;
    }

    public void setId_instalator(Long id_instalator) {
        this.id_instalator = id_instalator;
    }

    public String getInst_opinie() {
        return inst_opinie;
    }

    public void setInst_opinie(String inst_opinie) {
        this.inst_opinie = inst_opinie;
    }

    public String getInst_ocena() {
        return inst_ocena;
    }

    public void setInst_ocena(String inst_ocena) {
        this.inst_ocena = inst_ocena;
    }

    public String getInst_nazwa() {
        return inst_nazwa;
    }

    public void setInst_nazwa(String inst_nazwa) {
        this.inst_nazwa = inst_nazwa;
    }

    public String getInst_adres1() {
        return inst_adres1;
    }

    public void setInst_adres1(String inst_adres1) {
        this.inst_adres1 = inst_adres1;
    }

    public String getInst_adres2() {
        return inst_adres2;
    }

    public void setInst_adres2(String inst_adres2) {
        this.inst_adres2 = inst_adres2;
    }

    public String getInst_postalcode() {
        return inst_postalcode;
    }

    public void setInst_postalcode(String inst_postalcode) {
        this.inst_postalcode = inst_postalcode;
    }

    @Override
    public String toString() {
        return "Instalator{" +
                "id_instalator=" + id_instalator +
                ", inst_opinie='" + inst_opinie + '\'' +
                ", inst_ocena='" + inst_ocena + '\'' +
                ", inst_nazwa='" + inst_nazwa + '\'' +
                ", inst_adres1='" + inst_adres1 + '\'' +
                ", inst_adres2='" + inst_adres2 + '\'' +
                ", inst_postalcode='" + inst_postalcode + '\'' +
                '}';
    }
}
