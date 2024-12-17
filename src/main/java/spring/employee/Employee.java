/**
 * 
 */
package spring.employee;

/**
 * @author JONATHAN
 */
public class Employee {

	private int eid;
	private String ename;
	private int salary;
	
	public Employee() {}
	/**
	 * @param eid
	 * @param ename
	 * @param salary
	 */
	public Employee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	
}
