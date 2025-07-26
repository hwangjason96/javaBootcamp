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

