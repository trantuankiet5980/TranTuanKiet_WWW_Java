package vn.edu.iuh.fit.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "experience")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ex_id", nullable = false)
    private long id;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "from_date", nullable = false)
    private LocalDate fromDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "can_id", nullable = false)
    private Candidate candidate;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "work_desc", length = 2000)
    private String workDescription;
}
