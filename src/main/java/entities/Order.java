package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_order;
    private String nazwa;
    private Date data_order;
    private Date data_install;
    private Long id_klient;
    private Long id_auto;

    //Relations
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "auto")
    // one order, many cars
    private List<Auto> listAuto;

    @ManyToOne // one instalator many orders
    @JoinColumn(name = "id_instalator")
    private Instalator instalator;

    @ManyToOne // one callendsar many orders
    @JoinColumn(name = "id_callendar")
    private Calendar calendar;

    public Order() {

    }

    public Order(Long id_order, String nazwa, Date data_order, Date data_install, Long id_klient, Long id_auto, List<Auto> listAuto, Instalator instalator, Calendar calendar) {
        this.id_order = id_order;
        this.nazwa = nazwa;
        this.data_order = data_order;
        this.data_install = data_install;
        this.id_klient = id_klient;
        this.id_auto = id_auto;
        this.listAuto = listAuto;
        this.instalator = instalator;
        this.calendar = calendar;
    }

    public Long getId_order() {
        return id_order;
    }

    public void setId_order(Long id_order) {
        this.id_order = id_order;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Date getData_order() {
        return data_order;
    }

    public void setData_order(Date data_order) {
        this.data_order = data_order;
    }

    public Date getData_install() {
        return data_install;
    }

    public void setData_install(Date data_install) {
        this.data_install = data_install;
    }

    public Long getId_klient() {
        return id_klient;
    }

    public void setId_klient(Long id_klient) {
        this.id_klient = id_klient;
    }

    public Long getId_auto() {
        return id_auto;
    }

    public void setId_auto(Long id_auto) {
        this.id_auto = id_auto;
    }

    public List<Auto> getListAuto() {
        return listAuto;
    }

    public void setListAuto(List<Auto> listAuto) {
        this.listAuto = listAuto;
    }

    public Instalator getInstalator() {
        return instalator;
    }

    public void setInstalator(Instalator instalator) {
        this.instalator = instalator;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id_order=" + id_order +
                ", nazwa='" + nazwa + '\'' +
                ", data_order=" + data_order +
                ", data_install=" + data_install +
                ", id_klient=" + id_klient +
                ", id_auto=" + id_auto +
                '}';
    }
}

