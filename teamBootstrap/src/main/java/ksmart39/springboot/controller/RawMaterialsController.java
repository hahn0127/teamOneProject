package ksmart39.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RawMaterialsController {
	
	@GetMapping("/rawMaterials")
	public String meterials() {
		return "rawMaterials/rawMaterials";
	}
	
	@GetMapping("/addRawMaterials")
	public String addRawMeterials() {
		return "rawMaterials/addRawMaterials";
	}
	
	
	
	@GetMapping("/rawMaterialsList")
	public String getRawMeterialsList() {
		return "rawMaterials/rawMaterialsList";
	}
	
	@GetMapping("/materialsList")
	public String materialsList() {
		return "rawMaterials/rawMaterialsList";
	}
	
	@GetMapping("/materialsAdd")
	public String materialsAdd() {
		return "rawMaterials/addRawMaterials";
	}
	
	@GetMapping("/rawmaterialmangement")
	public String rawmaterialmangement() {
		return "rawMaterials/rawMaterials";
	}
}
