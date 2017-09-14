package br.com.indra.jovemprofissional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LojaController {
	//Mapeamento do Index
	@RequestMapping("/")
	public String index(){
		return "indexLoja";
	}
	//mapeamento da pagina de produtos
	@RequestMapping("/produtos")
	public String produtos(){
		return "produtos";
	}

	@RequestMapping(value= "logar", method = RequestMethod.POST)
	public String verificar(@RequestParam("username") String username, @RequestParam("password") String password, Model model)
	{
		String resul="teste";

		if(!valida(username) && !valida(password)){
			System.out.println("campo em branco");
			return "indexLoja";
		}

		if(username.equals(resul) && password.equals(resul))
		{	        
			System.out.println("logou");
			//Proxima pagina-->
			return "produtos";

		}else{	    		
			System.out.println("erro login");
			return "indexLoja";
		}

	}

	//metodo de validação para inputs diferentes de null
	public Boolean valida(String entrada)
	{
		if(!entrada.isEmpty())
		{
			return true;
		}else {
			return false;
		}
	}

	//Mapeamento do ListaClientes
	/*@RequestMapping("listaconvidados")
	public String listaConvidados(Model model){

		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}*/

	//Mapeamento do listaequipamentos
	/*@RequestMapping("listaequipamentos")
	public String listaEquipamentos(Model model){

		Iterable<Equipamento> equips = repositoryEquip.findAll();
		model.addAttribute("listaEquipamentos", equips);


		return "listaequipamentos";
	}*/

	//Mapeamento para o metodo salvar
	/*@RequestMapping(value= "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("ID_CLIENTE") int ID_CLIENTE, @RequestParam("NO_CLIENTE") String NO_CLIENTE, Model model){

		Cliente novoCliente = new Cliente(ID_CLIENTE, NO_CLIENTE);
		repositoryCli.save(novoCliente);

		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}*/
	//Mapeamento para o metodo deletar
	/*@RequestMapping(value= "deletar", method = RequestMethod.POST)
	public String deletar(@RequestParam("ID_CLIENTE") int ID_CLIENTE, Model model){

		Cliente delCliente = repositoryCli.findOne(ID_CLIENTE);
		repositoryCli.delete(delCliente);	

		Iterable<Cliente> clientes = repositoryCli.findAll();
		model.addAttribute("listaClientes", clientes);

		return "listaconvidados";
	}*/

	/*@Autowired											//
	private ClienteRepository repositoryCli;				//
															//Amarração com objeto do BD
	@Autowired												//
	private EquipamentoRepository repositoryEquip;			//
	 */



}
