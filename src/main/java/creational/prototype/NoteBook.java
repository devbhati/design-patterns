package creational.prototype;

public class NoteBook {
	
	private PageType pageType;
    private int pageCount;
    private RuleType ruleType;

    @Override
	public String toString() {
		return "NoteBook [pageType=" + pageType + ", pageCount=" + pageCount + ", ruleType=" + ruleType + "]";
	}

	public FrontPage getFrontPage() {
        return frontPage;
    }

    public void setFrontPage(FrontPage frontPage) {
        this.frontPage = frontPage;
    }

    public FactPage getFactPage() {
        return factPage;
    }

    public void setFactPage(FactPage factPage) {
        this.factPage = factPage;
    }

    private FrontPage frontPage;
    private FactPage factPage;

    public NoteBook(PageType pageType, int pageCount, RuleType ruleType) {
        this.pageType = pageType;
        this.pageCount = pageCount;
        this.ruleType = ruleType;
    }
    
    private NoteBook() {}

    public NoteBook clone() {
    	NoteBook newNotebook = new NoteBook();
        newNotebook.pageCount = this.pageCount;
        newNotebook.pageType = this.pageType;
        newNotebook.ruleType = this.ruleType;

        return newNotebook;
    }

}
