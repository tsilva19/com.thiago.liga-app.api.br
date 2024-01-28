package com.thiago.ligaapp.api.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.ligaapp.api.br.model.Liga;
import com.thiago.ligaapp.api.br.repository.LigaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/ligas")
@AllArgsConstructor
public class LigaController {
	
	private LigaRepository ligaRepository;
	
	/*public LigaController(LigaRepository ligaRepository) {
		this.ligaRepository = ligaRepository;
	}*/
	
	@GetMapping
	public @ResponseBody List<Liga> list(){
		Sort sort = Sort.by(Sort.Direction.DESC, "pontos");
		return ligaRepository.findAll(sort);

	}

}
