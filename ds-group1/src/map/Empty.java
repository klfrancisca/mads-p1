package map;

public class Empty implements Cell, Cloneable {
	
	@Override
	public String print() {
		return " ";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
