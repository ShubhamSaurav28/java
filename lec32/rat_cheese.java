package lec32;

import java.util.*;

public class rat_cheese {
	static boolean f=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char [][]maze=new char[n][m];
		for(int i=0;i<n;i++) {
			String s=sc.next();
			for(int j=0;i<m;j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int [][] ans=new int [n][m];
		path(maze,0,0,ans);
		if(f==false) {
			System.out.println("NO PATH FOUND");
		}
		
	}	
	public static void path(char [][]maze,int cr,int cc,int [][] ans) {
		if(cr==maze.length-1 && cc==maze[0].length-1 && maze[cr][cc]!='X') {
			ans[cr][cc]=1;
			f=true;
			show(ans);
			return;
		}
		if(cr<0 || cc<0 || cr>=maze.length || cc==maze[0].length || maze[cr][cc]=='X'){
			return;
		}
		maze[cr][cc]='X';
		ans[cr][cc]=1;
//		int [] r={-1,1,0,0};
//		int [] c={0,0,1,-1};
//		for(int i=0;i<c.length,i++) {
//			path(maze,cr,r[i],cc+c[i],ans);
//		}
		path(maze,cr-1,cc,ans);//up
		path(maze,cr+1,cc,ans);//down
		path(maze,cr,cc-1,ans);//right
		path(maze,cr,cc+1,ans);//left
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}
	public static void show(int [][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;i<ans[0].length;j++) {
				System.out.println(ans[i][j]);
			}
			System.out.println();
		}
	}

}
