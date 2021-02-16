package exs;

public class Arranjo {

	public int menor() {
		int a[]= new int [10];
		a[0] = 940;
		a[1] = 880;
		a[2] = 830;
		a[3] = 790;
		a[4] = 750;
		a[5] = 660;
		a[6] = 650;
		a[7] = 590;
		a[8] = 510;
		a[9] = 940;
		
		int cont=1;
		int men = a[0];
		while (cont <= (a.length-1)) {
			int num = a[cont];
			if (num < men) {
				men = num;
			}
			cont++;
	
	}
		return men;
	}

	public int maior() {
		int a[]= new int [10];
		a[0] = 940;
		a[1] = 880;
		a[2] = 830;
		a[3] = 790;
		a[4] = 750;
		a[5] = 660;
		a[6] = 650;
		a[7] = 590;
		a[8] = 510;
		a[9] = 940;
		
		int cont=1;
		int mai = a[0];
		while (cont <= (a.length-1)) {
			int num = a[cont];
			if (num > mai) {
				mai = num;
			}
			cont++;
		}
		return mai;
	}

	public int soma() {
		int a[]= new int [10];
		a[0] = 940;
		a[1] = 880;
		a[2] = 830;
		a[3] = 790;
		a[4] = 750;
		a[5] = 660;
		a[6] = 650;
		a[7] = 590;
		a[8] = 510;
		a[9] = 940;
		
		
		int cont=0;
		int som = 0;
		while (cont <= a.length-1) {
			som = som + a[cont];
			cont++;
		
		}
		return som;
	}

	public int repeticoes(int numero) {
		int a[]= new int [10];
		a[0] = 940;
		a[1] = 880;
		a[2] = 830;
		a[3] = 790;
		a[4] = 750;
		a[5] = 660;
		a[6] = 650;
		a[7] = 590;
		a[8] = 510;
		a[9] = 940;
		
		int cont = 0;
		for (int i = 0; i < a.length; i++) {
			if (numero == a[i]) {
				cont++;
			}
		}
		return cont;
	}
	
}


	

