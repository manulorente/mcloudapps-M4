package es.urjc.code.daw.library.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id = null;
	
	private String title;
	
	private String description;

	private String preface;

	public Book() {}

	public Book(String nombre, String description) {
		super();
		this.title = nombre;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPreface() {
		return this.preface != null ? this.preface : this.description;
	}

	public void setPreface(String preface) {
		this.description = preface;
		this.preface = preface;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
