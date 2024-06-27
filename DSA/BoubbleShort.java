import java.util.*;
// ---------->Boubble Short <-----------


//                                                  default
//                                           --------------------------------

// public class Main 
// {
//     public static void main(String[] args) 
//     {
//       int[] a = {2,4,1,6,3,7,5};
//       for (int i = 0;i<a.length ;i++ )
//       {
//         for (int j = 0;j<a.length-1 ;j++ )
//         {
//           if (a[j] > a[j+1])
//           {
//             int temp = a[j];
//             a[j] = a[j+1];
//             a[j+1] = temp;
//           }
//         }
//       }
//       for (int i=0; i<a.length; i++)
//       {
//         System.out.println(a[i]);
//       }
//   }
// }

//                                      this way skipped the altready shorted array
                                    // -------------------------------------------------------

// public class Main
// {
//   public static void main (String[] args) 
//   {
//     int[] a = {2,4,1,6,3,7,5};
//     for (int i =0; i<a.length;i++ )
//     {
//       for (int j=0;j<a.length-1-i ;j++ )
//       {
//         if (a[j]>a[j+1])
//         {
//           int temp = a[j];
//           a[j]= a[j+1];
//           a[j+1] = temp;
//         }
//       }
//     }
//     for (int i = 0; i<a.length; i++) 
//     {
//       System.out.println(a[i]);
//     }
//   }  
// }


//                          IF the array sorted before the end of rounds it will be break 


// public class main
// {
//   public static void main (String[] args) 
//   {
//     int[] a = {2,4,1,6,3,7,5};
//     for (int i=0; i<a.length; i++)
//     {
//       int flag = 0;
//       for (int j = 0;j<a.length-1-i ; j++)
//       {
//         if (a[j]>a[j+1])
//         {
//           int temp = a[j];
//           a[j]= a[j+1];
//           a[j+1] = temp;
//           flag = 1;
//         }
//       }
//       if (flag ==0)
//       {
//         break;
//       }
//     }
//     for (int i=0;i<a.length ;i++ )
//     {
//       System.out.println(a[i]);
//     }
//   }
// }