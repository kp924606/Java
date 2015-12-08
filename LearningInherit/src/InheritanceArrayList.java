import java.util.Arrays;;
public class InheritanceArrayList {
	private Object[] list;  // �ϥ�Object�}�C�����C
	private int next; // �U�@�ӥi�x�s���󪺯��ޡC
	public InheritanceArrayList(int capacity){ // ���w��l�e�q�C
		list=new Object[capacity];
	}
	public InheritanceArrayList(){ // ��l�e�q�w�]���A16�C
		this(16);
	}
	public void add(Object o){ // ���������k�C
		if(next==list.length){ // �۰ʼW��Object�}�C���סC
			list=Arrays.copyOf(list, list.length*2);
		}
		list[next++]=o;
	}
	public Object get(int index){ // �̯��ި��o����������C
		return list[index];
	}
	public int size(){ // �w����������ӼơC
		return next;
	}	
	public static void main(String[] args) {		
		
	}
}
