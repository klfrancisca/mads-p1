package map;

public class ClosedLift implements Cell, Cloneable {
	@Override
	public String print() {
		return "L";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
