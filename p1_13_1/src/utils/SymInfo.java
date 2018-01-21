package utils;

public class SymInfo {
	public static int SyminnerIdSeqen = 100;
	public int SymID;
    public String SymType;
    public String SymName;
    public String SymPos;
	public SymInfo(String symType, String symName,String sympos) {
		super();
		SymType = symType;
		SymName = symName;
		SymPos = sympos;
		this.SymID=++SyminnerIdSeqen;
		
	}
	public String getSymPos() {
		return SymPos;
	}
	public void setSymPos(String symPos) {
		SymPos = symPos;
	}
	public static int getSyminnerIdSeqen() {
		return SyminnerIdSeqen;
	}
	public static void setSyminnerIdSeqen(int syminnerIdSeqen) {
		SyminnerIdSeqen = syminnerIdSeqen;
	}
	public int getSymID() {
		return SymID;
	}
	public void setSymID(int symID) {
		SymID = symID;
	}
	public String getSymType() {
		return SymType;
	}
	public void setSymType(String symType) {
		SymType = symType;
	}
	public String getSymName() {
		return SymName;
	}
	public void setSymName(String symName) {
		SymName = symName;
	}
	@Override
	public String toString() {
		return "SymInfo [SymID=" + SymID + ", SymType=" + SymType
				+ ", SymName=" + SymName + ", SymPos=" + SymPos + "]";
	}
    
}
