import javax.swing.JOptionPane;

public class HellWorld {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog(null, "Quantas vezes você quer imprimir hello world?");
	int num = Integer.parseInt(number);
	for (int i = 0; i < num; i++) {
		printHello();
	}
}
	public static void printHello(){
		System.out.println("Hello World");
	}

}
