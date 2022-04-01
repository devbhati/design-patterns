package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class NoteBookRegistry {
	
	Map<String, NoteBook> noteBooks = new HashMap();
	
	void registerNotebook(String name, NoteBook notebook) {
		noteBooks.put(name, notebook);
    }

	NoteBook getNotebook(String name) {

        return noteBooks.get(name).clone();
    }

}
