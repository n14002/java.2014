class Ex3{

<<<<<<< HEAD
  public String ex3_0(int n){
    if (n > 0){
      return "その値は正です";
    } else {
      return "その値は０か負です";
    }
  }

  public int ex3_1(int n){
    return Math.abs(n);
  }

  public String ex3_2(int a, int b){
    if (a % b == 0){
      return b + "は" + a + "の約数です";
    } else {
      return b + "は" + a + "の約数ではありません";
    }
  }

  public String ex3_3(int a, int b){
    if (a > b){
      return a + "の方が大きいです"; 
    }else if(b > a){ 
      return b + "の方が大きいです"; 
    }else{
      return "同じ値です"; 
    }
  }

  public String ex3_4(int a){
    if (a < 0){
      return "正でない整数値です"; 
    }else if (a % 5 == 0){
      return "その値は5で割り切れます"; 
    }else{
      return "その値は5で割り切れません"; 
    }
  }

  public String ex3_5(int a){
    if (a < 0){
      return "正でない整数値です"; 
    }else if (a % 10 == 0){
      return "その値は10の倍数です";  
    }else{
      return "その値は10の倍数ではありません"; 
    }
  }

  public String ex3_6(int a){
    if (a < 0){
      return "正でない整数値です"; 
    }else if (a % 3 == 0){
      return "その値は3で割り切れます"; 
    }else if (a % 3 == 1){
      return "その値を3で割った余りは1です"; 
    }else{
      return "その値を3で割った余りは2です"; 
    }
  }

  public String ex3_7(int a){
    if (a >= 0 && a <= 59){
      return "不可";
    }else if (a >= 60 && a <= 69){
      return "可"; 
    }else if (a >= 70 && a <= 79){
      return "良"; 
    }else if (a >= 80 && a <= 100){
      return "優"; 
    }else{
      return "範囲(0～100)外の値です";  
    }
  }

  public double ex3_8(double a, double b){
    return Math.max(a, b);
  }

  public int ex3_9(int a, int b){
    return Math.abs(a - b);
  }

  public String ex3_10(int a, int b){
    if (Math.abs(a -b)< 11 ){
      return "それらの差は10以下です"; 
    }else{
      return "それらの差は11以上です"; 
    }   
  }
=======
	public String ex3_0(int n){

		return "dummy";

	}

	public int ex3_1(int n){
		
		return -1;

	}

	public String ex3_2(int a, int b){

		return "dummy";
	}

	public String ex3_3(int a, int b){

		return "dummy";

	}

	public String ex3_4(int a){

		return "dummy";

	}

	public String ex3_5(int a){

		return "dummy";
	}
	
	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
		return 0;
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}

	public int ex3_11(int a, int b, int c){
		return 1000;
	}

	public int ex3_12(int a, int b, int c){
		return 1000;
	}

	public String ex3_13(int a){
		return "dummy";
	}
>>>>>>> 5ed69a212be21df89e58805e36fb2b9d1d1fb0f5
}

