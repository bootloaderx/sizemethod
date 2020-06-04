//Size() Metodu
import java.util.*;

public class SizeMetodu {
    public static void main(String[] args)
    {
       // Programlama dillerini içeren bir ArrayList oluşturuyorum.
        ArrayList<String> programlang = new ArrayList<String>(5);
        programlang.add(new String("Java"));
        programlang.add(new String("C#"));
        programlang.add(new String("Dart"));
	programlang.add(new String("Python"));

        // ArrayList'in boyutunu alıyorum.
        int size = programlang.size();
        System.out.println("ArrayList " + size + " eleman içeriyor.");
    }
}
