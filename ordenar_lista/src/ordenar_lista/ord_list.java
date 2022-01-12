package ordenar_lista;

public class ord_list {


	int lista []={1,2,8,44,9,26,3,7,33,1,93,417,19,27,14,11,30,4};
	
	public void ordenar()
	{
		int aux=0;
		for(int i=0;i<=lista.length-1;i++)
		{
			for(int j=i+1; j < lista.length; j++)
				if(i<lista.length-1)
			
				if(lista[i]<lista[j])
				{
					aux=lista[i];
					lista[i]=lista[j];
					lista[j]=aux;
					
				}
			
			}


			
		for(int i=0;i<=lista.length-1;i++)
		{
			System.out.println(lista[i]);
		}
		
		}
		
	public static void main(String[] args) {
		ord_list ol=new ord_list();
		
		ol.ordenar();

	}

}
