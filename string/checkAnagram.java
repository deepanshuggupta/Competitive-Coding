static boolean checkAnagram(String s1, String s2){
		int count1[] = new int[256];
		int count2[] = new int[256];
		for(int i=0;i<=255;i++){
			count1[i] = 0;
			count2[i] = 0;
		}
		for(int i=0;i<s1.length();i++){
			int index = (int)s1.charAt(i);
			count1[index]+=1;
		}
		for(int i=0;i<s2.length();i++){
			int index = (int)s2.charAt(i);
			count2[index]+=1;
		}
		for(int i=0;i<=255;i++){
			if(count1[i]!=count2[i]) return false;
		}
		return true;
	}