//arr[i][j] arr[0]表示数组的第0个元素
//arr.length 二维数组有几个元素，每个元素是一个一维数组，取出里面的值还要遍历
//arr[i].length 一个元素里面有几个东西

int[][] arr={{10,0,0},{1,2,3},{3,2,5};
int sum =0;
for(int i = 0; i<arr.length;i++){
  for(int j= 0; j<arr[i].length; j++){
    sum=+arr[i][j];//二维数组所有元素求和
    System.out.println(arr[i][j]+" ");//遍历打印二维数组
  }
  System.out.println();
}

int[][] a = new int[2][3];
