package data;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


@XmlRootElement(namespace = "test")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "accounts")
public class Account {
    public Account() {
    }

    @Id
    @Column(name = "accountNumber", nullable = false, unique = true)
    private String accountNumber;
    @Column(name = "openingDate")
    private Date openingDate;

    @Column(name = "fullName")
    private String fullName;
    @Column(name = "balance")
    private BigInteger currentBalance;

    public Account(String accountNumber,
                   //int personid,
                   Date openingDate, String fullName, BigInteger currentBalance) {
        this.accountNumber = accountNumber;
        //this.personid = personid;
        this.openingDate = openingDate;
        this.fullName = fullName;
        this.currentBalance = currentBalance;
    }
//    public int getPersonid() {return personid;}
//    public void setPersonid(int personid) {this.personid = personid;}
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigInteger getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigInteger currentBalance) {
        this.currentBalance = currentBalance;
    }
}
