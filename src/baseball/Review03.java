package baseball;

public class Review03 {

    public static void main(String[] args) {

        // 引数ありのコンストラクトを使用してインスタンスを生成する
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        // レポートメソッドを呼び出す
        team01.report();
        // あとは繰り返し
        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        team02.report();
        BaseBallTeam team03 = new BaseBallTeam("阪神タイガーズ", 68, 71, 4);
        team03.report();
        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        team04.report();
        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        team05.report();
        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        team06.report();
    }

}
