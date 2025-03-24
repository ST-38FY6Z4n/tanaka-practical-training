package homework;

public class GetExtTest {

	//拡張子を取り出すツール

	public static void main(String[] args) {
	String FileName1 = "reskill_orientation.pdf.jpg";
	int commaP1 = FileName1.lastIndexOf(".")+1;
	System.out.println(FileName1.substring(commaP1));


	}

}
