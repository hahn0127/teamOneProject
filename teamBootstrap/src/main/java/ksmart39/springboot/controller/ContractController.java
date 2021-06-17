package ksmart39.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContractController {
	//수주거래처 조회
	@GetMapping("/clientAccountLookup")
	public String clientAccountLookup(Model model) {
		model.addAttribute("title", "수주거래처조회");
		return "contract/clientAccountLookup";
	}
	//수주거래처 등록
	@GetMapping("/clientAccountEnroll")
	public String clientAccountEnroll(Model model) {
		model.addAttribute("title", "수주거래처등록");
		return "contract/clientAccountEnroll";
	}
	
	//원부자재 발주리스트
	@GetMapping("/supplierOrderList")
	public String getRawmaterialsOrderList(Model model) {
		model.addAttribute("title","원부자재 발주 리트스");
		return"contract/supplierOrderList";
	}

	//원부자재 발주등록메서드
	@GetMapping("/supplierOrder")
	public String rawMaterialsOrder(Model model) {
		model.addAttribute("title","원부자재발주등록");
		return "contract/supplierOrder";
	}
	
	//원부자재거래처목록경로메서드
		@GetMapping("/supplierList")
		public String getSupplierList(Model model
										,@RequestParam(name = "supplierSearchKey",required = false)String supplierSearchKey
										,@RequestParam(name ="supplierSearchValue",required = false )String supplierSearchValue) {
			
			model.addAttribute("title","거래처목록");
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("supplierSearchKey", supplierSearchKey);
			paramMap.put("supplierSearchValue", supplierSearchValue);
			
			return"contract/supplierList";
		}

	
	//원자재거래처 등록 경로 메서드
	@GetMapping("/supplierAccount")
	public String supplierAccount(Model model) {
		model.addAttribute("title", "원자재거래처등록");
		return"contract/supplierAccount";
	
	}
	
	@GetMapping("/contract")
	public String getContractmangement() {
		
		return "contract/contract";
	}

}
