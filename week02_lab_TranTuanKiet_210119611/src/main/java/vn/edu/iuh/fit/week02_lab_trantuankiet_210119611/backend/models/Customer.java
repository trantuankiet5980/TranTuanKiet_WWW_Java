package vn.edu.iuh.fit.week02_lab_trantuankiet_210119611.backend.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NamedQueries(
        {
                @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
                @NamedQuery(name = "Customer.findByPhone", query = "SELECT c FROM Customer c WHERE c.phone = :phone")
        }
)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long id;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "cust_name", length = 150)
    private String name;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "phone", length = 15)
    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

}