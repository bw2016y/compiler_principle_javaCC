package mine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import dd.BwyGrammar;
import dd.Token;
import utils.ArrayInfo;
import utils.SymInfo;

public class TaskOne {
    public static Token t;
    public static void work(String path){
    	  File infile=new File(path);
          File outfile=new File("words.txt");
          
          
          if (outfile.exists()) {
				// System.out.print("�ļ�����");
			} else {
				System.out.print("�ļ�������");
				try {
					outfile.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}// �������򴴽�
			}
          
		    InputStream in=null;


		    try {
		          in=new FileInputStream(infile);

		    } catch (FileNotFoundException e1) {
		          // TODO �Զ����ɵ� catch ��
		          e1.printStackTrace();
		    }
		    
		    BwyGrammar b=    new BwyGrammar(in);
		     
		     BufferedWriter output = null;
				try {
					output = new BufferedWriter(new FileWriter(outfile));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
		     
		     
		  
		     
		     
	         while((t=b.getNextToken()) != null){
	    	 if(t.kind==0){
	    		 break;
	    	 }
	    	  String tmp=t.kind+"  "+t.image;
	    	  try {
				output.write(tmp.toString()+"\r\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 	  	  System.out.println(t.kind+"  "+t.image);
	 	    }
	         try {
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
	        
    }
	 

}
