8-1
Throw1:

Program = Java
OK! Let's program!
Exception in thread "main" java.lang.Exception: I don't know Smalltalk!
        at Throw1.methodA(Throw1.java:4)
        at Throw1.main(Throw1.java:10)

methodAを呼び出す際、javaを引数として与えたときは例外でなく処理され、
Program = Java
OK! Let's program!
が出力される。
Smalltalkを引数として与えたときは例外がスローされ、tryで囲まれてもいないためエラーとなり、
I don't know Smalltalk!
が投げられた。

Throw2:

Program = Java
OK! Let's program!
I don't know Smalltalk!
The actual end

methodAを呼び出す際、javaを引数として与えたときは例外でなく処理され、
Program = Java
OK! Let's program!
が出力される。
Smalltalkを引数として与えたときは例外としてひっかかるが、
tryで囲まれているためcatchされ、エラーメッセージの
I don't know Smalltalk!
を出力できた。
ここで処理が中断されるため、
The endは出力されず、try節の下のThe actual endが出力された。


Throw3:

The finally program is Java
Program = Java
OK! Let's program!
The finally program is Smalltalk
I don't know Smalltalk!
The actual end

methodAを呼び出す際、javaを引数として与えたときは例外でなく処理され、
try-catch節を通過しfinallyのThe finally program is Javaが出力される。
その後、
Program = Java
OK! Let's program!
が出力される。
Smalltalkを引数として与えたときは例外としてひっかかるが、
finallyのThe finally program is Javaが出力される。
呼び出し元のmainもtryで囲まれているためcatchされ、エラーメッセージの
I don't know Smalltalk!
を出力できた。
ここで処理が中断されるため、
The endは出力されず、try節の下のThe actual endが出力された。



8-2
Before a
Before b
Before c
c: finally
b: finally
a: java.lang.NumberFormatException: For input string: "6.12"
a: finally
After a
main: finally

mainの中でaを,
aの中でbを、bの中でcを階層的に呼び出している。
cにおいてNumberFormatExceptionが発生し、
finallyが呼ばれた後呼び出し元に投げられるが、
bのcatchはArithmeticExceptionを想定しており、
NumberFormatExceptionをキャッチできず、finallyを実行しそのまま上に投げられる。
aのcatch節においてこの例外がキャッチされて出力される。
キャッチしたため例外はこれ以上伝播せず、mainのafter aも出力される。
最終的にmainのfinallyも呼ばれる。

8-3
ArithmeticExceptionをエラーとしてキャッチしようとしているが、
その以前の段階でスーパークラスのExceptionをキャッチしているため、
そのサブクラスであるArithmeticExceptionもキャッチされ、
実行されることはないため。