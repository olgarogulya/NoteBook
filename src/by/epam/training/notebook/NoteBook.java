package by.epam.training.notebook;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import by.epam.training.notebook.Note;


public class NoteBook{
	
	private List<Note> notes;
	private Note note;

	public NoteBook() {
		notes = new ArrayList<Note>();
	}
	
	public void add(Note note) {
		this.note = note;
		notes.add(note);
	}
	
	public void remove(Note note) {
		this.note = note;
		notes.remove(note);
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + ", note=" + note + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(note, notes);
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
		return Objects.equals(note, other.note) && Objects.equals(notes, other.notes);
	}
	
	
}
