package mine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import dd.BwyGrammar;
import dd.SimpleNode;

public class TaskFour {
	public static void work(String path){
		 File infile=new File(path);

		    InputStream in=null;


		    try {
		          in=new FileInputStream(infile);

		    } catch (FileNotFoundException e1) {
		          // TODO 自动生成的 catch 块
		          e1.printStackTrace();
		    }
		  //  BwyGrammar v=new BwyGrammar(in);
		    try
		    {
		   //   SimpleNode n = v.Start();
		    // n.dump("");
		      BwyGrammar.mySymTab.printSymTab();
		      BwyGrammar.mySymTab.printError();
		      
		      
		      System.out.println("Thank you.");
		        
		      
		          
		    }
		    catch (Exception e)
		    {
		      System.out.println("Oops.");
		      System.out.println(e.getMessage());
		    }
	}
	 

}
