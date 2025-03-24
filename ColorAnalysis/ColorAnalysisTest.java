package homework;

public class ColorAnalysisTest {

	//クラスの作成練習（題材：https://www.spicemarketcolour.com.au/12-palettes-12-seasons）
	//反省点：個人情報ではないのでカプセル化する意味があまりなかった

	public static void main(String[] args) {


		ColorAnalysis color1 = new ColorAnalysis();
		color1.setMain("Spring",  "Bright Spring", true, 4, 5, 2);
		String[] suit1 = {"ホットピンク","マリーゴールド","パラキートグリーン","エレクトリックオレンジ等のビタミンカラー"};
		color1.setSuitColor(suit1);
		String[] naturalob1 = {"ジャングル","ギリシャの島々","サンゴ礁","金魚","ひまわり"};
		color1.setNaturalObjects(naturalob1);

		ColorAnalysis color2 = new ColorAnalysis();
		color2.setMain("Spring",  "True Spring", true, 5, 4, 2);
		String[] suit2 = {"サンゴ","ターコイズ","キンポウゲ","キャメル等の黄色を基調とした完全な暖色"};
		color2.setSuitColor(suit2);
		String[] naturalob2 = {"南太平洋のラグーン","鮮やかな新芽","フルーツサラダ","輝く太陽","トロピカルカクテル"};
		color2.setNaturalObjects(naturalob2);

		ColorAnalysis color3 = new ColorAnalysis();
		color3.setMain("Spring",  "Light Spring", true, 4, 3, 1);
		String[] suit3 = {"ライトピーチ","ティファニーブルー","淡いゴールド","ライムミント等の軽く穏やかで若々しい色"};
		color3.setSuitColor(suit3);
		String[] naturalob3 = {"ジェラート","赤ちゃん動物","柔らかい砂","イースターの卵"};
		color3.setNaturalObjects(naturalob3);

		ColorAnalysis color4 = new ColorAnalysis();
		color4.setMain("Summer",  "Light Summer", false, 2, 3, 1);
		String[] suit4 = {"レモンバター","フレンチブルー","ラズベリーローズ","ペリウィンクル等の明るく爽やかなそよ風の色"};
		color4.setSuitColor(suit4);
		String[] naturalob4 = {"桜","ワスレナグサ","レモンメレンゲパイ","乳白色の虹"};
		color4.setNaturalObjects(naturalob4);

		ColorAnalysis color5 = new ColorAnalysis();
		color5.setMain("Summer",  "True Summer", false, 1, 2, 2);
		String[] suit5 = {"ローズ","トープ","スレート","パウダーブルー","ペリウィンクル等の涼しげでエレガントで完全な寒色"};
		color5.setSuitColor(suit5);
		String[] naturalob5 = {"霧のかかった朝","クラシックなピンクのバラ","錫(すず)","大理石","午後の雨"};
		color5.setNaturalObjects(naturalob5);

		ColorAnalysis color6 = new ColorAnalysis();
		color6.setMain("Summer",  "Soft Summer", false, 2, 1, 3);
		String[] suit6 = {"ボーン","ミンク","カシス","ペリウィンクル等のスモーキーで神秘的な色"};
		color6.setSuitColor(suit6);
		String[] naturalob6 = {"アヒルの卵","セージ","ブルーストーン","遠くの山々","流木のビンテージ"};
		color6.setNaturalObjects(naturalob6);

		/*
		 *内容をすべて出力
		 */

		System.out.println("Color Analysis - 12 Season Color Palettes");
		System.out.println("------------------------------------------");
		color1.aShow();
		color2.aShow();
		color3.aShow();
		color4.aShow();
		color5.aShow();
		color6.aShow();
//		color7.aShow();
//		color8.aShow();
//		color9.aShow();
//		color10.aShow();
//		color11.aShow();
//		color12.aShow();
	}

}
