Last login: Sun Jul 20 17:00:55 on ttys001
                                                                                

jason@JasonsMac\n\nJasonsMac ~ % jshell
|  Welcome to JShell -- Version 17.0.12
|  For an introduction type: /help intro

jshell> int[] arr = {28,3,55,6,77,29,32,10,14,56,17,19,4,2,8};
arr ==> int[15] { 28, 3, 55, 6, 77, 29, 32, 10, 14, 56, 17, 19, 4, 2, 8 }

jshell> int leastPos =0;
leastPos ==> 0

jshell> int tempHolder =0;
tempHolder ==> 0

jshell> for (int i = 0; i <15-1; i++){
   ...>     leastPos = i;
   ...>     for (int j = i+1; j<15; j++){
   ...>         if (arr[j]<arr[leastPos]){
   ...>             leastPos = j;
   ...>         }
   ...>     }
   ...>     if (leastPos != i){
   ...>         tempHolder = arr[i];
   ...>         arr[i] = arr[leastPos];
   ...>         arr[leastPos] = tempHolder;
   ...>     }
   ...> }

jshell> for (int i =0; i<15; i++){
   ...>     System.out.print(arr[i] + " ");
   ...> }
2 3 4 6 8 10 14 17 19 28 29 32 55 56 77 
jshell> 
