package ex03.Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("****** 정렬 전 출력 : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				} // if end
			} // j end
		} // i end
		System.out.println("\n****** 정렬 후 출력 : ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
