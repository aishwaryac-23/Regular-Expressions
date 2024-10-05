//^check for 0 index that pattern matches or not 
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		Pattern p=Pattern.compile("^aishu");
		Matcher m=p.matcher(s);
		while(m.find()){
		    System.out.println(m.start()+m.group());
		}
	}
}
