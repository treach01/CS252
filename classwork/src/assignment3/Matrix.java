package assignment3;

public class Matrix {
	private int rows;
	private int cols;
	private int matrix[][];		// only allows integer inputs 
	
	public Matrix(int rows, int cols)
	{ 	this.rows=rows;
		this.cols=cols;
		this.matrix = new int[rows][cols];}
	
	public int[][] addMatrix(int nmat[][]) {
		int newm[][] = new int[rows][cols];
		int i = 0;
		int j = 0;
		for(; i < rows; i++)
			{for(; j < cols; j++)
				{newm[i][j] = matrix[i][j] + nmat[i][j];}
		if(i < nmat.length || j < nmat[0].length)
				{System.out.println("Matrices cannot be added");}}
		return newm;
	}
	
	public int[][] multmatrix(int nmat[][])
	{	int newm[][] = new int[rows][cols];
		int i = 0;
		int j = 0;
		for(; i < rows; i++)
		{for(; j < cols; j++)
			{newm[i][j] = matrix[i][j] * nmat[i][j];}}
		return newm;}		
	
	
	public void setelem(int i, int j, int x)
	{ matrix[i][j]	= x;}
	
	public int getRows() {
		return rows;}
	public void setRows(int rows) {
		this.rows = rows;}
	public int getCols() {
		return cols;}
	public void setCols(int cols) {
		this.cols = cols;}}
