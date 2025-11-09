package java_plane;

public class Access_Subclass {

			private   int w = 10;
			          int x = 20;   // default
			protected int y = 30;
			public    int z = 40;

		   private void showPrivate() {
			   System.out.println("Private Method." + w);
		   }
		   
		   void showDefault() {
			   System.out.println("Default Method.");
		   }

		   protected void showProtected() {
			   System.out.println("Protected Method.");
		   }

		   public void showPublic() {
			   System.out.println("Public Method");
		   }
	}


