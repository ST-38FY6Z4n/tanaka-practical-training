package homework;

public class ColorAnalysis {

	//----------------------------------------------
	// クラス変数
	//----------------------------------------------

	String SeasonName; //パーソナルカラーの4シーズン名
	String Season_d_Name; //パーソナルカラーの12タイプ名
	boolean UnderTone; //True=イエローベース,False=ブルーべース
	int Hue; //色相レベル
	int Chroma; //彩度レベル
	int Value; //明度レベル
	String[] SuitColor; //似合う色の代表
	String[] NaturalObjects; //実際のもので例えると

	String[] aShowMax;

	//----------------------------------------------
	// ゲッター＆セッター
	//----------------------------------------------

	/*メイン項目*/
	/**
	 * @return seasonName
	 */
	public String getSeasonName() {
		return SeasonName;
	}

	/**
	 * @param seasonName セットする seasonName
	 */
	public void setSeasonName(String sn) {
		SeasonName = sn;
	}

	/**
	 * @return season_d_Name
	 */
	public String getSeason_d_Name() {
		return Season_d_Name;
	}

	/**
	 * @param season_d_Name セットする season_d_Name
	 */
	public void setSeason_d_Name(String sdn) {
		Season_d_Name = sdn;
	}

	/**
	 * @return underTone
	 */
	public boolean isUnderTone() {
		return UnderTone;
	}

	/**
	 * @param underTone セットする underTone
	 */
	public void setUnderTone(boolean ut) {
		UnderTone = ut;
	}

	/**
	 * @return hue
	 */
	public int getHue() {
		return Hue;
	}

	/**
	 * @param hue セットする hue
	 */
	public void setHue(int hu) {
		Hue = hu;
	}

	/**
	 * @return chroma
	 */
	public int getChroma() {
		return Chroma;
	}

	/**
	 * @param chroma セットする chroma
	 */
	public void setChroma(int ch) {
		Chroma = ch;
	}

	/**
	 * @return value
	 */
	public int getValue() {
		return Value;
	}

	/**
	 * @param value セットする value
	 */
	public void setValue(int va) {
		Value = va;
	}

	public void setMain(String sn, String sdn, Boolean ut, int hu, int ch,int va){
		SeasonName = sn;
		Season_d_Name = sdn;
		UnderTone = ut;
		Hue = hu;
		Chroma = ch;
		Value = va;

	}

	/*オプション項目*/
	/**
	 * @return suitColor
	 */
	public String[] getSuitColor() {
		return SuitColor;
	}

	/**
	 * @param suitColor セットする suitColor
	 */
	public void setSuitColor(String[] suitColor) {
		SuitColor = suitColor;
	}

	/**
	 * @return naturalObjects
	 */
	public String[] getNaturalObjects() {
		return NaturalObjects;
	}

	/**
	 * @param naturalObjects セットする naturalObjects
	 */
	public void setNaturalObjects(String[] naturalObjects) {
		NaturalObjects = naturalObjects;
	}


	//----------------------------------------------
	// メソッド
	//----------------------------------------------


	public void UnderToneDiscrimination(){ //アンダートーンの判別
		if(UnderTone==true){
			System.out.println("アンダートーン：イエローベース");
		}else{
			System.out.println("アンダートーン：ブルーベース");

		}
	}



		public void HueLevel(){ //色相レベルの出力
			if(Hue==1){
				System.out.println("色相：冷たい●－－－－暖かい");
			}else if(Hue==2){
				System.out.println("色相：冷たい－●－－－暖かい");
			}else if(Hue==3){
				System.out.println("色相：冷たい－－●－－暖かい");
			}else if(Hue==4){
				System.out.println("色相：冷たい－－－●－暖かい");
			}else if(Hue==5){
				System.out.println("色相：冷たい－－－－●暖かい");
			}
		}

		public void ChromaLevel(){ //彩度レベルの出力
			if(Chroma==1){
				System.out.println("彩度：柔らかい●－－－－強い");
			}else if(Chroma==2){
				System.out.println("彩度：柔らかい－●－－－強い");
			}else if(Chroma==3){
				System.out.println("彩度：柔らかい－－●－－強い");
			}else if(Chroma==4){
				System.out.println("彩度：柔らかい－－－●－強い");
			}else if(Chroma==5){
				System.out.println("彩度：柔らかい－－－－●強い");
			}
		}

		public void ValueLevel(){ //彩度レベルの出力
			if(Value==1){
				System.out.println("明度：明るい●－－－－強い");
			}else if(Value==2){
				System.out.println("明度：明るい－●－－－強い");
			}else if(Value==3){
				System.out.println("明度：明るい－－●－－強い");
			}else if(Value==4){
				System.out.println("明度：明るい－－－●－強い");
			}else if(Value==5){
				System.out.println("明度：明るい－－－－●強い");
			}
		}

	public void aShow() {//１タイプの内容をすべて出力
		System.out.println("大分類："+SeasonName);
		System.out.println("12タイプ名："+Season_d_Name);
		this.UnderToneDiscrimination();
		this.HueLevel();
		this.ChromaLevel();
		this.ValueLevel();
		System.out.print("似合うカラー：");
		for (int i=0; i<this.SuitColor.length; i++){
			if(i+1==this.SuitColor.length){
				System.out.print(this.SuitColor[i]);
			}else{
				System.out.print(this.SuitColor[i]+"、");
			}
		}
		System.out.println();
		System.out.print("例えるなら：");
		for (int i=0; i<this.NaturalObjects.length; i++){
			if(i+1==this.NaturalObjects.length){
				System.out.print(this.NaturalObjects[i]);
			}else{
				System.out.print(this.NaturalObjects[i]+"、");
			}
		}
		System.out.println();
		System.out.println("---------------------");
	}

	public void allShow() { //１２タイプの内容をすべて出力

		}
	}

