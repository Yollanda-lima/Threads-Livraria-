package Application;

 
public class ThreadEmprestimo extends Thread {

	private Clientes cliente;
	private Livros livro;
	

	public ThreadEmprestimo(Livros livro, Clientes cliente){
	this.livro = livro;
	this.cliente = cliente;
	}	
			
	
	@Override
	
	public void run() {
		
		this.livro.alugar(this.cliente);
		
	}
 
	


}
