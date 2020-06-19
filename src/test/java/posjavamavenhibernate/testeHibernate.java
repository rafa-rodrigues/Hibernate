package posjavamavenhibernate;

import java.util.List;

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
		pessoa.setNome("Sabrina");
		pessoa.setSobrenome("Santos");
		pessoa.setEmail("sabrina.ok@gmail.com");
		pessoa.setSenha("123");

		daoGeneric.salvar(pessoa);
	}

	@Test
	public void testeBuscar() {

		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		UsuarioPessoa pessoa = new UsuarioPessoa();
		pessoa.setId(2L);

		pessoa = daoGeneric.pesquisar(pessoa);

		System.out.println(pessoa);
	}

	@Test
	public void testeBuscar2() {

		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		UsuarioPessoa pessoa = daoGeneric.pesquisar(2L, UsuarioPessoa.class);

		System.out.println(pessoa);
	}

	@Test
	public void testeUpdate() {

		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L, UsuarioPessoa.class);

		pessoa.setIdade(45);
		pessoa.setNome("Atualizado");
		pessoa.setEmail("teste@hibernate.com");

		System.out.println(pessoa);
	}

	@Test
	public void testeDelete() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		UsuarioPessoa pessoa = daoGeneric.pesquisar(1L, UsuarioPessoa.class);
		
		daoGeneric.deleltePorId(pessoa);

	}
	
	@Test
	public void testeConsultar() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();

		List<UsuarioPessoa> list = daoGeneric.listar(UsuarioPessoa.class);
		
		for(UsuarioPessoa usuarioPessoa : list) {
			System.out.println(usuarioPessoa);
			System.out.println("==================================================================");
			
		}
		

	}
	
	@Test
	public void testeQuery() {
		
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		List<UsuarioPessoa> list= 
		
	}
	
}
