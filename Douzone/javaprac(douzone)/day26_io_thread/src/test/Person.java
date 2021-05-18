package test;

public class Person {
	String name, result;
	float height =  0;
	float weight =  0;
	float tempB;


	public float getHeight() {
		return height;
	}

	public void setHeight(float f) {
		this.height = f;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String setBmi() {
		// TODO Auto-generated method stub
		if(height == 0 || weight == 0) {
			return "키 또는 몸무게 미입력.";			
		} else {
			tempB = weight/(height*height/10000);
			return "BMI 계산 완료.";
		}		
	}

	public float getBmi() {
		// TODO Auto-generated method stub
		return tempB;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public float getTempB() {
		return tempB;
	}

	public void calBMI() {
		if(tempB<18.5) {
    		setResult("저체중");
    	}
	    else if(tempB<23.0) {
	       	setResult("정상");
	    }
    	else if(tempB<25.0) {
	    	setResult("과체중");
	    }
	    else {
		    setResult("비만");
	    }
				
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", result=" + result + ", height=" + height + ", weight=" + weight + ", BMI="
				+ tempB + "]";
	}




}
