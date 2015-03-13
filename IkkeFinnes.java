class IkkeFinnes extends Exception{
    private int finnes;
   
    IkkeFinnes(int i){
	finnes = i;
    }
        
	public int notFound() {
		return finnes;
	}
}
