package br.com.rfmp.springdatajpa.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(name="enrollment_id", nullable=false, unique=true)
    private String enrollmentId;

    public Student() {}
    public Student(String name, String enrollmentId) {
        this.name = name;
        this.enrollmentId = enrollmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enrollmentId);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return Objects.equals(enrollmentId, other.enrollmentId);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", enrollmentId=" + enrollmentId + "]";
    }
}
