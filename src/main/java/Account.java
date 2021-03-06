import common.Utils;

import java.util.HashMap;
import java.util.HashSet;


public class Account {
    private Integer id;
    private Industry industry;
    private Integer employeeCount;
    private String companyName;
    private String city;
    private String country;
    private HashSet<Contact> contactSet;
    private HashSet<Opportunity> opportunitySet;

    public static HashMap<Integer, Account> accountMap = new HashMap<>();


    public Account(Industry industry, Integer employeeCount, String companyName, String city, String country, Contact contact, Opportunity opportunity) {
        this.id = Utils.getNextId(accountMap);
        this.industry = industry;
        this.employeeCount = employeeCount;
        this.companyName = companyName;
        this.city = city;
        this.country = country;
        this.contactSet = new HashSet<Contact>();
        this.addContact(contact);
        this.opportunitySet = new HashSet<Opportunity>();
        this.addOpportunity(opportunity);
        //      addAccount(this); //???
        accountMap.put(this.id,this);
    }

    public Integer getId() {
        return id;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public Integer getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(Integer employeeCount) {
        this.employeeCount = employeeCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashSet<Contact> getContactSet() {
        return contactSet;
    }

    public void listContacts() {
        for (Contact selected : this.contactSet) {
            System.out.println(selected);
        }
    }

    public void addContact(Contact contact) {
        this.contactSet.add(contact);
    }

    public HashSet<Opportunity> getOpportunitySet() {
        return opportunitySet;
    }

    public void listOpportunities() {
        for (Opportunity selected : this.opportunitySet) {
            System.out.println(selected);
        }
    }

    public void addOpportunity(Opportunity opportunity) {
        this.opportunitySet.add(opportunity);
    }

    @Override
    public String toString() {
        return "Account with ID " + id +
                "\n" + "Industry: " + industry +
                "\n" + "EmployeeCount: " + employeeCount +
                "\n" + "CompanyName: " + companyName +
                "\n" + "City: " + city +
                "\n" + "Country: " + country;
    }
}