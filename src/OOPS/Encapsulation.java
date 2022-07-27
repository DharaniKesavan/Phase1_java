package OOPS;

public class Encapsulation {
	private int security_code;
	private String branch_name;
	private long branch_code;
	private String dept_name;
	private int dept_code;
	public int getSecurity_code() {
		return security_code;
	}
	public void setSecurity_code(int security_code) {
		this.security_code = security_code;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public long getBranch_code() {
		return branch_code;
	}
	public void setBranch_code(long branch_code) {
		this.branch_code = branch_code;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getDept_code() {
		return dept_code;
	}
	public void setDept_code(int dept_code) {
		this.dept_code = dept_code;
	}
	public static void main(String args[]){
		Encapsulation ec = new Encapsulation();
		ec.setSecurity_code(112);
		ec.setBranch_name("Delhi");
		ec.setBranch_code(8889995);
		ec.setDept_name("Finance");
		ec.setDept_code(5556);
		
		System.out.println("security code = "+ec.getSecurity_code());
		System.out.println("branch name = "+ec.getBranch_name());
		System.out.println("branch code = "+ec.getBranch_code());
		System.out.println("dept name = "+ec.getDept_name());
		System.out.println("dept code = "+ec.getDept_code());
	}	
}
