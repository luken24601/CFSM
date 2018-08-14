package entities;

import javax.persistence.*;

@Entity
public class Folia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_folia;
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

    public Long getId_folia() {
        return id_folia;
    }

    public void setId_folia(Long id_folia) {
        this.id_folia = id_folia;
    }

    @Override
    public String toString() {
        return "Folia{" +
                "id_folia=" + id_folia +
                ", supplier=" + supplier +
                ", auto=" + auto +
                '}';
    }
}
