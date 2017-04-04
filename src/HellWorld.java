import javax.swing.JOptionPane;

public class HellWorld {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog(null, "Quantas vezes você quer a frase \"Hello World\"?");
	int num = 0;
	try {
		num = Integer.parseInt(number);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	}
	for (int i = 0; i < num; i++) {
		printHello();
	}
}
	public static void printHello(){
		System.out.println("Hello World");
	}

}
