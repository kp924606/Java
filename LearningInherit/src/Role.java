public class Role { // 腳色。
	protected String name; // private 子類別無法直接存取。
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
	public void fight(){ // 攻擊。
		//System.out.println("揮劍攻擊");		
	}
	public String toString(){
		return String.format("(%2s, %2d, %2d)",this.name,this.level,this.blood );
	}
	public static void main(String[] args) {	

	}
}
