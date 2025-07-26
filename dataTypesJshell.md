Last login: Fri Jul 25 17:26:21 on ttys001
                                                                                

jason@JasonsMac\n\nJasonsMac ~ % jshell
|  Welcome to JShell -- Version 17.0.12
|  For an introduction type: /help intro

jshell> System.out.print(Integer.MIN_VALUE);
-2147483648
jshell> System.out.print(Integer.MAX_VALUE);
2147483647
jshell> System.out.print(Float.MAX_VALUE);
3.4028235E38
jshell> System.out.print(Float.MIN_VALUE);
1.4E-45
jshell> System.out.print(Bool.MIN_VALUE);
|  Error:
|  cannot find symbol
|    symbol:   variable Bool
|  System.out.print(Bool.MIN_VALUE);
|                   ^--^

jshell> System.out.print(Boolean.MIN_VALUE);
|  Error:
|  cannot find symbol
|    symbol:   variable MIN_VALUE
|  System.out.print(Boolean.MIN_VALUE);
|                   ^---------------^

jshell> System.out.print(bool.MIN_VALUE);
|  Error:
|  cannot find symbol
|    symbol:   variable bool
|  System.out.print(bool.MIN_VALUE);
|                   ^--^

jshell> System.out.print(boolean.MIN_VALUE);
|  Error:
|  class expected
|  System.out.print(boolean.MIN_VALUE);
|                           ^

jshell> System.out.print(double.MIN_VALUE);
|  Error:
|  class expected
|  System.out.print(double.MIN_VALUE);
|                          ^

jshell> System.out.print(char.MIN_VALUE);
|  Error:
|  class expected
|  System.out.print(char.MIN_VALUE);
|                        ^

jshell> System.out.print(Char.MIN_VALUE);
|  Error:
|  cannot find symbol
|    symbol:   variable Char
|  System.out.print(Char.MIN_VALUE);
|                   ^--^

