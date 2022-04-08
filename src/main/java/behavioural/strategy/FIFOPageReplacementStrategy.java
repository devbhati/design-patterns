package behavioural.strategy;

import java.util.ArrayDeque;
import java.util.Queue;

public class FIFOPageReplacementStrategy implements PageReplacementStrategy, AddPageEventSubscriber {
	Queue<Page> pages = new ArrayDeque();

    FIFOPageReplacementStrategy(OS os) {
        os.registerAddPageEventSubscriber(this);
    }

    public void replace() {
        System.out.println("REMOVING FROM FIFO");
        Page page = pages.remove();
        System.out.println("REMOVED " + page.name);
    }

    public void onAddPage(Page page) {
        pages.add(page);
    }
}
