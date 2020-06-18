package posjavamavenhibernate;

import org.junit.Test;

import Model.UsuarioPessoa;
import dao.DaoGeneric;

public class testeHibernate {

	@Test
	public void testHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setIdade(33);
		pessoa.setLogin("teste");
		pessoa.setNome("Sabrina Santos");
		pessoa.setSobrenome("Santos 2");
		pessoa.setEmail("sabrina.ok@gmail.com");
		pessoa.setSenha("123");
		
		daoGeneric.salvar(pessoa);
	}

}
