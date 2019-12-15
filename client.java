package net.codejava.hibernate;

import javax.persistence.*;


@Entity
@Table(name = "client")
public class client {

	
	private int id;  
	private String ClientFirstName;
	private String ClientLastName;
	private String ClientEmail;

	@Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientFirstName() {
        return ClientFirstName;
    }

    public void setClientFirstName(String ClientFirstName) {
        this.ClientFirstName = ClientFirstName;
    }

    public String getClientLastName() {
        return ClientLastName;
    }

    public void setClientLastName(String ClientLastName) {
        this.ClientLastName = ClientLastName;
    }

    public String getClientEmail() {
        return ClientEmail;
    }

    public void setClientEmail(String ClientEmail) {
        this.ClientEmail = ClientEmail;
    }

}
