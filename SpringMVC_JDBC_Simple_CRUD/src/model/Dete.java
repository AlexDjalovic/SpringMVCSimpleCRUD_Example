package model;

public class Dete {

	private int Id,IdDeteta;
	private String imeDeteta;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getIdDeteta() {
		return IdDeteta;
	}
	public void setIdDeteta(int idDeteta) {
		IdDeteta = idDeteta;
	}
	public String getImeDeteta() {
		return imeDeteta;
	}
	public void setImeDeteta(String imeDeteta) {
		this.imeDeteta = imeDeteta;
	}
	public Dete(int id, int idDeteta, String imeDeteta) {
		super();
		Id = id;
		IdDeteta = idDeteta;
		this.imeDeteta = imeDeteta;
	}
	public Dete() {
		super();
	}
	
	public String toString() {
		return imeDeteta+"/"+Id;
	}
}
