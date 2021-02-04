package com.android.example.module15_module30_module1;

public class ClassAAE {
	private 	com.android.example.module15_module20_module1.ClassAAF instance_var_1_0 = new com.android.example.module15_module20_module1.ClassAAF();
	private 	com.android.example.module15_module20_module1.ClassAAD instance_var_1_1 = new com.android.example.module15_module20_module1.ClassAAD();
	private 	com.android.example.module15_module21_module1.ClassAAF instance_var_1_2 = new com.android.example.module15_module21_module1.ClassAAF();

	public void method0(
		com.android.example.module15_module21_module1.ClassAAG param0,
		com.android.example.module15_module21_module1.ClassAAE param1,
		com.android.example.module15_module20_module1.ClassAAI param2) throws Throwable {
		for (int iAb = 0; iAb < 1; iAb++) {
			param0.method0("SomeString", "SomeString", "SomeString");

			java.util.Collections.emptyList().forEach( lambda0 -> {
				try {
					param0.method0("SomeString", "SomeString", "SomeString");

					param0.method1("SomeString", "SomeString");

				} catch(Throwable e) { } // ignore
			});
			com.android.example.module15_module21_module1.ClassAAB local_var_3_0 = new com.android.example.module15_module21_module1.ClassAAB();
			local_var_3_0.method2("SomeString", "SomeString", "SomeString");

		}
	}

	public void method1(
		com.android.example.module15_module20_module1.ClassAAA param0,
		com.android.example.module15_module20_module1.ClassAAJ param1,
		com.android.example.module15_module21_module1.ClassAAE param2,
		com.android.example.module15_module20_module1.ClassAAJ param3) throws Throwable {
		param0.method0(new com.android.example.module15_module21_module1.ClassAAI(), new com.android.example.module15_module21_module1.ClassAAB(), new com.android.example.module15_module21_module1.ClassAAE(), new com.android.example.module15_module21_module1.ClassAAD());

		param0.method3(new com.android.example.module15_module21_module1.ClassAAF(), new com.android.example.module15_module21_module1.ClassAAE(), new com.android.example.module15_module21_module1.ClassAAC());

	}
}
