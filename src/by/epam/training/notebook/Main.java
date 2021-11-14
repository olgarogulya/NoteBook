package by.epam.training.notebook;

public class Main {

	public static void main(String[] args) {
		NoteBookProvider provider = NoteBookProvider.getInstance();
		
		NoteBook nb = provider.getNoteBook(0);
		
		nb.add("note1");
		nb.add("note2");
		
		System.out.print(nb.size());
		
		int newIndex = provider.createNewNoteBook();
		nb = provider.getNoteBook(newIndex);
		
		System.out.print(nb.size());
		
		nb = provider.getNoteBook(0);
		System.out.print(nb.size());
	}


}
