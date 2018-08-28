//package com.demo.rest.dao;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.stereotype.Repository;
//
//import com.demo.rest.pojo.Employee;
//
//
//
//@Repository
//
//public class EmployeeDAOImpl implements EmployeeDAO{
//
//	private List<Employee> employee = new ArrayList<>(
//			Arrays.asList(new Employee(1, "Ashwini"), new Employee(2, "Akansha"), new Employee(3, "Shweta")));
//
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#getAllNames()
//	 */
//
//	/* (non-Javadoc)
//	 * @see com.demo.rest.dao.EmployeeDAO#getAllNames()
//	 */
//	@Override
//	public List<Employee> getAllNames() {
//		return employee;
//	}
//
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#getName(int)
//	 */
//	
//	/* (non-Javadoc)
//	 * @see com.demo.rest.dao.EmployeeDAO#getName(int)
//	 */
//	@Override
//	public Employee getName(int id) {
//	return employee.stream().filter(e -> e.getEmpId() == id).findFirst().get();
//	
//	}
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#addName(com.employee.pojo.Employee)
//	 */
//	
//	/* (non-Javadoc)
//	 * @see com.demo.rest.dao.EmployeeDAO#addName(com.demo.rest.pojo.Employee)
//	 */
//	@Override
//	public void addName(Employee emp)
//
//	{
//		
//		employee.add(emp);
//
//	}
//
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#updateName(int, com.employee.pojo.Employee)
//	 */
//	
//	/* (non-Javadoc)
//	 * @see com.demo.rest.dao.EmployeeDAO#updateName(int, com.demo.rest.pojo.Employee)
//	 */
//	@Override
//	public void updateName(int id,Employee emp) {
//		for(int i=0;i<employee.size();i++)
//		{
//			Employee e=employee.get(i);
//			
//			if(e.getEmpId()==id)
//			{
//				employee.set(i, emp);		
//				return;
//				}
//		}
//		
//	}
//
//	/* (non-Javadoc)
//	 * @see com.employee.dao.EmployeeDAO#deleteName(int)
//	 */
//	/* (non-Javadoc)
//	 * @see com.demo.rest.dao.EmployeeDAO#deleteName(int)
//	 */
//	@Override
//	public void deleteName(int id) {
//		employee.removeIf(t -> t.getEmpId() == id);
//	}
//}
//
