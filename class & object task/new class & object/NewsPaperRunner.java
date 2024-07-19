class NewsPaperRunner{
	public static void main(String[] args){
		Newspaper ref= new Newspaper();
		boolean details=ref.currentAffairs("vijay vani",10,"kannada",15);
		ref.getDetails();
	}
}