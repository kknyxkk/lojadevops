package br.com.indra.jovemprofissional;


//classes minhas

//spring
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LojaController {
	
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