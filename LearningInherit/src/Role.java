public class Role { // �}��C
	protected String name; // private �l���O�L�k�����s���C
	protected int level;
	protected int blood;
	
	public int getBlood(){
		return blood;
	}
	public void setBlood(int blood){
		this.blood=blood;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level=level;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}	
	public void fight(){ // �����C
		//System.out.println("���C����");		
	}
	public String toString(){
		return String.format("(%2s, %2d, %2d)",this.name,this.level,this.blood );
	}
	public static void main(String[] args) {	

	}
}
