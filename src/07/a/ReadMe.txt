7-2
a)
A1クラスの中でp.getYと記述しPointクラスのgetYメソッドを呼び出そうとしている。
しかし、getYメソッドはPointの中で、修飾子をつけずに定義されている。
この場合メソッドは同一パッケージ内でしか呼び出すことができなくなる。
今回の場合exerciseパッケージで定義されたのをquestionパッケージで呼び出そうとしているため、
アクセス制限に違反しているといえる。

b)
Point3DクラスのmoveYメソッドにおいて、y += dyのようにyにアクセスしようとしている。
yはPointクラスの中でprivateとして定義されており、サブクラスのPoint3Dクラスからでもアクセスはできない。

c)
ypos()メソッドの中で、getY()メソッドを呼び出している。
getYはpublicをつけずに定義されており、
たとえサブクラスであってもパッケージが違うクラスからは呼び出すことはできない。

7-3
0 jdk26

1
a Point2D
b Serializable, Cloneable
c equals, getLocation, getX, getY, move, setLocation, toString, translate

2
a
Integerクラスはint型のラッパークラスであり、
intがもつデータをオブジェクトに変換するためのクラスがIntegerである。
b 
AtomicInteger, AtomicLong, BigDecimal, BigInteger, Byte, Double, DoubleAccumulator, 
DoublAdder, Float, Float16, Long, LongAccumulator, LongAdder, Short

3 java.util.Randomクラス

4 String aNewString = aString.substring(1, 6);


7-4
listは要素の型がStringに限定されたArrayListである。
ここにPoint型のPointクラスのインスタンスを追加することはできない。

