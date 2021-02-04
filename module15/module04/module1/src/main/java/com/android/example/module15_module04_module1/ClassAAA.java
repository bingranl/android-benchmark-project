package com.android.example.module15_module04_module1;

public class ClassAAA {
	private 	com.android.example.module15_module24_module1.ClassAAC instance_var_1_0 = new com.android.example.module15_module24_module1.ClassAAC();
	private 	com.android.example.module15_module21_module1.ClassAAG instance_var_1_1 = new com.android.example.module15_module21_module1.ClassAAG();
	private 	com.android.example.module15_module50_module1.ClassAAD instance_var_1_2 = new com.android.example.module15_module50_module1.ClassAAD();

	public void method0(
		com.android.example.module15_module24_module1.ClassAAE param0,
		com.android.example.module15_module50_module1.ClassAAG param1,
		com.android.example.module15_module50_module1.ClassAAH param2,
		com.android.example.module15_module50_module1.ClassAAH param3) throws Throwable {
	}

	public void method1(
		com.android.example.module15_module21_module1.ClassAAG param0,
		com.android.example.module15_module21_module1.ClassAAC param1) throws Throwable {
		com.android.example.module15_module21_module1.ClassAAC local_var_2_2 = new com.android.example.module15_module21_module1.ClassAAC();
		local_var_2_2.method2("SomeString", "SomeString", "SomeString", "SomeString");

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.method1("SomeString", "SomeString");

			} catch(Throwable e) { } // ignore
		});
		com.android.example.module15_module21_module1.ClassAAG local_var_2_3 = new com.android.example.module15_module21_module1.ClassAAG();
		local_var_2_3.method0("SomeString", "SomeString", "SomeString");

		com.android.example.module15_module50_module1.ClassAAD local_var_2_4 = new com.android.example.module15_module50_module1.ClassAAD();
		local_var_2_4.method0(new com.android.example.module15_module21_module1.ClassAAC());

	}
}
