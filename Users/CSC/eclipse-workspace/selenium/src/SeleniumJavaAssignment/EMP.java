package SeleniumJavaAssignment;

public class EMP {

	private String Ename="Yaduveer";
	private int Eid=0143;
	private int Salary=1000;
	public String getEname()
	{
		return Ename;
	}
	public int getEid()
	{
		return Eid;
	}
	public int getSalary()
	{
		return Salary;
	}
	public void setEname(String Ename)
	{
		this.Ename=Ename;
	}
	public void setEid(int Eid)
	{
		this.Eid=Eid;
	}
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public static void main(String[] args) 
	{
		EMP e=new EMP();
		System.out.println(e.getEname());
		System.out.println(e.getEid());
		System.out.println(e.getSalary());
		e.setEname("Wodeyar");
		e.setEid(1430);
		e.setSalary(00000);
		System.out.println(e.getEname());
		System.out.println(e.getEid());
		System.out.println(e.getSalary());
	}

}
