package com.example.demo20240509;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyValidation {

//	public String descNull="Nullかどうか判定します。";
//	@Null
//	private String isNull;
	
	public String descNotNull="NotNullであるか判定します";
	@NotNull
	private String isNotNull;
	
	public String descRange="数字の範囲を判定します。";
	@Range(min=2,max=1024,message="2~1024の数字を入力してください。")
	private int isOptRange;
	
	public String descMin="指定した最小値(20)より大きいか判定します。";
	@Min(20)
	private int moreThan20;
	
//	public String descDate="日付の形式を判定します。yyyy-MM-ddの形式で入力してください。";
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private LocalDate birthday;

	
	
//	public String getIsNull() {
//		return isNull;
//	}
//
//	public void setIsNull(String isNull) {
//		this.isNull = isNull;
//	}

	public String getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(String isNotNull) {
		this.isNotNull = isNotNull;
	}

	public int getIsOptRange() {
		return isOptRange;
	}

	public void setIsOptRange(int isOptRange) {
		this.isOptRange = isOptRange;
	}

	public int getMoreThan20() {
		return moreThan20;
	}

	public void setMoreThan20(int moreThan20) {
		this.moreThan20 = moreThan20;
	}
/*
//	public LocalDate getBirthday() {
//		return birthday;
//	}
//
//	public void setBirthday(LocalDate birthday) {
//		this.birthday = birthday;
//	}
	*/
	
	
}
