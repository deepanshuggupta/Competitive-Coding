// time complexity is O(n) and space complexity is O(1)


void rotate_array_by_d(int a[], int d){
	int n = a.length;
	int current = a[n-1];
	int j =n-1;
	for(int i=0;i<n;i++){
		int temp = a[(j-d+n)%n];
		a[(j-d+n)%n] = current;
		current = temp;
		j = (j-d+n)%n;
	}
	
}

