package io.github.julioamorim.pmc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST está funcionando";
	}
}
