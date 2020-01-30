public class Rain {

    public static void main(String[] args){
        double[][] rainfall = {
                {2.07, 2.86, 1.64, 3.80, 5.00, 4.55, 2.95, 4.26, 4.82, 3.08, 2.67, 2.76},
                {0.74, 1.95, 0.64, 1.82, 4.10, 4.46, 8.34, 2.47, 4.66, 7.01, 2.69, 3.01},
                {2.48, 1.67, 4.22, 5.47, 7.46, 3.11, 1.65, 1.42, 3.70, 2.64, 2.89, 3.02},
                {1.27, 3.45, 3.72, 2.55, 6.39, 2.36, 8.01, 4.64, 10.37, 2.68, 3.64, 3.48}
        };

        double[] monthlyAverage = new double [rainfall[0].length];
        double[] yearlyAverage = new double [rainfall.length];

        /*int[][] test = {
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13}
        };

        for(int num: test[1]){
            System.out.println(num);
        }
        System.out.println(test[1][1]);*/

        //ENTER INFORMATION INTO THE 2D ARRAY
        /*for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[0].length; col++){
                rainfall[row][col] = read.nextDouble();
            }
        }*/

        //Calculate Monthly Average Rainfall
        for(int col = 0; col < rainfall[0].length; col++){
            for(int row = 0; row < rainfall.length; row++){
                monthlyAverage[col] += rainfall[row][col];
            }
            monthlyAverage[col] /= rainfall.length;
        }

        //Calculate the YEARLY average rainfall
        for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[0].length; col++){
                yearlyAverage[row] += rainfall[row][col];
            }
           yearlyAverage[row] /= rainfall[0].length;
        }


        //OUTPUT ARRAY AND MONTHLY RAINFALL
        for(int row = 0; row < rainfall.length; row++){
            for(int col = 0; col < rainfall[0].length; col++){
                System.out.print(rainfall[row][col] + "\t");
            }
            System.out.println();
        }
        for(int i = 0; i < monthlyAverage.length; i++){
            System.out.println(monthlyAverage[i] + "\t");
        }

        for(double num: yearlyAverage){
            System.out.println(num);
        }

    }
}
