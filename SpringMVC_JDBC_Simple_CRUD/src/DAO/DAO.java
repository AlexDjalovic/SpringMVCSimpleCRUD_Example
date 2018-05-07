package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import model.Dete;
import model.Employee;

@Repository
public class DAO {

	@Autowired
 private JdbcTemplate template;

	public List<Employee> getEmployees() {
		/* return template.query("select * from employeespring",new RowMapper<Employee>(){  
		        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
		            Employee e=new Employee();  
		            e.setId(rs.getInt(1));  
		            e.setName(rs.getString(2));  
		            e.setSalary(rs.getFloat(3));  
		            e.setDesignation(rs.getString(4));  
		            return e;  
		        }  
		    });  */
		String upit="select * from employeespring";
		return template.query(upit, new EmpRowMapper());
	}

	public int save(Employee emp) {
		String sql="insert into employeespring(name,salary,designation)values(?,?,?)";  
		    return template.update(sql,new Object[] {emp.getName(),emp.getSalary(),emp.getDesignation()});  
		
	}

	public Employee getEmpById(int id) {
		String upit="Select * from employeespring WHERE Id=?";
		Employee emp=template.queryForObject(upit, new EmpRowMapper(),id);
		return emp;
	}

	public void update(Employee emp) {
		// String sql="update employeespring set name='"+emp.getName()+"', salary="+emp.getSalary()+",designation='"+emp.getDesignation()+"' where id="+emp.getId()+""; 
		String sql="update employeespring set name='"+emp.getName()+"',salary='"+emp.getSalary()+"' WHERE Id='"+emp.getId()+"'";
		//MORA DA SE STAVE ' PRE KRAJA "
		template.update(sql);
	}

	public int delete(int id){  
	    String sql="delete from employeespring where id="+id;  
	    return template.update(sql);  
	}  
	public void upisiDete(Dete dete) {
		String sql="insert into dete(imeDeteta,Id)values(?,?)"; 
		template.update(sql, new Object[] {dete.getImeDeteta(),dete.getId()});
	}
}
