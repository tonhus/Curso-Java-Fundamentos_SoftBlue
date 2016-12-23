package br.com.aula12g;

public class Produto {
	
	private int id;
	private String descricao;
	
	public Produto(int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return id + ", "+descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null){
//			return false;
//		}
//		
//		if(!(obj instanceof Produto)){
//			return false;
//		}
//		
//		Produto outro = (Produto)obj;
//		if(this.id == outro.id){
//			return true;
//		}
//			
//		return false;
//	}
//	
//	@Override
//	public int hashCode() {
//		//return String.valueOf(id).hashCode();
//	}
	
	
}
