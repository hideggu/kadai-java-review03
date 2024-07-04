package baseball;

public class BaseBallTeam {

    //　フィールドを設定する
    private String name; // チーム名
    private int win; // 勝利数
    private int lose; // 敗北数
    private int draw; // 引き分け数

    // 引数ありのチームのコンストラクタを作成
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率を計算するためのメソッドを作成
    public double getRate() {
        //　勝率を計算する　勝ち数/（勝ち数+負け数) this.winがintのママだと結果が0.0になるので、double型にキャストする
       double winRate = (double) this.win / ( this.win + this.lose );
       //　結果を返す
       return winRate;
    }

    // レポートを生成するメソッドを作成
    public void report() {
        // 勝率の結果をgetRateメソッドから呼び出し
        double winRate = getRate();
        // レポートを生成
        System.out.println(this.name + "　の2022年の成績は　" + this.win + "勝　" + this.lose + "負　" + this.draw + "分、勝率は　" + (double) winRate + "です。");
    }
}

