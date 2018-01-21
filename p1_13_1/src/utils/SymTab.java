package utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
public class SymTab {
	public ArrayList<String> NameList = new ArrayList<String>();
    public ArrayList<ArrayInfo> ArrayList = new ArrayList<ArrayInfo>();
	public ArrayList<SymInfo> SymList = new ArrayList<SymInfo>();
	public ArrayList<String> SymError = new ArrayList<String>();
	public ArrayList<String> ArrError = new ArrayList<String>(); 
	public ArrayList<String> UNdefineError = new ArrayList<String>(); 

	public static boolean flag = true;
	
	
    public void ArrNameCheck (ArrayInfo  info) {
    	Iterator<String> itr = NameList.iterator();
		while (itr.hasNext()) {
			String  tmp = (String) itr.next();
			if(info.getArrName().equals(tmp))
				{
				ArrError.add("Error: "+info.toString()+" redeclaration!!");
				break;
				} 
		}
		 
	}
    public void SymNameCheck (SymInfo  info) {
    	Iterator<String> itr = NameList.iterator();
		while (itr.hasNext()) {
			String  tmp = (String) itr.next();
			if(info.getSymName().equals(tmp))
				{
				SymError.add("Error: "+info.toString()+" redeclaration!!");
				break;
				} 
		}
		 
	}
    public void ArrUndefineCheck( String name , String pos , int demons, int demon1, int demon2){
		Boolean f=false;
		Iterator<ArrayInfo> itr = ArrayList.iterator();
		while (itr.hasNext()) {
			ArrayInfo  tmp = (ArrayInfo) itr.next();
			if(name.equals(tmp.getArrName()))
			{
				 f=true;
				 if(demons!=tmp.getDemons()||(demon1<0)||(demon2<0))
				 {
					 UNdefineError.add("Error: "+pos+" ArrayName--"+name+" "+demons+" "+demon1+" "+demon2+"--   index overstepped!!");
					 break;
				 }
				 if(demons==1&&(demon1>=tmp.getDemon1()||demon2!=0) )
				 {
					 UNdefineError.add("Error: "+pos+" ArrayName--"+name+" "+demons+" "+demon1+" "+demon2+"--   index overstepped!!");
					 break;
				 } 
				 if(demons==2&&(demon1>=tmp.getDemon1()||demon2>=tmp.getDemon2()) )
				 {
					 UNdefineError.add("Error: "+pos+" ArrayName--"+name+" "+demons+" "+demon1+" "+demon2+"--   index overstepped!!");
					 break;
				 } 
				 break;
			}
		}
		
		if(!f){
			
			UNdefineError.add("Error: "+pos+" ArrayName--"+name+" "+demons+" "+demon1+" "+demon2+"--  undefined behaviour!!");
		}
		
		 
		
	}
	public void SymUndefineCheck(String name,String pos){
		Boolean f=false;
		Iterator<SymInfo> itr = SymList.iterator();
		while (itr.hasNext()) {
			SymInfo  tmp = (SymInfo) itr.next();
			if(name.equals(tmp.getSymName()))
			{
				 f=true;
				 break;
			}
		}
		if(!f){
			
			UNdefineError.add("Error: "+pos+" variable--"+name+"--  undefined behaviour!!");
		}
		
	}
	
    
   public void addArrInfo (ArrayInfo info) {
		
	   ArrNameCheck(info);
	   ArrayList.add(info);
	   NameList.add(info.getArrName());
	}
	
	public void addSymInfo (SymInfo info) {
		
		SymNameCheck(info);
		SymList.add(info);
		NameList.add(info.getSymName());
	}

	public SymInfo get(int index) {
		return (SymInfo) SymList.get(index);
	}

	public SymInfo remove(int index) {
		return SymList.remove(index - 1);
	}
	

	public void clear() {
		NameList.clear();
		ArrayList.clear();
		SymList.clear();
		SymInfo.SyminnerIdSeqen =100;
		ArrayInfo.ArrinnerIdSeqen=100;
		SymError.clear();
		ArrError.clear();
		UNdefineError.clear();
	}
	public void ErrorClear() {
		SymError.clear();
		ArrError.clear();
	}
	
	public void printError() {
		 
		Iterator<String> itr = SymError.iterator();
		Iterator<String> itr2 = ArrError.iterator();
		Iterator<String> itr3 = UNdefineError.iterator();
		 
		try {
			File f = new File("SymError.txt");
			if (f.exists()) {
				// System.out.print("文件存在");
			} else {
				System.out.print("文件不存在");
				f.createNewFile();// 不存在则创建
			}
			BufferedWriter output;
			output = new BufferedWriter(new FileWriter(f));
			while (itr.hasNext()) {
				String tmp = (String) itr.next();
				output.write(tmp.toString()+"\r\n");
			}
			while (itr2.hasNext()) {
				String tmp = (String) itr2.next();
				output.write(tmp.toString()+"\r\n");
			}
			while (itr3.hasNext()) {
				String tmp = (String) itr3.next();
				output.write(tmp.toString()+"\r\n");
			}
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printSymTab() {
		 
		Iterator<SymInfo> itr = SymList.iterator();
		Iterator<ArrayInfo> itr2 = ArrayList.iterator();
		try {
			File f = new File("SymTable.txt");
			if (f.exists()) {
				// System.out.print("文件存在");
			} else {
				System.out.print("文件不存在");
				f.createNewFile();// 不存在则创建
			}
			BufferedWriter output;
			output = new BufferedWriter(new FileWriter(f));
			while (itr.hasNext()) {
				SymInfo tmp = (SymInfo) itr.next();
				output.write(tmp.toString()+"\r\n");
			}
			while (itr2.hasNext()) {
				ArrayInfo tmp = (ArrayInfo) itr2.next();
				output.write(tmp.toString()+"\r\n");
			}
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
