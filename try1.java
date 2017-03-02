 class SimpleDotCom{
	
	int[] locationCells;
	int numOfHits=0;
	
	public void setLocationCells(int[] locs){
		locationCells=locs;
	}
	
	public String CheckYourSelf(String stringGuess){
		int guess=Integer.parseInt(stringGuess);
		
		String result="Mimo";
		
		for (int cell:locationCells){
			if (guess==cell){
				result="Popal";
				numOfHits++;
				break;
			}
		}
		
		if(numOfHits==locationCells.length){
			result="Ubil";
		}
		
		System.out.println(result);
			return result;
	}
}


 class SimpleDotComTestDrive{
	public static void main (String[] args){
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations={2,3,4};
		dot.setLocationCells(locations);
		String userGuess="2";
		String result=dot.CheckYourSelf(userGuess);
	}
}