int missing_number(int a[]){
	int n = a.length;
	int total= 0;
	for(int i=0;i<n;i++){
		total+=a[i];
	}
	return (n+2)*(n+1)/2-total;
}