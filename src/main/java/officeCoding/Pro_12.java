package officeCoding;

import java.util.*;

/**
 * 数值的整数次方
 *  给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 
 * @author Administrator
 *
 */
public class Pro_12 {

	public double Power(double base, int exponent) {
		if (base == 0.0 && exponent < 0)
			return 0.0;
		int abs = Math.abs(exponent);
		double result = pow(base, abs);
		if (exponent < 0)
			return 1 / result;
		return result;
	}

	public double pow(double base, int abs) {
		if (abs == 0)
			return 1.0;
		if (base == 1.0)
			return base;
		double re = pow(base, abs >> 1);
		re *= re;
		if ((abs & 1) == 1)
			return re * base;
		return re;
	}

}
