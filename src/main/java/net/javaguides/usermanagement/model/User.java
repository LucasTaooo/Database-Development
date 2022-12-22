package net.javaguides.usermanagement.model;

/**
 * User.java
 * This is a model class represents a User entity
 * @author Ramesh Fadatare
 *
 */
public class User {
	protected int id;
	protected int examdate;
	protected String custlastname;
	protected String custfirstname;
	protected String custsuffix;
	protected int custdob;
	protected int age;
	protected int sex;
	protected int chestpain_type;
	protected int resting_blood_pressure;
	protected int chol;
	protected int max_heart_rt;
	protected int exer_agina;
	
	
	
	
	
	
	
	public User(int examdate, String custlastname, String custfirstname, String custsuffix, int custdob, int age,
			int sex, int chestpain_type, int resting_blood_pressure, int chol, int max_heart_rt, int exer_agina) {
		super();
		this.examdate = examdate;
		this.custlastname = custlastname;
		this.custfirstname = custfirstname;
		this.custsuffix = custsuffix;
		this.custdob = custdob;
		this.age = age;
		this.sex = sex;
		this.chestpain_type = chestpain_type;
		this.resting_blood_pressure = resting_blood_pressure;
		this.chol = chol;
		this.max_heart_rt = max_heart_rt;
		this.exer_agina = exer_agina;
	}
	public User(int id, int examdate, String custlastname, String custfirstname, String custsuffix, int custdob,
			int age, int sex, int chestpain_type, int resting_blood_pressure, int chol, int max_heart_rt,
			int exer_agina) {
		super();
		this.id = id;
		this.examdate = examdate;
		this.custlastname = custlastname;
		this.custfirstname = custfirstname;
		this.custsuffix = custsuffix;
		this.custdob = custdob;
		this.age = age;
		this.sex = sex;
		this.chestpain_type = chestpain_type;
		this.resting_blood_pressure = resting_blood_pressure;
		this.chol = chol;
		this.max_heart_rt = max_heart_rt;
		this.exer_agina = exer_agina;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExamdate() {
		return examdate;
	}
	public void setExamdate(int examdate) {
		this.examdate = examdate;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public String getCustsuffix() {
		return custsuffix;
	}
	public void setCustsuffix(String custsuffix) {
		this.custsuffix = custsuffix;
	}
	public int getCustdob() {
		return custdob;
	}
	public void setCustdob(int custdob) {
		this.custdob = custdob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getChestpain_type() {
		return chestpain_type;
	}
	public void setChestpain_type(int chestpain_type) {
		this.chestpain_type = chestpain_type;
	}
	public int getResting_blood_pressure() {
		return resting_blood_pressure;
	}
	public void setResting_blood_pressure(int resting_blood_pressure) {
		this.resting_blood_pressure = resting_blood_pressure;
	}
	public int getChol() {
		return chol;
	}
	public void setChol(int chol) {
		this.chol = chol;
	}
	public int getMax_heart_rt() {
		return max_heart_rt;
	}
	public void setMax_heart_rt(int max_heart_rt) {
		this.max_heart_rt = max_heart_rt;
	}
	public int getExer_agina() {
		return exer_agina;
	}
	public void setExer_agina(int exer_agina) {
		this.exer_agina = exer_agina;
	}
	
	
	
	
	


	
	
	
	
	


}
