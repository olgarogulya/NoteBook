package by.epam.training.notebook;

import java.io.Serializable;
import java.util.Date;

public class Note implements Serializable{

	private String textNote;
	private Date dateCreated;
	
	public Note() {
		this.textNote = null;
		this.dateCreated = null;
	}
	
	public Note(String textNote, Date dateCreated) {
		this.textNote = textNote;
		this.dateCreated = dateCreated;
	}
	
	public Note(String textNote) {
		this.textNote = textNote;
		this.dateCreated = null;
	}
	
	public Note(Date dateCreated) {
		this.textNote = null;
		this.dateCreated = dateCreated;
	}
	
	public String getTextNote() { 
		return textNote; 
		}
	
    public void setTextNote(String textNote) {
    	this.textNote = textNote; 
    	}
    
    public Date getDateCreated() { 
    	return dateCreated; 
    	}
    
    public void setDateCreated(Date dateCreated) { 
    	this.dateCreated = dateCreated; 
    	}
    
    public boolean equalContent(String content) {
		return textNote.equals(content);
	}
    
    public boolean equalDate(Date date) {
		return dateCreated.equals(date);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(null==obj) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Note note = (Note)obj; 
		if(textNote != note.textNote) {
			return false;
		}
		if(null == dateCreated) {
			return (dateCreated == note.dateCreated);
		}
		else {
			if(!dateCreated.equals(note.dateCreated)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		return (int) (31*result + ((null == textNote) ? 0 : textNote.hashCode()));
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "text Note = " + textNote + ", created at " + dateCreated;
	}
}
