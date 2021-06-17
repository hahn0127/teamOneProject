package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductionController {
	//작업지시 목록
	@GetMapping("/workerOrderList")
	public String workerOrderList(Model model) {
		model.addAttribute("title", "작업지시관리: 작업지시목록");
		return "production/workerOrderList";
	}
	//작업지시등록
	@GetMapping("/addWorkerOrder")
	public String addWorkerOrder(Model model) {
		model.addAttribute("title", "작업지시관리: 작업지시등록");
		return "production/addWorkerOrder";
	}

	
	@GetMapping("/addProductionProcess")
	public String addProductionProcess() {
		return "production/addProductionProcess";
	}
	
	@GetMapping("/productionProcessList")
	public String getProductionProcessList() {
		return "production/productionProcessList";
	}
	
	@GetMapping("/productioncontrolList")
	public String productioncontrolList(){
		return "production/productioncontrolList";
	}
	
	@GetMapping("/productioncontrolAdd")
	public String productioncontrolAdd() {
		return "production/productioncontrolAdd";
	}
	
	@GetMapping("/production")
	public String getProdcutioncontrol () {
		
		return "production/production";
		
	}
}
