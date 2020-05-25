package com.cadastro.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.apirest.models.Cliente;
import com.cadastro.apirest.repository.ClienteRepository;

@RestController
@RequestMapping(value="/cliente")
public class ClienteResource {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<Cliente>> get() {
		return ResponseEntity.ok(clienteRepository.findAll());
	}
	
	
	@GetMapping("/porId/{id}")
	public ResponseEntity<?> GetById(@PathVariable(value="id") long id){
		Cliente _cliente = clienteRepository.findById(id);
		if(_cliente != null) {
			return ResponseEntity.ok(_cliente);
		}
		return (ResponseEntity<?>) ResponseEntity.badRequest();
			
		
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Cliente> Post(@RequestBody Cliente cliente){
		if(cliente != null) {
			clienteRepository.save(cliente);
			return ResponseEntity.ok(cliente);
		}
		return (ResponseEntity<Cliente>) ResponseEntity.badRequest();
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Cliente> Put(@RequestBody Cliente cliente){
		if(cliente != null) {
			clienteRepository.save(cliente);
			return ResponseEntity.ok(cliente);
		}
		return (ResponseEntity<Cliente>) ResponseEntity.badRequest();
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<?> Delete(@PathVariable long id){
		Cliente _cliente = clienteRepository.findById(id);
		if(_cliente != null) {
			clienteRepository.delete(_cliente);
			return ResponseEntity.ok(_cliente);
		}
		return (ResponseEntity<?>) ResponseEntity.badRequest();
	}
	
}
