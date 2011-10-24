public class ExceptionTest {
	public static void main(String[] agrs){
		try{
			System.out.println("won't done");
			System.out.println("This is a test.".matches("[A-Z](\\w*\\s*)*."));
			throw new Exception("except");
		}catch(Exception e){
			e.printStackTrace(System.out);
			e.printStackTrace();
		}finally{
			System.out.println("this is done");
		}
	}
}
