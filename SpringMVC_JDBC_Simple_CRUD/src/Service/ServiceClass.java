package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.DAO;

@Service
public class ServiceClass {
@Autowired
	private DAO dao;
}
