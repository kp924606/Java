class Clothes{
	String color;
	char size;
	Clothes(String color,char size){
		this.color=color;
		this.size=size;
	}	
}
public class Learning7 {
	public static void main(String[] args) {
		Clothes[] c1={
				new Clothes("red",'L'),
				new Clothes("blue",'M')		
		};
		Clothes[] c2=new Clothes[c1.length];
		for(int i=0;i<c1.length;i++){ // �ѦҦP�@�Ӫ���C
			c2[i]=c1[i];
		}
		c1[0].color="yellow";
		System.out.println("c1:"+c1[0].color);
		System.out.println("c2:"+c2[0].color);
	}
}
