
public class Application {
	public static void main(String[] args) {
		int vetor[] = {7,5,2,8,3,18,1};
		insertionSort(vetor);
	}
	
	public static void insertionSort(int v[]) {
		int pivo,i,j;
		for(j=1;j<v.length;j++) {
			pivo=v[j];
			i=j-1;
			while((v[i]>pivo)&& (i>0)) {
				v[i+1]=v[i];
				i--;
			}
			if((i==0) && (v[i]>pivo)) {
				v[i+1]=v[i];
				i--;
			}
			v[i+1]=pivo;
		}
		for(int numero: v) {
			System.out.printf("%d ",numero);
		}
	}
}
