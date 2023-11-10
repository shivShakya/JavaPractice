public class DBconnect
	{
		public static void main(String[] args)
		{
			try
			{
		    	System.out.println("1");
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("Driver Loaded Successfully");
	          
			}
			catch(Exception e) {
                e.printStackTrace();
            }
			
		}
}


