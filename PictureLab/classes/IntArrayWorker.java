public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

    /**
     * Returns the count of the number of times a passed integer value is found in the matrix
     *
     * @pre     matrix is created
     * @post    everything is unchanged, count is returned
     * @param   check   the integer that is checked for the number of times it is found
     *                  in the matrix
     * @return  the count of how many times check was found in the matrix
     */
    public int getCount(int check)
    {
        int count = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length;col++)
            {
                if (matrix[row][col] == check){
                    count++;
                }
            }
        }

        return count;
    }

    /**
     * Returns the largest value found in the matrix
     *
     * @pre     matrix is created
     * @post    matrix is unchanged and largest value is returned
     * @return  the largest value in the matrix
     */
    public int getLargest()
    {
        int largest = matrix[0][0];
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length;col++)
            {
                if (matrix[row][col] > largest){
                    largest = matrix[row][col];
                }
            }
        }

        return largest;
    }
    
    /**
     * Returns the total of all integers in a specified column
     *
     * @pre     matrix is created
     * @post    matrix is unchanged and largest value is returned
     * @param   
     * @return  the largest value in the matrix
     */
    public int getColTotal(int column)
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            total+=matrix[row][column];
        }

        return total;
    }

}