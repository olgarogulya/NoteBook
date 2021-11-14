package by.epam.training.notebook;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;

public class NoteBook{
	
	private List<Note> notes;

	public NoteBook() {
		notes = new ArrayList<Note>();
	}
	
	public void add(Note note) {
		notes.add(note);
	}
	
	public void add(String textNote) {
		notes.add(new Note(textNote));
	}
	
	public void remove(Note note) {
		notes.remove(note);
	}

	public int size() {
		return notes.size();
	}
	
	public Note findByContent(String content) {
		
		for(Note n : notes) {
			if(n.equalContent(content)) {
				return n;
			}
		}	
		return null;
	}
	
	public Note findByDate(Date date) {
		
		for(Note n : notes) {
			if(n.equalDate(date)) {
				return n;
			}
		}	
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(notes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		return Objects.equals(notes, other.notes);
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}
	
	
}
