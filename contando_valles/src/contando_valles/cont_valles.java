package contando_valles;

public class cont_valles {
	
	public int countingValleys(int steps, String path)
		{
		String cam[];
		int numva=-1;
		char aux;
		cam=new String[path.length()-1];
		int nivel_mar=0, up=0, down=0;
		
		if(steps>=2 && steps<=1000000)
		{
			
		for(int i=0;i<cam.length-1;i++)
		{
			aux=path.charAt(i);
			if(aux=='U'||aux=='u')
			{
				cam[i]="/";
				up++;
				nivel_mar=nivel_mar+up;
				if(nivel_mar==0)
				{
					numva++;
				}
			}
			else
				if(aux=='D'||aux=='d')
				{
					cam[i]="\\";
				down--;
				nivel_mar=nivel_mar+down;
				if(nivel_mar==0)
				{
					numva++;
				}
				}
			
		}

		/*String dim[][];
		dim=new String [path.length()+1][path.length()+1];
		for(int i=0;i<=cam.length-1;i++)
		{
			if(i<cam.length-1) {
			if(cam[i]==cam[i+1])				
			for(int j=1;j<=cam.length-1;j++)
			{
				dim[i][j]=cam[i];
			}
			}
		}*/
		
		
		for(int i=0;i<=cam.length-2;i++)
		{
			//for(int j=0;j<=cam.length-1;j++)
				//System.out.print(dim[i][j]);
			System.out.print(cam[i]);
		}
		
		}
		
		System.out.println("\nnumero de valles "+numva);
		
		return numva;
	}
	
	public static void main(String[] args) {
		cont_valles cv=new cont_valles();
		cv.countingValleys(14,"UDDDUDUUDDDUUU");

	}

}
