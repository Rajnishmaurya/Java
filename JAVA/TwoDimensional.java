public class TwoDimensional {
    public static void main(String[] args) {
        // int nums[][]=new int[3][4]; 

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         nums[i][j]=(int)(Math.random()*100);
        //    }
        // }

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        // for(int n[]:nums)
        // {
        //     for(int m:n)
        //     System.out.print(m +" ");

        //     System.out.println();
        // }


        int nums[][]=new int[3][];  // jagged array
        nums[0]=new int[4];
        nums[1]=new int[3];
        nums[2]=new int[5]; 

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=(int)(Math.random()*100);
           }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        for(int n[]:nums)  //enhanced for loops
        {
            for(int m:n)
            System.out.print(m +" ");

            System.out.println();
        }

    }
}
