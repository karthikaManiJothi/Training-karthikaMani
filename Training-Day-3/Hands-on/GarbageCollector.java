public class GarbageCollector {

	public static void main(String[] args) {
		GarbageCollector g1 =new GarbageCollector();
		GarbageCollector g2 =new GarbageCollector();
        g1=null;
        g2=null;
        Runtime.getRuntime().gc();
	}
	@Override
	protected void finalize()throws Throwable{
		System.out.println("garbage collected");
		System.out.println("garbage collected"+this);
		
	}

	}

