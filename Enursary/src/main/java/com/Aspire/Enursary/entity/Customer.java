package com.Aspire.Enursary.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int cid;
	
	
	private String cname;
	private String mobno;
	private String address;
	
	@OneToMany(targetEntity = Plants.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="plantid",referencedColumnName = "cid")
	private List<Plants> selectplant;

	public Customer() {
		super();
	}

	public Customer(int cid, String cname, String mobno, String address, List<Plants> selectplant) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobno = mobno;
		this.address = address;
		this.selectplant = selectplant;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getMobno() {
		return mobno;
	}


	public void setMobno(String mobno) {
		this.mobno = mobno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Plants> getSelectplant() {
		return selectplant;
	}


	public void setSelectplant(List<Plants> selectplant) {
		this.selectplant = selectplant;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobno=" + mobno + ", address=" + address
				+ ", selectplant=" + selectplant + "]";
	}
	
	
	
}
