package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		NoteBookRegistry notebookRegistry = new NoteBookRegistry();
        notebookRegistry.registerNotebook(
                "a4_rule_120",
                new NoteBook(
                        PageType.A4,
                        120,
                        RuleType.Ruled
                ));
        notebookRegistry.registerNotebook(
                "a3_plain_120",
                new NoteBook(
                        PageType.A3,
                        120,
                        RuleType.Plain
                )
        );

        java.util.List<String> input = new ArrayList();
        input.add("a4_rule_120");
        input.add("a3_plain_120");
        
        

        List<NoteBook> notebooks = new ArrayList();

        for (String inp: input) {
            NoteBook prototype = notebookRegistry.getNotebook(inp);
            if (prototype == null) {
                continue;
            }

            prototype.setFactPage(new FactPage());
            prototype.setFrontPage(new FrontPage());

            notebooks.add(prototype);
        }
        
        for(NoteBook n : notebooks) {
        	System.out.println(n.toString());
        }
    }

    // 1. Read a list of strings.
    // a4_rule_120
    // a4_plain_120
    // a3_plain_120
    // 2. Based upon the type of strings create
    // relevant object
    // 3. Add a random front page and fact page to it
    // Command Pattern
    // execute()
	
}
