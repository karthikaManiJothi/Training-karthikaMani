package com.onebill.training.assignment.array;

public class EncodingDecoding {

	public static void main(String[] args) {
        char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
        		           'n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String str ="the quick brown fox jumps over the lazy dog";
        char[] ch = str.toCharArray();
        int[] number=new int[str.length()];
        System.out.print("Encoding: ");
        for(int i=0;i<ch.length;i++) {
        	for(int j=0;j<alphabets.length;j++) {
        	    if(ch[i]==alphabets[j]) {
        	    	number[i]=j;
        	    	System.out.print(j+" ");
        	    }
        	    else if(ch[i]==' ') {
        	    	number[i]=99;
        	    	System.out.print("99 ");
        	    	break;
        	    }
        	    else {
        	    	continue;
        	    }
           }
        }
        System.out.println();
        System.out.print("Decoding: ");
        for(int i:number) {
        	if(i==99) {
        		System.out.print(" ");
        	}
        	else {
        	System.out.print(alphabets[i]);
        }
	}
}
}

