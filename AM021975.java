class AM021975 {
	public static void main(String[] args) {
		MM mm = new MM();
		System.out.println(mm.gogo(2,3));
	}
}
class MM {
	public  int gogo(int a,int b) {
		return a+b*b+a;
	}
}