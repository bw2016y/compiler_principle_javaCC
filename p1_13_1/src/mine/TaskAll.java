package mine;

import java.io.File;

import dd.BwyGrammar;
import dd.Token;

public class TaskAll {
	public static Token t;
	static String path;
	
  public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

  public TaskAll(String path) {
		super();
		this.path = path;
	}
   public static void clearfile(){
   	File f1=new File("Tree.txt") ;
   	if(f1.exists()){
   		f1.delete();
   	}
	File f2=new File("words.txt") ;
   	if(f2.exists()){
   		f2.delete();
   	}
	File f3=new File("result_yuyi.txt") ;
   	if(f3.exists()){
   		f3.delete();
   	}
	File f4=new File("SymTable.txt") ;
   	if(f4.exists()){
   		f4.delete();
   	}
	File f5=new File("SymError.txt") ;
   	if(f5.exists()){
   		f5.delete();
   	}
   }
public  static void  run() {
	     clearfile();
	     TaskOne.work(path);  
	     TaskTwo.work(path);
	     TaskThree.work(path);
	     TaskFour.work(path);
	     BwyGrammar.mytable.clear();
	     BwyGrammar.mySymTab.clear();
	     
   }
public static void main(String[] args) { 
	
	 new TaskAll("test1.txt").run();
}
}
