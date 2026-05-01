4-6
(a)
cnt1 = 1, cnt2 = 1
cnt1 = 1, cnt2 = 1
(b)
cnt1 = 0, cnt2 = 1
cnt1 = 1, cnt2 = 1
(c)
cnt1 = 0, cnt2 = 0
cnt1 = 1, cnt2 = 0

最初に、v1とv2というインスタンスが作成され、cnt1とcnt2が１に初期化された。
aの中でその結果が示されている。
その後、v1のインスタンスメソッドdec1()が実行され、v1インスタンスのcnt1がデクリメントされた。
bの中でその結果が示されている。
その後、クラスメソッドdec2が実行され、全てのインスタンスのcnt2がデクリメントされた。
cの中でその結果が示されている。

4-7
7.2
Number of MyVector instances is 3
V1 and v2 are different!
(5.0, 1.0)
(20.0, 26.0)
V2 and v3 are the same!
(20.0, 26.0)

3個のMyVectorインスタンスを作成しているため、3と表示される。
v1とv2は異なるベクトルであるため、falseが返り、differentと表示。
また、その二つのベクトルが表示される。
v2とv3は同じベクトルであるため、trueが返り、sameと表示。
v2のベクトルが表示される。


7.3
Number of MyVector instances is 3
V1 and v2 are different!
(5.0, 1.0)
(20.0, 26.0)
V2 and v3 are different!
(20.0, 26.0)
(20.0, 26.0)

どちらの比較もfalseが返ってきてしまった。
v1とv2を比較する際、比較するのはその中身ではなく、インスタンスの参照である。
したがって、中身が同じでも異なるインスタンスである
v2とv3では参照の違いによりfalseが返ってきてしまうと考えられる。