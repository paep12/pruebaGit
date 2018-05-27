package one;

public class A1 {
	
	public static String A(int n,String letra){
		String palabraReturn="";
		String[] arreglo={"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
				"Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		if (n>0) {
			
			for (int i = 0; i < arreglo.length; i++) {
				
				if (n<arreglo.length) {
					System.out.println("oli");
					if (letra.equals(arreglo[i])) {
						return palabraReturn=(arreglo[i+n]);
					}
					
				}
				else{

					return palabraReturn=(arreglo[n-arreglo.length]);
				}
				
		
				
			}
			
		}
		else{
			return "No se aceptan numeros negativos";
		}
		
		
		return palabraReturn;
		
		
	}
	
	public void A1(){
		
	}

	public static void main(String[] args) {
		
		System.out.println(A(1,"A"));
		
	}
}
