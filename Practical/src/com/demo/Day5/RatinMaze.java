//Write a program to solve the Rat in a Maze problem.
//You are given N*N  maze where:
//1-represent an open path
//0-represent a blocked path
//you need to find a way for rat to move from the start(top-left->0,0) to the destintion (bottom-right) N-1,N-1
//,Move only down or right
//
//input:
//Enter the size of the maze(N):4
//Enter the maze matrix (1-path,0-blocked):
//1 0 0 0
//1 1 0 1
//0 1 0 0
//1 1 1 1
//
//Output:
//1 0 0 0
//1 1 0 0
//0 1 0 0
//0 1 1 1

package com.demo.Day5;

import java.util.Scanner;

public class RatinMaze {
	static int N;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		N=sc.nextInt();//size of the maze-4
		//2-d array
		int[][] maze=new int[N][N];
		//read the matrix input from user
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j]=sc.nextInt();
			}
		}
		//solution for rate chosen path
		int[][] solution=new int[N][N];
		
			
		if(	solveMaze(maze,solution,0,0)) {
			displaysolution(solution);
		}else {
			System.out.println("Rate is not able to reach to destination");
		}
	
		}
	//method to check the move postion of the is safe or not
	 private static void displaysolution(int[][] solution) {
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(solution[i][j] + " ");
			}
			System.out.println();//move to next row 
		}
		
	}
	static boolean solveMaze(int[][] maze, int[][] solution, int x, int y) {
       
		//if the rat reached to destination
		if(x==N-1 && y==N-1) {
			solution[x][y]=1;
			return true;
		}
		
		if(issafe(maze,x,y)) {
			//mark the cell as 1 for solution
			solution[x][y]=1;
			
			//move to right
			if(solveMaze(maze, solution, x, y+1))
				return true;
			
			//move to down
			if(solveMaze(maze, solution, x+1, y))
			return true;
			
			//mark all the blocked or not chosen co-ordinate as 0
			solution[x][y]=0;
		}
		
		return false;
	}
	private static boolean issafe(int[][] maze, int x, int y) {
		return (x>=0 && x<N && y>=0 && y<N && maze[x][y]==1);//rate path is safe
	}

}
