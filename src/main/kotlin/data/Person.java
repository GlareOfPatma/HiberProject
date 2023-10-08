package data;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;
import java.util.List;


@XmlRootElement(namespace = "test")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "persons", schema = "public")
public class Person {
    @Id
    @Column(name = "id", nullable = false, unique = true, length = 11)
    private int id;

    @Column(name = "surname")
    private String surname;
    @Column(name = "nameMain")
    private String name;
    @Column(name = "secondName")
    private String secondName;
    @Column(name = "age")
    private int age;
    @Column(name = "driverLicense")
    private boolean driverLicense;
    @Column(name = "debt")
    private BigInteger debt;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "personId")
    private List<Account> accounts;

    public Person() {
    }

    public Person(int id, String surname, String name, String secondName, int age, boolean driverLicense, BigInteger debt) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.driverLicense = driverLicense;
        this.debt = debt;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public BigInteger getDebt() {
        return debt;
    }

    public void setDebt(BigInteger debt) {
        this.debt = debt;
    }
}
