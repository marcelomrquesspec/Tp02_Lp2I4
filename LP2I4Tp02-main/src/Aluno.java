//Marcelo Marques Araujo CB3005631

import java.util.UUID;
import java.lang.Object;

public class Aluno {
	private String endereco;
	private int idade;
	private String nome;
	private UUID uuid;
	
	Aluno(String a, int b, String c){
		endereco = a;
		idade = b;
		nome = c;
		uuid = UUID.randomUUID();
	}
	public String getEndereco() {
		return endereco;
	}
	public int getIdade() {
		return idade;
	}
	public String getNome() {
		return nome;
	}
	public UUID getUuid() {
		return uuid;
	}
	public void setEndereco(String endereco1) {
		endereco = endereco1;
	}
	public void setIdade(int idade1) {
		idade = idade1;
	}
	public void setNome(String nome1) {
		nome = nome1;
	}
	public void setUuid(UUID uuid1) {
		uuid = uuid1;
	}
	public static void main(String args[]) {
	}
}
