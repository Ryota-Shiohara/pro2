6-6
6.5

Hexagonのdraw関数はvertexのサブクラスそれぞれのインスタンスの参照を受け取っている。
RectVertex, CrossVertex, HexVertexはvertexを継承しており、
それらがオーバーライドしているdraw関数を呼んでいることになるため、
正常に頂点が描かれる。
