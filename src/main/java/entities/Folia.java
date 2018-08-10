package entities;

import javax.persistence.*;

@Entity
public class Folia {
    @Id
    @Column(name="id_folia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    // nazwa i stan są powtórzone w magazynie

    @OneToOne
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;

    @OneToOne
    @JoinColumn(name = "id_auto")
    private Auto auto;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    Folia(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
