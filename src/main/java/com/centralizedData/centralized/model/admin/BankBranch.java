package com.centralizedData.centralized.model.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bank_branch")
public class BankBranch implements Serializable{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="created_by")
	private String createdBy;;
	
	@Column(name="modified_by")
	private String modifiedBy;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "bank_id")
	private Bank bank;
	
	@Column(name="name")
	private String name;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="micr_code")
	private String micrCode;
	
	@Column(name="bank_branch_code")
	private String bankBranchCode;
	
	@Column(name="created_date")
	private Date createdDate;
	
	@Column(name="last_modified_date")
	private Date lastModifiedDate;
	
	@OneToMany(mappedBy = "bankBranch", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<Account> accounts = new HashSet<Account>(0);
	
	@OneToMany(mappedBy = "bankBranch", cascade = CascadeType.ALL,orphanRemoval=true)
	private Set<FeeTransaction> feeTransactions = new HashSet<FeeTransaction>(0);

}
