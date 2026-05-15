6-1
a) true
b) true
c) false
d) true
e) true
f) true

a:XがXのクラスなのは当然なので自明にtrue
b:YがYのクラスなのは当然なので自明にtrue
c:XはYの祖先ではあるが子孫ではないためfalse
d:YはXの子孫であるためtrue
e:全てのクラスはObjectの子孫であるためtrue
f:全ての句足すはObjectの子孫であるためtrue

6-2
TはSを継承しており、methodSをオーバーライドしようとしているが、
methodSはSにおいてfinalを使って定義されているため、
オーバーライドが禁止されているから。

6-3

3-1
(A, B, C, D, IX, IYはメインメソッドを持たないため単体実行できない。)

A is called
B is called
D is called
C is called
IX is shown
D is called
D is shown
IY is shown

testClass(a)にてAのshowMessageが呼ばれ、"A is called"
BはAを継承しており、メソッドをオーバーライドしているため"B is called"
DはAを継承しており、メソッドをオーバーライドしているため"D is called"
CはIXを実装しており、メソッドをオーバーライドしているため"C is called"
また、C内でshowが定義されていないため、IXで定義されたデフォルトのshowメソッドが呼ばれ、"IX is shown"
DはインターフェースIXを実装しているため、"D is called"
また、showメソッドをオーバーライドしており、"D is shown"
その中でIYのshowメソッドも呼んでいるため"IY is shown"


3-2
CはAを継承していないためtestClassの引数としてCのインスタンスを与えることはできないから。