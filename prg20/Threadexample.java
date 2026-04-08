class Tablethread extends Thread{
	public void run(){
		System.out.println("Multiplication Table");
		for(int i=1;i<=10;i++){
			System.out.println("5*"+i+"="+(5*i));
		}
	}
}

class PrimeThread extends Thread{
	int n;
	PrimeThread(int n){
		this.n=n;
	}
	public void run(){
		System.out.println("First"+n+"Prime number:");
		int count=0,num=2;
		while(count<n){
			boolean isPrime=true;
			for (int i=2;i<=num/2;i++){
				if(num%i==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
			  System.out.println(num);
			  count++;
			}
			num++;
   }
  }
}

class Threadexample{
  public static void main(String[] args){
    Tablethread t1=new Tablethread();
    PrimeThread t2 = new PrimeThread(5);
    t1.start();
    t2.start();
  }
}
