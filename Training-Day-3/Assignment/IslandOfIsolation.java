package com.exc.cons;

public class IslandOfIsolation {
	IslandOfIsolation i;
    public static void main(String[] args) {
        IslandOfIsolation g1 =new IslandOfIsolation();
        IslandOfIsolation g2 =new IslandOfIsolation();
        g1.i=g2;
        g2.i=g1;
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
