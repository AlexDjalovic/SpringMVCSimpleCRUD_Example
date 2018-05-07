package Kontroleri;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import DAO.DAO;
import model.Dete;
import model.Employee;

@Controller
public class Kontroler {
@Autowired
	private DAO dao;
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String p1(Model model) {
		return "index";
	}
	@RequestMapping(value="/formaZaInsert")
	public String m2(Model model) {
		model.addAttribute("emp", new Employee());
		return "formaZaInsert";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView m3(@Valid @ModelAttribute("emp")Employee emp,BindingResult rezultat) {
		if(rezultat.hasErrors()) {
			return new ModelAndView("formaZaInsert");//NE SMEM DA STAVIM REDIRECT JER CE VRATITI NA PRAZNU STRANU I NECE PRIKAZATI GRESKE U VALIDACIJI
		}
		 dao.save(emp);  
		return new ModelAndView("redirect:/viewemp");
		
	}
	@RequestMapping("/viewemp")  
    public ModelAndView m4(){  
        List<Employee> list=dao.getEmployees();  
        return new ModelAndView("viewemp","list",list);  
    }  
	  @RequestMapping(value="/editemp/{id}")  
	    public ModelAndView edit(@PathVariable int id){  
	        Employee emp=dao.getEmpById(id);  
	        return new ModelAndView("empeditform","command",emp);  
	    }  
	  
	  @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	    public ModelAndView editsave(@ModelAttribute("emp") Employee emp){  
	        dao.update(emp);  
	        return new ModelAndView("redirect:/viewemp");  
	    }  
	  @RequestMapping(value="/deleteemp/{id}")
	  public ModelAndView deleteEmp(@PathVariable int id) {
		  dao.delete(id);
		return new ModelAndView("redirect:/viewemp");
		  
	  }
	  @ModelAttribute
	  public void prikazi(Model model) {
		  List<Employee> list=dao.getEmployees();  
		  model.addAttribute("list", list);
		//  model.addAttribute("dete", new Dete()); //Moze i ovde ako nemam ovu medjuformu
		//  model.addAttribute("emp", new Employee());//isto i ovo ako hocu da koristim emp i dete moram da napravim instancu
	  }
	  @RequestMapping(value="/upisDece", method=RequestMethod.GET)
	  public String upisDece(Model model) {
		  model.addAttribute("dete", new Dete());
		return "upisDece";
		  
	  }
	  @RequestMapping(value="/upisiDete", method=RequestMethod.POST)
	  public String upisiDete(@ModelAttribute("dete") Dete dete,Model model) {
		  dao.upisiDete(dete);
		  model.addAttribute("dete", dete);
		return "SpisakDece";
		  
	  }
	  //POKUSAJ DA POKUPIM PARAMETAR PO PARAMETAR KAO KOD OBICNIH JSP I SERVLETA
	/* @RequestMapping(value="/upisiDete", method=RequestMethod.POST)
	  public String upisiDete(@RequestParam("imeDeteta")String imeDeteta,@RequestParam("ime")String ime,Model model) {
		
		 int id=0;
		 for(Employee emp:dao.getEmployees()) {
			 if(emp.getName().equalsIgnoreCase(ime)) {
				 id=emp.getId();
			 }
		 }
		  model.addAttribute("ime", imeDeteta);
		  model.addAttribute("id", id);
		  model.addAttribute("zap", ime);
		return "SpisakDece";
		}*/
}
