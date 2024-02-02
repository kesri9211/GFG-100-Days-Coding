class Solution
{
    int atoi(String s) {
	// Your code here
	int ans=0;
	int count=0;
	for(int i=0;i<s.length();i++){
	    if(s.charAt(i)==45 && i==0){
	        count++;
	    }
	    else if((s.charAt(i)>=48 && s.charAt(i)<=57 )){
	        count++;
	       // System.out.println(s.charAt(i));
	       // ans=ans*10+s.charAt(i)-'0';
	    }
	}
	if(count==s.length())return Integer.parseInt(s);
	return -1;
    }
}
