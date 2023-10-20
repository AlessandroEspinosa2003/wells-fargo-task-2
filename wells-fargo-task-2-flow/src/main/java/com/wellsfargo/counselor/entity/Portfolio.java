package com.wellsfargo.counselor.entity;

import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private double riskFactor;

    @Column(nullable = false)
    private double total; 

    @ManyToOne
    @JoinColumn(nullable = false, name = "clientID")
    private List<Security> security;    

    protected Portfolio()
    {

    }

    public Portfolio(String firstName, String lastName, double total, double riskFactor, List<Security> security)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.total = total;
        this.riskFactor = riskFactor;
        this.security = security;
    }

    public Long getportfolioId() {
        return portfolioId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
    }

    public List<Security> getSecurity(List<Security> sec)
    {
        return sec;
    }

    public void setSecurity(List<Security> sec)
    {
        this.security = sec;
    }    

}