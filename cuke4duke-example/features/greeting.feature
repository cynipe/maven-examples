# language:ja_JP
機能: 挨拶を返せる
  時節に合わせた挨拶を返せる。
  現在対応しているのは普段、正月の場合の挨拶。
  行頭のlanguageを指定しないと日本語でのStep名の記述は不可能。

  シナリオ: 友人に対してする普段の挨拶
    前提 挨拶する相手が友人の場合
    もし 普段の挨拶を返す
    ならば 挨拶は「おいすー！」が返される

  シナリオ: 知人に対してする普段の挨拶
    前提 挨拶する相手が知人の場合
    もし 普段の挨拶を返す
    ならば 挨拶は「どうも。」が返される

  シナリオ: 変な人に対してする普段の挨拶
    前提 挨拶する相手が変な人の場合
    もし 普段の挨拶を返す
    ならば 挨拶は「え、誰？」が返される

  シナリオ: 友人に対してする正月の挨拶
    前提 挨拶する相手が友人の場合
    もし 正月の挨拶を返す
    ならば 挨拶は「あけおめー！」が返される

  シナリオ: 知人に対してする正月の挨拶
    前提 挨拶する相手が知人の場合
    もし 正月の挨拶を返す
    ならば 挨拶は「明けましておめでとうございます。」が返される

  シナリオ: 変な人に対してする正月の挨拶
    前提 挨拶する相手が変な人の場合
    もし 正月の挨拶を返す
    ならば 挨拶は「え、誰？」が返される
