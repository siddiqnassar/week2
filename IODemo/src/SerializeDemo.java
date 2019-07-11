import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String args[])
	{
		try
		{
			
			Person p1=new Person();
			p1.name="Nassar";
			p1.age=25;
			
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.ser"));
			oos.writeObject(p1);
			oos.close();
			System.out.println("Serialized success");
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
