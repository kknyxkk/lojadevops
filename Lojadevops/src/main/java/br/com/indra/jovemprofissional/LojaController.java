package br.com.indra.jovemprofissional;


//classes minhas

//spring
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojaController {
	
	//@Autowired
	//private UserRepository repository;
	
	//Mapeamento do Index
	@RequestMapping("/")
	public String index(){
		return "indexLoja";
	}
	//mapeamento da pagina de produtos
	@RequestMapping("produtos")
	public String produtos(){
		return "produtos";
	}
	//mapeamento da pagina de cadastros
	@RequestMapping("cadastro")
	public String cadastro(){
		return "cadastro";
	}

	//Metodo de checagem do login com o banco de dados
	/*@RequestMapping(value= "logar", method = RequestMethod.POST)
	public String verificar(@RequestParam("Username") String nome, @RequestParam("Password") String senha)
	{
		
		System.out.println("Login...");
		
		if(repository.exists(nome))
		{
			
			if(senha.equals(repository.findOne(nome).getPASSWORD()))
			{	        
				System.out.println("logou");
				//Proxima pagina-->
				return "/produtos";
			}
			
		}else{
			
		
		System.out.println("erro login");
		return "indexLoja";
			
		}
		return "indexLoja";		

	}*/

	//mapeamento cadastro
	/*@RequestMapping("cadastrado")
	public String salvar(@RequestParam("username") String nome, @RequestParam("password") String senha,@RequestParam("nomeCompleto") String nomeCom,@RequestParam("email") String email){

		if(valida(nome) && valida(senha) && valida(nomeCom) && valida(email)){
			System.out.println("N�o existe");
			if(!repository.exists(nome) || !repository.exists(email)){
				System.out.println("Criando objeto");
				Usuario novoUsuario = new Usuario();
				System.out.println("Setando obj");
				novoUsuario.setUSERNAME(nome);
				novoUsuario.setPASSWORD(senha);
				novoUsuario.setNOMECOMPLETO(nomeCom);
				novoUsuario.setEMAIL(email);
				System.out.println("salvando");
				repository.save(novoUsuario);

			}
			System.out.println("Sucesso");	    	
			return "indexloja";

		} else{	


			System.out.println("erro cadastro");
			return "cadastro";
		}
	}*/

	//metodo de valida��o para inputs diferentes de null
	public Boolean valida(String entrada)
	{
		if(!entrada.isEmpty())
		{
			return true;
		}else {
			return false;
		}
	}

	
}