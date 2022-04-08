package behavioural.strategy;

public class PageReplacementStrategyFactory {
	
	public static PageReplacementStrategy getPageReplacementStrategy(PageReplacementAlgoType algoType, OS os) {
		switch (algoType) {
	        case LFU: return new LFUPageReplacementStrategy();
	        case LRU: return new LRUPageReplacementStrategy();
	        case FIFO: return new FIFOPageReplacementStrategy(os);
	        default: return null;
	    }
	}

}
