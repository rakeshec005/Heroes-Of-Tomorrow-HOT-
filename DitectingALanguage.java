package hot;

import java.util.Scanner;
import java.util.Vector;

public class DitectingALanguage
{
	Vector<Vector<String>> container= new Vector<Vector<String>>();
	String code="";
	Vector<Integer> syntaxCount=new Vector<Integer>();
	String[] lanName=new String[7];
	public void control()
	{
	      
	      input();
	     // System.out.println(code);
	      
	      getLanguage();
	      languageSyntax();
	      languageDetector(code);
	      print();
	 }
	public void input()
	{
		 Scanner console = new Scanner(System.in);
		 System.out.println("Enter code :");
	        code = console.nextLine();
	        while (console.hasNextLine())
	        {
	            code = code + "\n" + console.nextLine();
	        }
	       
	        
		
	}
	
	public void getLanguage()
	{
		/*lan.add("C");
		lan.add("C++");
		lan.add("JAVA");
		lan.add("PYTHON");
		lan.add("RUBY");
		lan.add("PERL");
		lan.add("JAVASCRIPT");*/
		lanName[0]="C";
		lanName[1]="C++";
		lanName[2]="JAVA";
		lanName[3]="PYTHON";
		lanName[4]="RUBY";
		lanName[5]="PERL";
		lanName[6]="JAVASCRIPT";
		
	}
	public void languageSyntax()
	{
		Vector<String> c=new Vector<String>();
		c.add("#include");
		c.add("printf");
		c.add("scanf");
		c.add("#include<conio.h>");
		c.add("#include<stdio.h>");
		Vector<String> cplus=new Vector<String>();
		cplus.add("#include");
		cplus.add("cout");
		cplus.add("cin");
		cplus.add("using namespace std");
		cplus.add("#include <iostream>");
		Vector<String> java=new Vector<String>();
		java.add("import");
		java.add("public static void main");
		java.add("System.out.print");
		Vector<String> python=new Vector<String>();
		python.add("import");
		python.add("try:");
		python.add("print\"");
		python.add("$ python");
	   	python.add("exec");
	   	python.add("sys.exit()");
	   	python.add("def");
	   	python.add("zfill");
		//System.out.println(python);
		Vector<String> ruby=new Vector<String>();
		ruby.add("print<<");
		ruby.add("END{");
		ruby.add("BEGIN{");
		ruby.add("puts");
		ruby.add("yield");
		ruby.add("self");
		ruby.add("rescue");
		ruby.add("ensure");
		ruby.add("unless");
		ruby.add("defined?");
		ruby.add("EOF");
		ruby.add("add");
		
		Vector<String> perl=new Vector<String>();
		perl.add("my");
		perl.add("use");
		perl.add("next if");
		perl.add("$");
		perl.add("and");
		perl.add("cmp");
		perl.add("CORE");
		
		Vector<String> js=new Vector<String>();
		js.add("<script>");
		js.add("</script>");
		js.add("document.getElementById");
		js.add("window.alert");
		js.add("document.write");
		
		container.add(c);
		container.add(cplus);
		container.add(java);
		container.add(python);
		container.add(ruby);
		container.add(perl);
		container.add(js);
	}
	
	public void languageDetector(String str)
	{
		for(int i=0;i<container.size();i++)
		{
			Vector<String> vec=container.elementAt(i);
			int count=languageChecker(vec,str);
			syntaxCount.add(count);
			
			
		}
	}
	public int languageChecker(Vector<String> vec,String str)
	{
		int flag=0;
		for(int i=0;i<vec.size();i++)
		{
			
			String token=vec.elementAt(i);
			if(str.contains(token))
			{
				flag++;
			}
			
		}
		return flag;
	}
	public void print()
	{
		System.out.println(syntaxCount);
		int max=0;
		int index=0;
		for(int i=0;i<syntaxCount.size();i++)
		{
			if(syntaxCount.elementAt(i)>max)
			{
				max=syntaxCount.elementAt(i);
				index=i;
			}
		}
		System.out.print(lanName[index]);
	}
	public static void main(String[] args)
	{
		new DitectingALanguage().control();
	}

}
