package lec11;

public class gas_station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []gas= {1,2,3,4,5};
		int []cost= {3,4,5,1,2};
		int x=coc(gas,cost);
		System.out.println(x);
	}
	public static int coc(int []gas,int []cost) {
		int tc=0;
		int curr=0;
		int si=0;
		for(int i=0;i<cost.length;i++) {
			tc=tc+gas[i]-cost[i];// can also use seperate loop 
			curr+=gas[i]-cost[i];
			if(curr<0) {
				curr=0;
				si=i+1;
			}
		}
		if(tc<0) {
			return -1;
		}
		return si;
	}
}


//wrong
	
//	int [] gas = {2,3,4};
//	int [] cost = {3,4,3};
//	int i=0;
//	int j=0;
//	while(gas[i]<cost[i]) {
//		i++;
//	}
//	int t=i;
//	int x=gas[i]-cost[i];
//	for(j=i;x>=cost[j];j++) {
//		 x=x+gas[j]-cost[j];
//	}
//	if(j==i)
//	System.out.println(j);
//	else
//	System.out.println(-1);