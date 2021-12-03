public class StringProblem {

	public static void main(String[] args) {
		String str = "kaushi";
	    char array[] = str.toCharArray();
	    String result = "";
	    
	    
	    for(int i=0;i<array.length;i++) {
	    	if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u') {
	    		char ch = array[i];
	    		int ascii = (int)ch;
	    		int freq = ascii - 96;
	    		
	    		for(int j=0;j<freq;j++) 
	    			result = result+"x";
	    		
	    	}
	    	
	    	else {
	    		result = result+array[i];
	    	}
	    	
	    }
	    
	    System.out.println(result);
	    
		
		

	}

}
