package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import model.Employee;

public class EmpRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int num) throws SQLException {
		 Employee e=new Employee();  
         e.setId(rs.getInt(1));  
         e.setName(rs.getString(2));  
         e.setSalary(rs.getFloat(3));  
         e.setDesignation(rs.getString(4));
		return e;
	}



}
