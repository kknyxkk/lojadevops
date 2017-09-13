package br.com.indra.jovemprofissional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.indra.jovemprofissional.model.Cliente;
import br.com.indra.jovemprofissional.model.Equipamento;
import br.com.indra.jovemprofissional.repository.ClienteRepository;
import br.com.indra.jovemprofissional.repository.EquipamentoRepository;

@Controller
public class ClienteController {
//Mapeamento do Index
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	//Mapeamento do ListaClientes
	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model){

		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}
	
	//Mapeamento do listaequipamentos
	@RequestMapping("listaequipamentos")
	public String listaEquipamentos(Model model){
		
		Iterable<Equipamento> equips = repositoryEquip.findAll();
		model.addAttribute("listaEquipamentos", equips);
		
		
		return "listaequipamentos";
	}
	
	//Mapeamento para o metodo salvar
	@RequestMapping(value= "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("ID_CLIENTE") int ID_CLIENTE, @RequestParam("NO_CLIENTE") String NO_CLIENTE, Model model){

		Cliente novoCliente = new Cliente(ID_CLIENTE, NO_CLIENTE);
		repositoryCli.save(novoCliente);

		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}
	//Mapeamento para o metodo deletar
	@RequestMapping(value= "deletar", method = RequestMethod.POST)
	public String deletar(@RequestParam("ID_CLIENTE") int ID_CLIENTE, Model model){
		
		Cliente delCliente = repositoryCli.findOne(ID_CLIENTE);
		repositoryCli.delete(delCliente);	
		
		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}
	
	@Autowired												//
	private ClienteRepository repositoryCli;				//
															//Amarração com objeto do BD
	@Autowired												//
	private EquipamentoRepository repositoryEquip;			//




}
