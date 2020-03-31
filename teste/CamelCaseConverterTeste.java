import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CamelCaseConverterTeste {

	
	private CamelCaseConverter camelCase;
	@Before
	 public void setup() {
		 camelCase = new CamelCaseConverter();
	}
	
	@Test
	public void deveCriarObjetoComelCaseConverter()throws Exception{
				
	}
	
	@Test
	public void deveConverteNomeSimples() throws Exception{
		assertEquals("Lionel", camelCase.converter("lionel"));
		
	}
	
	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() {
		assertEquals("Lionel", camelCase.converter("LIOnel"));
	}	
}
