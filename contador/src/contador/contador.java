package contador;

public class contador {

		
		public void recursivo(int num)
		{
			if(num<=1000)
				{
								
				System.out.print(num);
				
				if(num%2==0)
				System.out.print(" es par");	
				if(primo(num)==true)
				System.out.print(" es primo");
				if(num%5==0 && num%2==0)				
				System.out.print(" es numero ordinario");
				System.out.println();
			recursivo(num+1);
				}
		}
		
		public boolean primo(int num)
		{
			int contador = 2;
			  boolean prim=true;
			  while ((prim) && (contador!=num)){
			    if (num % contador == 0)
			    	prim = false;
			    contador++;
			  }
			  return prim;
		}
		
		public static void main(String[] args) {
			contador cont=new contador();
			
		cont.recursivo(1);

		}
}

