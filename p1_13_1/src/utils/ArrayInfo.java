package utils;

public class ArrayInfo {
	public static int ArrinnerIdSeqen = 100;
	public int ArrID;
    public String ArrType;
    public String ArrName;
    public String ArrPos;
    public int demons;
    public int demon1;
    public int demon2;
    public ArrayInfo(String arrType, String arrName, String arrPos, int demons, int demon1, int demon2) {
		super();
		ArrType = arrType;
		ArrName = arrName;
		ArrPos = arrPos;
		this.demons = demons;
		this.demon1 = demon1;
		this.demon2 = demon2;
		this.ArrID=++ArrinnerIdSeqen;
	}
	public static int getArrinnerIdSeqen() {
		return ArrinnerIdSeqen;
	}
	public static void setArrinnerIdSeqen(int arrinnerIdSeqen) {
		ArrinnerIdSeqen = arrinnerIdSeqen;
	}
	public int getArrID() {
		return ArrID;
	}
	public void setArrID(int arrID) {
		ArrID = arrID;
	}
	public String getArrType() {
		return ArrType;
	}
	public void setArrType(String arrType) {
		ArrType = arrType;
	}
	public String getArrName() {
		return ArrName;
	}
	public void setArrName(String arrName) {
		ArrName = arrName;
	}
	public String getArrPos() {
		return ArrPos;
	}
	public void setArrPos(String arrPos) {
		ArrPos = arrPos;
	}
	public int getDemons() {
		return demons;
	}
	public void setDemons(int demons) {
		this.demons = demons;
	}
	public int getDemon1() {
		return demon1;
	}
	public void setDemon1(int demon1) {
		this.demon1 = demon1;
	}
	public int getDemon2() {
		return demon2;
	}
	public void setDemon2(int demon2) {
		this.demon2 = demon2;
	}
	@Override
	public String toString() {
		return "ArrayInfo [ArrID=" + ArrID + ", ArrType=" + ArrType + ", ArrName=" + ArrName + ", ArrPos=" + ArrPos
				+ ", demons=" + demons + ", demon1=" + demon1 + ", demon2=" + demon2 + "]";
	}
	 
    
}
